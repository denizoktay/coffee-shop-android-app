package com.denizoktay.a00268434_denizoktay_androidproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FifthC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth_c);
    }
    public void goMail(View v) {

        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"tinkywinky@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Hello,");
        email.putExtra(Intent.EXTRA_TEXT, "................. ");
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Send Mail Using :"));
    }

}
