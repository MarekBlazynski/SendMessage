package com.example.sendmessage;

import android.app.Application;

import com.example.sendmessage.model.User;

public class ChangeMessageApplication extends Application {
    private User user;

    public User getUser() {
        return user;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        user= new User("Marek","marek3b@gmail.com");
    }
}
