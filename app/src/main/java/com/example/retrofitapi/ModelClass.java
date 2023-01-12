package com.example.retrofitapi;

import com.google.gson.annotations.SerializedName;

public class ModelClass {

    private int userId;

    private int id;

    private String title;

    @SerializedName("body")
    private String subtitle;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
