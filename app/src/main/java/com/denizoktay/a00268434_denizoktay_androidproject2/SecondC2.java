package com.denizoktay.a00268434_denizoktay_androidproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class SecondC2 extends AppCompatActivity {
    String myString;
    int price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_c2);
        try {
            Bundle extras = getIntent().getExtras();

            myString = extras.getString("myString", "");
            price =  extras.getInt("price", 0);

            TextView textViewString = findViewById(R.id.textView38);
            textViewString.setText("Your Order:\n" + myString);

        } catch (RuntimeException e) {

            e.printStackTrace();
        }
    }

    public void showInFirstScreen(View view)
    {

        Intent resultIntent = new Intent();
        resultIntent.putExtra("result", price);
        resultIntent.putExtra("result2", myString);
        setResult(RESULT_OK, resultIntent);
        finish();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_c2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();



        if (id == R.id.test1) {
            Intent i = new Intent(SecondC2.this,Screen2.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.test2) {
            Intent i = new Intent(SecondC2.this,MainActivity.class);
            startActivity(i);
            return true;
        }
        if (id == R.id.test3) {
            Intent i = new Intent(SecondC2.this,SecondC.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}





