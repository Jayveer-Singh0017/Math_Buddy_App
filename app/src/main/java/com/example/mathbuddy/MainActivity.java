package com.example.mathbuddy;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button btnSum,btnSub,btnMul,btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // this line change the title bar color
          getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.titleBar_color)));

          // initialize the all button
          btnSum = findViewById(R.id.btn_sum);
          btnSub = findViewById(R.id.btn_sub);
          btnMul = findViewById(R.id.btn_mul);
          btnDiv = findViewById(R.id.btn_div);

        // Handle the sum button
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SumActivity.class);
                startActivity(intent);
            }
        });


          // Handle the sub button
          btnSub.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this,Sub_Activity.class);
                  startActivity(intent);
              }
          });

          // Handle the mul button
          btnMul.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this,Mul_Activity.class);
                  startActivity(intent);
              }
          });

          // Handle the div button
          btnDiv.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(MainActivity.this,Div_Activity.class);
                  startActivity(intent);
              }
          });


    }


}