package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;


/**
 *
 * A class representing a user.
 * See https://api.slack.com/types/user
 *
 */

public class User {

    // implement private fields for each of the following user JSON keys:

     private String id; // demo
     private String name; // State Facts

     private Boolean isDeleted; // false
     private String color; // purple
     private Object profile;

     private Boolean isAdmin; // false
     private Boolean isOwner;
     private Boolean isPrimaryOwner;
     private Boolean isRestricted;
     private Boolean isUltraRestricted;
     private Boolean  has2fa;
     private Enum twoFactorType;
     private Boolean hasFiles;

    public User(JSONObject json) {
        // parse a user from the incoming json

        if (json.get("id") != null) {
            this.id = (String) json.get("id");
        }
        if (json.get("name") != null) {
            this.name = (String) json.get("name");
        }
        if (json.get("is_deleted") != null) {
            this.isDeleted = (Boolean) json.get("is_deleted");
        }
        if (json.get("color") != null) {
            this.color = (String) json.get("color");
        }
        if (json.get("profile") != null) {
            this.profile = (Object) json.get("profile");
        }
        if (json.get("is_admin") != null) {
            this.isAdmin = (Boolean) json.get("is_admin");
        }
        if (json.get("is_owner") != null) {
            this.isOwner = (Boolean) json.get("is_owner");
        }
        if (json.get("is_primary_owner") != null) {
            this.isPrimaryOwner = (Boolean) json.get("is_primary_owner");
        }
        if (json.get("is_restricted") != null) {
            this.isRestricted = (Boolean) json.get("is_restricted");
        }
        if (json.get("is_ultra_restricted") != null) {
            this.isUltraRestricted = (Boolean) json.get("is_ultra_restricted");
        }
        if (json.get("has_2fa") != null) {
            this.has2fa = (Boolean) json.get("has_2fa");
        }
        if (json.get("two_factor_type") != null) {
            this.twoFactorType = (Enum) json.get("two_factor_type");
        }
        if (json.get("has_files") != null) {
            this.hasFiles = (Boolean) json.get("has_files");
        }
    }

    // add getters to access private fields
    public String getId() {
        return id;
    }
    public String getName() {
        return name;

        }
    public Boolean getIsDeleted() {
        return isDeleted;

    }
    public String getColor() {
        return color;
    }
    public Object getProfile() {
        return profile;
    }
    public Boolean getIsAdmin() {
        return isAdmin;
    }
    public Boolean getIsOwner() {
        return isOwner;
    }
    public Boolean getIsPrimaryOwner() {
        return isPrimaryOwner;
    }
    public Boolean getIsRestricted() {
        return isRestricted;
    }
    public Boolean getIsUltraRestrictedr() {
        return isUltraRestricted;
    }
    public Boolean getHas2fa() {
        return has2fa;
    }
    public Enum getTwoFactorType() {
        return twoFactorType;
    }
    public Boolean getHasFiles() {
        return hasFiles;
    }
}

