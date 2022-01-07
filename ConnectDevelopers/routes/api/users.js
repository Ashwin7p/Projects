const express = require("express");
const router = express.Router();
const jwt = require("jsonwebtoken");
const config = require("config");
const { check, validationResult } = require("express-validator");
const gravatar = require("gravatar");
const bcrypt = require("bcryptjs");
const User = require("../../models/User");

// @route    Post api/users
// @desc     REgister User
// @access   Public
router.post(
  "/",
  [
    check("name", "Name is required").not().isEmpty(),
    check("email", "Valid email required").isEmail(),
    check("password", "Please enter a password with min 6 charater").isLength({
      min: 6,
    }),
  ],
  async (req, res) => {
    console.log(req.body);
    const errors = validationResult(req);
    if (!errors.isEmpty()) {
      return res.status(400).json({ errors: errors.array() });
    }
    const { name, email, password } = req.body; //de-structure
    try {
      //See is User Exists
      let user = await User.findOne({ email });
      if (user) {
        return res
          .status(400)
          .json({ errors: [{ msg: "User already Exists" }] });
      }
      //Get users gravatar
      const avatar = gravatar.url(email, { s: "200", r: "pg", d: "mm" }); //s-> size, r-> reading(pg -> no naked),mm-> default icon(mm)

      user = new User({
        name,
        email,
        avatar,
        password,
      });
      //Encrypt password
      const salt = await bcrypt.genSalt(10); //rounds=10do the hashing with
      user.password = await bcrypt.hash(password, salt);
      await user.save();
      //Return jsonwebToken(for user to get logged id in after register in frontend)
      const payload = {
        user: {
          id: user.id, //not required _id as mongoose handles
        },
      };
      jwt.sign(
        payload,
        config.get("jwtSecret"),
        { expiresIn: 360000 },
        (err, token) => {
          if (err) throw err;
          res.json({ token });
        }
      );

      //res.send("User Registered");
    } catch (err) {
      console.error(err.message);
      res.status(500).send("Server error");
    }
  }
);

module.exports = router;
