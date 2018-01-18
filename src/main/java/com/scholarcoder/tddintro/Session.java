package com.scholarcoder.tddintro;

public class Session {
    private static Session instance = null;
    public User currentUser;

    private Session() { }

    public static Session getCurrentSession() {
        if(instance==null)
            instance = new Session();
        return instance;
    }

    public User getAuthenticatedUser() {
        return currentUser;
    }

    public void setAuthenticatedUser(User user) {
        this.currentUser = user;
    }
}
