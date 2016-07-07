package com.example.chaiy.nanodegreeapps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MyAppsActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_apps);

        btn1 = (Button) findViewById(R.id.app1);
        btn2 = (Button) findViewById(R.id.app2);
        btn3 = (Button) findViewById(R.id.app3);
        btn4 = (Button) findViewById(R.id.app4);
        btn5 = (Button) findViewById(R.id.app5);
        btn6 = (Button) findViewById(R.id.app5);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String message = "This button will launch ";
        switch (view.getId()) {
            case R.id.app1:
                message = message + getResources().getString(R.string.app_1);
                break;
            case R.id.app2:
                message = message + getResources().getString(R.string.app_2);
                break;
            case R.id.app3:
                message = message + getResources().getString(R.string.app_3);
                break;
            case R.id.app4:
                message = message + getResources().getString(R.string.app_4);
                break;
            case R.id.app5:
                message = message + getResources().getString(R.string.app_5);
                break;
            case R.id.app6:
                message = message + getResources().getString(R.string.app_6);
                break;
            default:
                break;
        }
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
