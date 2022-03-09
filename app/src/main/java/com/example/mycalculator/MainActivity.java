package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Variable declare

    EditText etFirstValue,etSecondValue;
    TextView tvAns;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Find all

        etFirstValue=findViewById(R.id.editTextNumber);
        etSecondValue=findViewById(R.id.editTextNumber2);
        tvAns=findViewById(R.id.tvAns);
        add=findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btbSub);
        mul=findViewById(R.id.btnMultiply);
        div=findViewById(R.id.btnDiv);

    // setOnClick in Button

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue+secondValue;
                tvAns.setText("Ans is= "+ans);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue-secondValue;
                tvAns.setText("Ans is= "+ans);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue*secondValue;
                tvAns.setText("Ans is= "+ans);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int firstValue,secondValue,ans;
                firstValue=Integer.parseInt(etFirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstValue/secondValue;
                tvAns.setText("Ans is= "+ans);
            }
        });
    }
}