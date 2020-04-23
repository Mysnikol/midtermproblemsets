package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;


/**
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // TODO: implement private fields for each of the following user JSON keys:

     private String id; // demo
     private String name; // State Facts

     private Boolean deleted; // false
     private String color; // purple
     private Object profile;

     private Boolean is_admin; // false
     private Boolean is_owner;
     private Boolean is_primary_owner;
     private Boolean is_restricted;
     private Boolean is_ultra_restricted;
     private Boolean  has_2fa;
     private Enum two_factor_type;
     private Boolean has_files;

    public User(JSONObject json) {
        // TODO: parse a user from the incoming json

    }

    // TODO add getters to access private fields

        }

    }

}

