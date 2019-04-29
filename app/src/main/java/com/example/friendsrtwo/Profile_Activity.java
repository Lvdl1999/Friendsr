package com.example.friendsrtwo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RatingBar;

public class Profile_Activity extends AppCompatActivity {


    Friend retrievedFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

    //  nieuwe instantie met huidige rating
        RatingBar ratingBar = findViewById(R.id.rating_bar);
        ratingBar.setOnRatingBarChangeListener(new OnRatingBarChangeListener());

        Intent intent = getIntent();
        retrievedFriend = (Friend) intent.getSerializableExtra("clicked_friend");

        SharedPreferences prefs = getSharedPreferences("settings", MODE_PRIVATE);
//        zit zowel getal van rating of 0 als je niks kon vinden, dan vult ie 0 in ervoor
//        rating is nu opgeslagen in aFloat
        Float aFloat = prefs.getFloat(retrievedFriend.getName(), 0.0f);

//        ratingbar aangepast naar waarde die is opgeslagen
        ratingBar.setRating(aFloat);

//        fvbid voor textview
        Bio bio = findViewById(R.id.bio);

//        set text naar bio



    }

    private class OnRatingBarChangeListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            SharedPreferences.Editor editor = getSharedPreferences("settings", MODE_PRIVATE).edit();
            editor.putFloat(retrievedFriend.getName(), rating);
            editor.commit();

        }
    }

}
