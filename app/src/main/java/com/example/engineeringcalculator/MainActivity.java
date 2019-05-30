package com.example.engineeringcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String lastOperation = "="; // последняя операция
       Double operand = null;
            private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        editText = findViewById(R.id.text_view_edit);
    }

    public void onOperationClick(View view) {
        View view1 = (View) findViewById(R.id.eng_panel);

        if (view1.getVisibility() == View.GONE) {
            view1.setVisibility(View.VISIBLE);

        } else {
            view1.setVisibility(View.GONE);
        }
    }

    // сохранение состояния
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString("OPERATION", lastOperation);

        if (operand != null)
            outState.putDouble("OPERAND", operand);
        super.onSaveInstanceState(outState);
    }

    public void onNumberClick(View view) {

        Button button = (Button) view;
            editText.append(button.getText());
    }
}
