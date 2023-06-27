package com.example.tiktokclone;

public class Model {
    String vediUrl;
    int profile;
    String name;

    public Model(String vediUrl, int profile, String name) {
        this.vediUrl = vediUrl;
        this.profile = profile;
        this.name = name;
    }

    public String getVediUrl() {
        return vediUrl;
    }

    public void setVediUrl(String vediUrl) {
        this.vediUrl = vediUrl;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
