package com.example.roshe.quiz;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int quizScore;
    Button button1, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final RadioGroup rbGroup1 = (RadioGroup) findViewById(R.id.myRadioGroup);
                int selectedId1 = rbGroup1.getCheckedRadioButtonId();
                if (selectedId1 != -1) {
                    RadioButton selectedRadioButton = (RadioButton) findViewById(selectedId1);
                    String radioButtonText = selectedRadioButton.getText().toString();
                    if ((radioButtonText).equals(getString(R.string.friends))) {
                        quizScore = quizScore + 1;
                    }
                }
                final RadioGroup rbGroup2 = (RadioGroup) findViewById(R.id.myRadioGroup4);
                int selectedId2 = rbGroup2.getCheckedRadioButtonId();
                if (selectedId2 != -1) {
                    RadioButton selectedRadioButton1 = (RadioButton) findViewById(selectedId2);
                    String radioButtonText1 = selectedRadioButton1.getText().toString();
                    if ((radioButtonText1).equals(getString(R.string.daredevil))) {
                        quizScore = quizScore + 1;
                    }
                }
                final RadioGroup rbGroup3 = (RadioGroup) findViewById(R.id.myRadioGroup5);
                int selectedId3 = rbGroup3.getCheckedRadioButtonId();
                if (selectedId3 != -1) {
                    RadioButton selectedRadioButton2 = (RadioButton) findViewById(selectedId3);
                    String radioButtonText2 = selectedRadioButton2.getText().toString();
                    if ((radioButtonText2).equals(getString(R.string.got))) {
                        quizScore = quizScore + 1;
                    }
                }
                final CheckBox qAnswer1 = (CheckBox) findViewById(R.id.checkBox1);
                boolean isChecked1 = qAnswer1.isChecked();
                final CheckBox qAnswer2 = (CheckBox) findViewById(R.id.checkBox2);
                boolean isChecked2 = qAnswer2.isChecked();
                final CheckBox qAnswer3 = (CheckBox) findViewById(R.id.checkBox3);
                boolean isChecked3 = qAnswer3.isChecked();
                final CheckBox qAnswer4 = (CheckBox) findViewById(R.id.checkBox4);
                boolean isChecked4 = qAnswer4.isChecked();
                if (isChecked1 && isChecked3 && !isChecked2 && !isChecked4) {
                    quizScore = quizScore + 1;
                }
                final EditText simpleEditText = (EditText) findViewById(R.id.edittextsample);
                String strValue = simpleEditText.getText().toString();
                if ((strValue).equals("Death note")) {
                    quizScore = quizScore + 1;
                }
                Toast.makeText(MainActivity.this, quizScore, Toast.LENGTH_LONG).show();
            }

            public void resetButton(View V) {
                ViewGroup vg = (ViewGroup) findViewById(R.id.activity_main);
                vg.invalidate();
                setContentView(R.layout.activity_main);
            }
        });


    }
}