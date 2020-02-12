package com.aqil.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
    }

    public void btnclicked1(View buttonView){
        EditText edt1 = findViewById(R.id.editText);
        EditText edt2 = findViewById(R.id.editText2);

        int myR = Integer.parseInt(edt1.getText().toString()) + Integer.parseInt(edt2.getText().toString());
        text.setText(myR + " ");

    }

    public void btnclicked2(View buttonView){
        EditText edt1 = findViewById(R.id.editText);
        EditText edt2 = findViewById(R.id.editText2);

        int myR = Integer.parseInt(edt1.getText().toString()) - Integer.parseInt(edt2.getText().toString());
        text.setText(myR + " ");

    }

    public void btnclicked3(View buttonView){
        EditText edt1 = findViewById(R.id.editText);
        EditText edt2 = findViewById(R.id.editText2);

        int myR = Integer.parseInt(edt1.getText().toString()) * Integer.parseInt(edt2.getText().toString());
        text.setText(myR + " ");

    }

    public void btnclicked4(View buttonView){
        EditText edt1 = findViewById(R.id.editText);
        EditText edt2 = findViewById(R.id.editText2);

        Float myR = Float.parseFloat(edt1.getText().toString()) / Float.parseFloat(edt2.getText().toString());
        text.setText(myR + " ");

    }

}

