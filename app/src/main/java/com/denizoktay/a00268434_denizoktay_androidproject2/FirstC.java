package com.denizoktay.a00268434_denizoktay_androidproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class FirstC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_c);

        Thread splashTread = new Thread() {

            public void run() {
                try {
                    sleep(7000);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    finish();
                    Intent i = new Intent(FirstC.this,FirstC2.class);
                    startActivity(i);
                }
            }
        };
        splashTread.start();

    }
    public void goSound(View v) {
        MediaPlayer mp = MediaPlayer.create(FirstC.this, R.raw.sound);
        mp.start();
    }

}
