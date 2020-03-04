package com.denizoktay.a00268434_denizoktay_androidproject2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Screen4 extends ListActivity  {
    String[] myEvents = {
            "Event1",
            "Event2",
            "Event3",
            "Event4"
    };


    String[] myLabels = {
            "Senior Round Robins Ladders 2020",
            "Kilkenny Autumn Matchplay 2019",
            "Claremorris Autumn League 2019",
            "2019 David Lloyd Riverview Autumn Invitational Match-Plays"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //       setContentView(R.layout.activity_screen4);
        this.setListAdapter(new ArrayAdapter<String>(Screen4.this, android.R.layout.simple_list_item_1, myLabels));

    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        try {
            Class myClass = Class.forName("com.denizoktay.a00268434_denizoktay_androidproject2." + myEvents[position]);
            Intent i = new Intent(Screen4.this, myClass);
            startActivity(i);
        }
        catch
        (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
