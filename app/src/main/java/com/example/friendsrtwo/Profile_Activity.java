package com.example.friendsrtwo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.sql.SQLOutput;

public class Profile_Activity extends AppCompatActivity {


    private Friend retrievedFriend;
    private ImageView profilePic;
    private TextView bio;
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        Intent intent = getIntent();
        retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");

        profilePic = findViewById(R.id.picture_profile);
        bio = findViewById(R.id.bio);
        name = findViewById(R.id.name);
        RatingBar ratingBar = findViewById(R.id.rating_bar);
        Drawable drawableProfilePic = getResources().getDrawable(retrievedFriend.getDrawableId());
        // Shared preferences saves the possible given rating
        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
        Float aFloat = prefs.getFloat(retrievedFriend.getName(), 0.0f);

        // Set bio, name, profilepic and rating to retrieved friend on profile
        bio.setText(retrievedFriend.getBio());
        name.setText(retrievedFriend.getName());
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener());
        profilePic.setImageDrawable(drawableProfilePic);
        ratingBar.setRating(aFloat);
    }

    /**
     * Method that changes the ratingbar
     */
    private class OnRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            SharedPreferences.Editor editor = getSharedPreferences("settings", MODE_PRIVATE).edit();
            editor.putFloat(retrievedFriend.getName(), rating);
            editor.commit();
        }
    }
}
