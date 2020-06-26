package com.example.basicphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public void buttonTapped(View view)
    {
        int id=view.getId();
        String ourId="";

        ourId= view.getResources().getResourceEntryName(id);   //Gives the id for the object we want to set

        int resourceId= getResources().getIdentifier(ourId,"raw",getPackageName());//used to refer to sound files
        MediaPlayer mediaPlayer= MediaPlayer.create(this, resourceId);
        mediaPlayer.start();

        Log.i("button tapped", ourId);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
