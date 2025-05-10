package com.example.WeatherApp.Model;

public class UserProfile {

    private String id;
    private String fullName;
    private String email;
    private String imageUrl;

    public UserProfile(String id, String fullName, String email, String imageUrl) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}