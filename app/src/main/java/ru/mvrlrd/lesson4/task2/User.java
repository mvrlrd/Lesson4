package ru.mvrlrd.lesson4.task2;

import com.google.gson.annotations.Expose;

public class User {
    @Expose
   private String login;
    @Expose
   private String avatar_url;

    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }
}
