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

public class Sub_Activity extends AppCompatActivity {
    private int number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText num1 = findViewById(R.id.sub_num1);
        EditText num2 = findViewById(R.id.sub_num2);
        Button cal_sub = findViewById(R.id.cal_sub);
        TextView resultText = findViewById(R.id.resultText2);
        Button clear = findViewById(R.id.clearSub);

        cal_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 number1 = Integer.parseInt(num1.getText().toString());
                 number2 = Integer.parseInt(num2.getText().toString());
//                 if(number1 == 0 && number2 == 0){
//                     resultText.setText("Please enter the numbers.");
//                 }
                int sub = number1 - number2;
                resultText.setText(""+sub);
            }
        });

        // this is my logic
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              num1.setText("");
              num2.setText("");
              resultText.setText("Perform another Subtraction");
            }
        });

    }
}