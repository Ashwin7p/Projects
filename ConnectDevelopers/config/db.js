const mongoose = require("mongoose");
const config = require("config"); //create a default.json in config folder for global creds
const db = config.get("mongoURI");

const connectDB = async () => {
  try {
    await mongoose.connect(db, {
      useNewUrlParser: true,
      useUnifiedTopology: true,
      useCreateIndex: true,
      useFindAndModify: false,
    }); //returns a promise
    console.log("MongoDb connected..");
  } catch (err) {
    console.error(err.message);
    //Exit process with failure
    process.exit(1);
  }
};

module.exports = connectDB;
