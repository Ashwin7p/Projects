const jwt = require("jsonwebtoken");
const config = require("config");

module.exports = function (req, res, next) {
  //Get Token from header
  const token = req.header("x-auth-token");
  console.log(token);
  //check if no token
  if (!token) {
    return res.status(401).json({ msg: "No token, auth denied" });
  }

  //Verify token
  try {
    const decoded = jwt.verify(token, config.get("jwtSecret"));
    req.user = decoded.user;
    next();
  } catch (err) {
    console.log(err);
    res.status(401).json({ msg: "Token is not valid" });
  }
};
