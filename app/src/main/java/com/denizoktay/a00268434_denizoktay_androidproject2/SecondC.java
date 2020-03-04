package com.denizoktay.a00268434_denizoktay_androidproject2;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

        import static java.lang.Thread.sleep;

public class SecondC extends AppCompatActivity {
    private SharedPreferences person_details;
    private CheckBox myCheckBox1;
    private CheckBox myCheckBox2;
    private CheckBox myCheckBox3;
    private TextView myTextViewResult;
    Button button4;
    String resultString;
    Handler handlerUI = new Handler();

    final int screen2_code = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_c);
        myCheckBox1 = findViewById(R.id.checkBox1);
        myCheckBox2 = findViewById(R.id.checkBox2);
        myCheckBox3 = findViewById(R.id.checkBox3);
        myTextViewResult = findViewById(R.id.textView38);

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myString = "";
                int price = 0 ;

                if (myCheckBox1.isChecked() && myCheckBox2.isChecked() && myCheckBox3.isChecked()) {
                    myString = "Caffè Americano \nPeppermint Hot Chocolate \nIrish Cream Cold Brew";
                    price = 18;
                }

                else if (myCheckBox1.isChecked() && myCheckBox2.isChecked()) {
                    myString = "Caffè Americano \nPeppermint Hot Chocolate";
                    price = 11;
                }

                else if (myCheckBox1.isChecked() && myCheckBox3.isChecked()) {
                    myString = "Caffè Americano \nIrish Cream Cold Brew";
                    price = 12;
                }

                else if (myCheckBox2.isChecked() && myCheckBox3.isChecked()) {
                    myString = "Peppermint Hot Chocolate \nIrish Cream Cold Brew";
                    price = 13;
                }

                else if (myCheckBox1.isChecked()) {
                    myString = "Caffè Americano";
                    price = 5;
                }

                else if (myCheckBox2.isChecked()) {
                    myString = "Peppermint Hot Chocolate";
                    price = 6;
                }

                else if (myCheckBox3.isChecked()) {
                    myString = "Irish Cream Cold Brew";
                    price = 7;
                }

                Intent i = new Intent(SecondC.this, SecondC2.class);
                i.putExtra("myString", myString);
                i.putExtra("price", price);
                startActivityForResult(i, screen2_code);

            }
        });
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == screen2_code) {
            if (resultCode == RESULT_OK) {
                int result = data.getIntExtra("result", 0);
                resultString = data.getStringExtra("result2");
                myTextViewResult.setText("Total: \n" + result +" €");

            }
        }
    }
    public void goSaveAndSecondC3(View view)
    {
        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);
        SharedPreferences.Editor editor = person_details.edit();
        editor.putString("key_name", resultString);
        editor.commit();

        Toast.makeText(getBaseContext(), "Order Saved!!",
                Toast.LENGTH_SHORT).show();
        handlerUI.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SecondC.this, SecondC3.class);
                startActivity(i);
            }
        }, 2000);

    }
    public void goShow(View v){
        person_details = getApplicationContext().getSharedPreferences("person_details", MODE_PRIVATE);

        String name = person_details.getString("key_name", null);
        myTextViewResult.setText("Last Order: \n" + name);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second_c, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();



        if (id == R.id.test1) {
            Intent i = new Intent(SecondC.this,Screen2.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.test2) {
            Intent i = new Intent(SecondC.this,MainActivity.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}





