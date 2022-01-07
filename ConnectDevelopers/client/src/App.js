import "./App.css";
import React, { Fragment, useEffect } from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Navbar from "./components/layout/Navbar";
import Landing from "./components/layout/Landing";
import Register from "./components/auth/Register";
import Login from "./components/auth/Login";
import Alert from "./components/layout/Alert";
import Dashboard from "./components/dashboard/Dashboard";
import PrivateRoute from "./components/routing/PrivateRoute";
import setAuthToken from "./utils/setAuthToken";
import { loadUser } from "./actions/auth";
import profileForm from "./components/profile-forms/CreateProfile";
import AddExperience from "./components/profile-forms/AddExperience";
import AddEducation from "./components/profile-forms/AddEducation";
import Profiles from "./components/Profiles/Profiles";
import Profile from "./components/profile/Profile";
import Posts from "./components/posts/Posts";
import Post from "./components/post/Post";
//Redux

import { Provider } from "react-redux"; //connects react and redux
import store from "./store";
import { createProfile } from "./actions/profile";

if (localStorage.token) {
  //WHEN USER LOADS
  setAuthToken(localStorage.token);
}

const App = () => {
  useEffect(() => {
    store.dispatch(loadUser());
  }, []); //run once , not when state changes, we can set it to run when state or props change
  return (
    <Provider store={store}>
      <Router>
        <Fragment>
          <Navbar />
          <Route exact path="/" component={Landing} />
          <section className="container">
            <Alert></Alert>
            <Switch>
              <Route exact path="/register" component={Register}></Route>
              <Route exact path="/login" component={Login}></Route>
              <Route exact path="/profiles" component={Profiles}></Route>
              <Route exact path="/profile/:id" component={Profile}></Route>
              <PrivateRoute exact path="/dashboard" component={Dashboard} />
              <PrivateRoute
                exact
                path="/create-profile"
                component={profileForm}
              />
              <PrivateRoute
                exact
                path="/add-experience"
                component={AddExperience}
              />
              <PrivateRoute
                exact
                path="/add-education"
                component={AddEducation}
              />
              <PrivateRoute exact path="/posts" component={Posts} />
              <PrivateRoute exact path="/posts/:id" component={Post} />
            </Switch>
          </section>
        </Fragment>
      </Router>
    </Provider>
  );
};

export default App;
