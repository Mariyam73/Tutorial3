package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Second extends AppCompatActivity {

    //initializing the objects
    String s1,s2;
    TextView tv1 , tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //getting the string values using the first intent
        Intent i=getIntent();
        s1 = i.getStringExtra("EXTRA_1");
        s2 = i.getStringExtra("EXTRA_2");

        //defining the objects
        tv1 = findViewById(R.id.edtText3);
        tv2 = findViewById(R.id.edtText4);
        Button btnAddition = findViewById(R.id.btnAdd);
        Button btnSubtraction = findViewById(R.id.btnSub);
        Button btnMultiplication = findViewById(R.id.btnMult);
        Button btnDivision = findViewById(R.id.btnDivide);

       //set text obtained using string
        tv1.setText(s1);
        tv2.setText(s2);

        //on click method for addition button
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //convert to integer
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);

                //getting the sum
                Integer answer = i1+i2;

                String result=s1+" + "+s2+" = "+(answer);
                TextView txtV1 = findViewById(R.id.txtProcessed);
                txtV1.setText(result);
            }
        });

        //on click method for subtraction
       btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //converting to integer
                Integer i1 = Integer.parseInt(s1);
                Integer i2 = Integer.parseInt(s2);

                //getting the sum
                Integer answer = i1 - i2;

                String result;
                result=s1+" - "+s2+" = "+(answer);
                TextView txtV1 = findViewById(R.id.txtProcessed);
                txtV1.setText(result);
            }
        });

        //on click method for multiplication
       btnMultiplication.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //converting to integer
               Integer i1 = Integer.parseInt(s1);
               Integer i2 = Integer.parseInt(s2);

               //get the sum
               Integer answer = i1 * i2;

               String result = s1+" * "+s2+" = "+answer;
               TextView txtV1 = findViewById(R.id.txtProcessed);
               txtV1.setText(result);
           }
       });

        //on click method for division
       btnDivision.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               //converting to integer
               Integer i1 = Integer.parseInt(s1);
               Integer i2 = Integer.parseInt(s2);

               //get te sum
               Integer answer  = i1/i2;

               String result = s1+" / "+s2+" = "+answer;
               TextView txtV1 = findViewById(R.id.txtProcessed);
               txtV1.setText(result);


           }
       });


    }



}