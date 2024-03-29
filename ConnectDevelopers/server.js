const express = require("express");
const connectDB = require("./config/db");
const app = express();
const path = require("path");

connectDB();

//Init MiddleWare
app.use(express.json({ extended: false }));

//app.get("/", (req, res) => res.send("API Running"));

//Define Routes
app.use("/api/users", require("./routes/api/users"));
app.use("/api/auth", require("./routes/api/auth"));
app.use("/api/profile", require("./routes/api/profile"));
app.use("/api/posts", require("./routes/api/posts"));

//Serve static assets in Production
if (process.env.NODE_ENV === "production") {
  //set static folder
  app.use(express.static("client/build"));

  app.get("*", (req, res) => {
    res.sendFile(path.resolve(__dirname, "client", "build", "index.html"));
  });
}
folder;
const PORT = process.env.PORT || 5000;

app.listen(PORT, () => {
  console.log(`Server started ${PORT}`);
});
