package com.example.friendsrtwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ArrayList<Friend> friendList;
    private static final String TAG = "friendclicked";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gv = findViewById(R.id.grid);
        gv.setOnItemClickListener(new GridItemClickListener());

        //friendList = new ArrayList<>();
        friendList = new ArrayList<Friend>(Arrays.asList(

                new Friend("Tim",
                        "hoi ik ben tim ik hou van chips",
                        23,
                        getResources().getIdentifier("tim", "drawable", getPackageName())),

                new Friend("Renske",
                        "cactussen zijn cool",
                        24,
                        getResources().getIdentifier("renske", "drawable", getPackageName())),

                new Friend("Martijn",
                        "Ik ben Martijn, a1.20 is echt altijd koud!",
                        35,
                        getResources().getIdentifier("martijn", "drawable", getPackageName())),

                new Friend("Julia",
                        "oeh moeilijke keus",
                        22,
                        getResources().getIdentifier("julia", "drawable", getPackageName())),

                new Friend("Marijn",
                        "IK BEN EEN HACKER",
                        25,
                        getResources().getIdentifier("marijn", "drawable", getPackageName())),

                new Friend("Emma",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("emma", "drawable", getPackageName())),

                new Friend("Mirja",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("mirja", "drawable", getPackageName())),

                new Friend("Quinten",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("quinten", "drawable", getPackageName())),

                new Friend("Sascha",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("sascha", "drawable", getPackageName())),

                new Friend("Simon",
                        "WOEHOE",
                        22,
                        getResources().getIdentifier("simon", "drawable", getPackageName())),

                new Friend("Wouter",
                        "ja",
                        22,
                        getResources().getIdentifier("wouter", "drawable", getPackageName()))

        ));

//      search layout
        GridView gridView = findViewById(R.id.grid);
//      adapter accepteert 3 dingen: context, template voor item (hoe plaatje eruit moet zien) en list van friends als objects
        ArrayAdapter<Friend> adapter = new FriendsAdapter(getApplicationContext(), R.layout.list_item, friendList);
//      Op de grid zet ik nu de adapter op de grid
        gridView.setAdapter(adapter);


//        clicklistener voor details over iemand
//        plaatje, naam en rating (detailactivity)

    }


    private class GridItemClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Friend clickedFriend = (Friend) parent.getItemAtPosition(position);
            Log.d(TAG, "clickedfriend: friendclicked " + clickedFriend.getName());

            Intent intent = new Intent(MainActivity.this, Profile_Activity.class);
            intent.putExtra("clicked_friend", clickedFriend);
            startActivity(intent);



        }
    }
}

