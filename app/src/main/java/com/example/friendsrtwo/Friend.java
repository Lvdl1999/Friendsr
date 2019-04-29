package com.example.friendsrtwo;

import android.content.Intent;
import android.graphics.drawable.Drawable;

import java.io.Serializable;



public class Friend implements Serializable {

    private String name, bio;
    private int age, drawableId;
    private float rating;


    public Friend(String aName, String aBio, int anAge, int aDrawableId) {
        name = aName;
        bio = aBio;
        drawableId = aDrawableId;
        rating = 3.0f;
    }


    /* Getters and setters. */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public void setDrawableId(int drawableId) {
        this.drawableId = drawableId;
    }
}