package com.denizoktay.a00268434_denizoktay_androidproject2;

        import android.app.ListActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;


public class ThirdC extends ListActivity {
    String[] myEvents = {
            "Event1",
            "Event2",
            "Event3",
            "Event4"
    };


    String[] myLabels = {
            "Congratulations to 2019 World Coffee Roasting Champion Arseny Kuznetosv Representing Russia",
            "Rules & Regulations Released for 2020 World Coffee Championships",
            "Updated Guidelines For WCE Licensed Competition Bodies and Representatives",
            "Licor 43 to Title Sponsor the 2020-2022 World Coffee In Good Spirits Championships"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //       setContentView(R.layout.activity_third_c);
        this.setListAdapter(new ArrayAdapter<String>(ThirdC.this, android.R.layout.simple_list_item_1, myLabels));

    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {


        try {
            Class myClass = Class.forName("com.denizoktay.a00268434_denizoktay_androidproject2." + myEvents[position]);
            Intent i = new Intent(ThirdC.this, myClass);
            startActivity(i);
        }
        catch
        (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
