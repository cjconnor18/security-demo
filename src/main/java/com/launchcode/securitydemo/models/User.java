package com.launchcode.securitydemo.models;

import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue
    private long id;

    @NotBlank
    @Size(min = 6, max = 25)
    private String username;

    @NotBlank
    @Size(min = 6, max = 50)
    private String password;

    private int active;

    private String roles = "";

    private String permissions = "";

    public User(String username, String password, String roles, String permissions) {
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.permissions = permissions;
        this.active = 1;
    }

    protected User(){}

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getActive() {
        return active;
    }

    public String getRoles() {
        return roles;
    }

    public String getPermissions() {
        return permissions;
    }

    public List<String> getRoleList () {
        if(this.roles.length() > 0) {
            return Arrays.asList(roles.split(","));
        }
        return new ArrayList<String>();
    }

    public List<String> getPermissionList () {
        if(this.permissions.length() > 0) {
            return Arrays.asList(permissions.split(","));
        }
        return new ArrayList<String>();
    }

}
