package com.denizoktay.a00268434_denizoktay_androidproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class Screen2 extends ListActivity  {
    private static final String[] myClasses={
            "FirstC",
            "SecondC",
            "ThirdC",
            "FourthC",
            "FifthC"

    };

    private static final String[] myLabels={
            "   About Us",
            "   Order",
            "   Latest News",
            "Opening Hours",
            "    Email Us"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
        setListAdapter(new MyOwnAdapter());

    /*    Button myButton2 = findViewById(R.id.button2);

        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Screen2.this,Screen6.class);
                startActivity(i);
            }
        });

        Button myButton3 = findViewById(R.id.button3);

        myButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Screen2.this,Screen4.class);
                startActivity(i);
            }
        });

*/






        try {
            Bundle extras = getIntent().getExtras();
            String sentText = extras.getString("Name");
            TextView tvNameReceived = findViewById(R.id.textView6);
            tvNameReceived.setText("Hi "+sentText+",");
        } catch (RuntimeException e) {

            e.printStackTrace();
        }

    }
    class MyOwnAdapter extends ArrayAdapter<String> {
        MyOwnAdapter() {
            super(Screen2.this, R.layout.my_row, R.id.label, myLabels);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View row=super.getView(position, convertView, parent);
            ImageView icon=(ImageView)row.findViewById(R.id.icon);


            if (myClasses[position]== "FirstC")
                icon.setImageResource(R.drawable.fir);
            if (myClasses[position]== "SecondC")
                icon.setImageResource(R.drawable.sec);
            if (myClasses[position]== "ThirdC")
                icon.setImageResource(R.drawable.thi);
            if (myClasses[position]== "FourthC")
                icon.setImageResource(R.drawable.fou);
            if (myClasses[position]== "FifthC")
                icon.setImageResource(R.drawable.fif);
            return(row);
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        try {
            Class myClass = Class.forName("com.denizoktay.a00268434_denizoktay_androidproject2." + myClasses[position]);
            Intent i = new Intent(Screen2.this, myClass);
            startActivity(i);
        }
        catch
        (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }





    public void goScreen7(View view)
    {
        Intent i = new Intent(Screen2.this, Screen7.class);
        startActivity(i);
    }
    public void openPhone (View view) {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:" + "0906468000"));
        if (i.resolveActivity(getPackageManager()) != null)
            startActivity(i);

    }

}

