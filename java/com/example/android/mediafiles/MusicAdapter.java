package com.example.android.mediafiles;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MusicAdapter extends ArrayAdapter<Music> {


    public MusicAdapter(Context context, ArrayList<Music> musics) {
        super(context, 0, musics);


    }


    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;


        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.
                    listitem, parent, false);
        }

        Music currentMusic = getItem(position);

        ImageView imageView = listItemView.findViewById(R.id.imageview);
        final TextView textView = listItemView.findViewById(R.id.textview);
        final TextView textView1 = listItemView.findViewById(R.id.textname);

        assert currentMusic != null;
        imageView.setImageResource(currentMusic.getImage());
        textView.setText(currentMusic.getTextview());
        textView1.setText(currentMusic.getTextname());


        return listItemView;
    }


}
