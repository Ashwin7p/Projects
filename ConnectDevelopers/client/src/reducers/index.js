import { combineReducers } from "redux";
import alert from "./alert";
import auth from "./auth";
import profile from "./profile";
import post from "./post";
//for state change, in redux(pin)
export default combineReducers({ alert, auth, profile, post });
