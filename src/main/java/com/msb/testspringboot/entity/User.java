package com.msb.testspringboot.entity;

public class User {
    private String usernmae;
    private String password;

    public String getUsernmae() {
        return usernmae;
    }

    public void setUsernmae(String usernmae) {
        this.usernmae = usernmae;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String usernmae, String password) {
        this.usernmae = usernmae;
        this.password = password;
    }
}
