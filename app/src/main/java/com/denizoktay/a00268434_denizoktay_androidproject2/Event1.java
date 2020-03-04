package com.denizoktay.a00268434_denizoktay_androidproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.VideoView;

public class Event1 extends AppCompatActivity {
    private MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event1);

        VideoView vd = findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/"+R.raw.video);
        mc = new MediaController(this);
        vd.setMediaController(mc);
        vd.requestFocus();
        vd.setVideoURI(uri);
        vd.start();

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_event1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();



        if (id == R.id.test1) {
            Intent i = new Intent(Event1.this,Screen2.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.test2) {
            Intent i = new Intent(Event1.this,MainActivity.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.test3) {
            Intent i = new Intent(Event1.this,ThirdC.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
