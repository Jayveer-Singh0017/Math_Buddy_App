package com.example.mathbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Div_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // initialize the TextView and Button and editText
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        Button   cal_div = findViewById(R.id.calculatebtn1);
        TextView   resutlText = findViewById(R.id.resultText1);
        Button clear = findViewById(R.id.clearDiv);
        // Handle the cal_div Button
        cal_div.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               double number1 = Double.parseDouble(num1.getText().toString());
               double number2 = Double.parseDouble(num2.getText().toString());
               double div = number1/number2;
               resutlText.setText(""+div);

           }
       });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                resutlText.setText("Perform another Division");
            }
        });



    }
}