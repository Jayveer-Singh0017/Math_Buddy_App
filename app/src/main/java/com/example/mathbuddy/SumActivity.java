package com.example.mathbuddy;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sum);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        // initialize the TextView and Button and editText
        EditText num1 = findViewById(R.id.editText1);
        EditText num2 = findViewById(R.id.editText2);
        Button calculateBtn = findViewById(R.id.cal_sum);
        TextView result = findViewById(R.id.result);
        Button clear = findViewById(R.id.clearSum);

        // Handle the calculateBtn
        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1 == null && num2 == null){
                    result.setText("Please the enter the numbers.");
                }
                long number1 = Long.parseLong(num1.getText().toString());
                long number2 = Long.parseLong(num2.getText().toString());
                long sum = number1+number2;
                result.setText(""+sum);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("Perform another Addition");
            }
        });


    }
}