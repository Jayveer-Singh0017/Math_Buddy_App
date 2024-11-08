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

public class Mul_Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // initialize the TextView and Button and editText
        EditText num1 = findViewById(R.id.mul_num1);
        EditText num2 = findViewById(R.id.mul_num2);
        Button cal_mul = findViewById(R.id.cal_mul);
        TextView resultText1 = findViewById(R.id.resultText);
        Button clear = findViewById(R.id.clearMul);

        // Handle the cal_mul Button
        cal_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               
                String str1 = num1.getText().toString();
                String str2 = num2.getText().toString();

                if(!str1.isEmpty() && !str2.isEmpty()){

                    double number1 = Double.parseDouble(num1.getText().toString());
                    double number2 = Double.parseDouble(num2.getText().toString());
                    double mul = number1 * number2;
                    resultText1.setText(""+mul);

                }else {
                    resultText1.setText("Please enter the valid details.");
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                resultText1.setText("Perform another Multipication");
            }
        });
    }
}
