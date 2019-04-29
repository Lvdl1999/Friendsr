package com.example.friendsrtwo;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Levy on 29/04/2019.
 */

public class FriendsAdapter extends ArrayAdapter {

    ArrayList<Friend> userList;

    public FriendsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Friend> objects) {
        super(context, resource, objects);

        userList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.picture);
        TextView text = convertView.findViewById(R.id.name);

        Friend currentUser = userList.get(position);

        image.setImageResource(currentUser.getDrawableId());
        text.setText(currentUser.getName());

        return convertView;
    }
}
