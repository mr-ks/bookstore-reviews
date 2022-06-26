package com.example.reviews.model;

public class Rating {
    int Stars;
    String color;

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getStars() {
        return Stars;
    }
    public void setStars(int stars) {
        Stars = stars;
    }
}
