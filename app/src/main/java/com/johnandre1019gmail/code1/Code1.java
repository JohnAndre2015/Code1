package com.johnandre1019gmail.code1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Code1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code1);




        final EditText inputEditText1 = (EditText) findViewById(R.id.inputEditText1);
        final EditText inputEditText2 = (EditText) findViewById(R.id.inputEditText2);
        final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

        Button pressMeButton = (Button) findViewById(R.id.pressMeButton);
        pressMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                int result = 0;
                int first_num   = Integer.parseInt(inputEditText1.getText().toString());
                int second_num = Integer.parseInt(inputEditText2.getText().toString());

                if(first_num>second_num){

                    result = first_num;
                }
                    else {  result = second_num;

         }

                resultTextView.setText("The bigger number is:" + result);


            }});


    }
}
