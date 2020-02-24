package com.example.numberguessgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
TextView t1;
private EditText et_number;
private int number;
int randomnum = (int) (Math.random() * 100);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.edt_result);
        et_number = (EditText)findViewById(R.id.edt_number);
    }

    public void check(View view) {
        String numStr = et_number.getText().toString();

        if(numStr.isEmpty())
        {
            t1.setText("please input a number!");
        }
        number = Integer.parseInt(numStr);

        if(randomnum<number){
            t1.setText("it is too big!");
        }
        if(randomnum>number){
            t1.setText("it is too low!");
        }
        if(randomnum==number){
            t1.setText("you are right!!!!");
        }
    }
}
