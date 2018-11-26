package com.example.android.mediafiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(new Music("Return To Oz", "for music: Yip Harburg", R.drawable.oz));
        musics.add(new Music("Nils", "novel: Selma Lagerlöf", R.drawable.nils));
        musics.add(new Music("A little princess", "novel: Frances Hodgson Burnett", R.drawable.princess));
        musics.add(new Music("Beauty And The Beast", "novel: David Allen Ogden", R.drawable.beauty));

        GridView gridview = (GridView) findViewById(R.id.gridview);
        MusicAdapter musicAdapter = new MusicAdapter(this, musics);
        gridview.setAdapter(musicAdapter);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    Intent i = new Intent(view.getContext(), OzActivity.class);
                    startActivityForResult(i, 0);
                }

                if (position == 1) {
                    Intent i = new Intent(view.getContext(), NilsActivity.class);
                    startActivityForResult(i, 1);
                }

                if (position == 2) {
                    Intent i = new Intent(view.getContext(), Princess.class);
                    startActivityForResult(i, 2);
                }

                if (position == 3) {
                    Intent i = new Intent(view.getContext(), Beauty.class);
                    startActivityForResult(i, 3);
                }
            }


        });


    }


}
