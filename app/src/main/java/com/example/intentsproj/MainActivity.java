package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //creating objects
    Button btnOk;
    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //defining the objects
        btnOk = findViewById(R.id.btnProceed);
        et1 = findViewById(R.id.edtText1);
        et2 = findViewById(R.id.edtText2);

        //setting on click function
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast toast = Toast.makeText(getApplicationContext(), "You just clicked the OK button" , Toast.LENGTH_SHORT);
                //toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
                //toast.show();

                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();

                //Getting the View object as defined in the custom toast.xml file
                View layout = li.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_layout));

                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();

                String edt1 = et1.getText().toString();
                String edt2 = et2.getText().toString();

                //defining the intent
                Intent intent = new Intent(MainActivity.this,Second.class);

                //sending values to the next activity
                intent.putExtra("EXTRA_1",edt1);
                intent.putExtra("EXTRA_2",edt2);

                //start the intent
                startActivity(intent);


            }
        });


    }


    /*public void calculate(View view){
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creating the LayoutInflater instance
                LayoutInflater li = getLayoutInflater();

                //Getting the View object as defined in the custom toast.xml file
                View layout = li.inflate(R.layout.custom_toast,(ViewGroup) findViewById(R.id.custom_toast_layout));

                //Creating the Toast object
                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
                toast.setView(layout);
                toast.show();

                String edt1 = et1.getText().toString();
                String edt2 = et2.getText().toString();

                //defining the intent
                Intent intent = new Intent(MainActivity.this,Second.class);

                //sending values to the next activity
                intent.putExtra("EXTRA_1",edt1);
                intent.putExtra("EXTRA_2",edt2);

                //start the intent
                startActivity(intent);
            }
        });
    }*/



}