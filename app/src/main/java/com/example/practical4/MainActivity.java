package com.example.practical4;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        final Button BtnCalculate = findViewById(R.id.btnCalculate);


        BtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText ETNum1 = findViewById(R.id.ETNum1);
                EditText ETNum2 = findViewById(R.id.ETNum2);

                TextView TVResult = findViewById(R.id.TVResult);

                Double result = Double.parseDouble(ETNum1.getText().toString()) + Double.parseDouble(ETNum2.getText().toString());

                TVResult.setText(Double.toString(result));

            }

        });

        final Button btnSubmit = findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                CheckBox checkBox1 = findViewById(R.id.checkBox1);
                CheckBox checkBox2 = findViewById(R.id.checkBox2);
                CheckBox checkBox3 = findViewById(R.id.checkBox3);

                ConstraintLayout cs = findViewById(R.id.CSlayout);

                if(checkBox1.isChecked()){
                    cs.setBackgroundColor(Color.RED);
                }
                else if(checkBox2.isChecked()){
                    cs.setBackgroundColor(Color.BLUE);
                }
                else
                    cs.setBackgroundColor(Color.GREEN);
            }
        });
    }

}