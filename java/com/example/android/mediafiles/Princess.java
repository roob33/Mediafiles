package com.example.android.mediafiles;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Princess extends AppCompatActivity {
    private ImageView im;
    private MediaPlayer mediaPlayer;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.princess);

        im = findViewById(R.id.photo_princess);

        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.princess);

        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(Princess.this,MainActivity.class);
                startActivity(a);
            }
        });

        imageButton = findViewById(R.id.play);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(Princess.this,"Start player",Toast.LENGTH_LONG).show();
            }
        });

        imageButton = findViewById(R.id.pause);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                Toast.makeText(Princess.this,"pause_round_button",Toast.LENGTH_LONG).show();

            }
        });


    }


}