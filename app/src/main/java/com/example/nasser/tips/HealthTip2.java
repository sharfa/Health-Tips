package com.example.nasser.tips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HealthTip2 extends AppCompatActivity {

    public Button nextTipButton;
    public Button previousButton;

    public void nextHealthTipScreen(){
        nextTipButton = (Button) findViewById(R.id.nextTip3btn);
        nextTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HealthTip2.this,HealthTip3.class);
                startActivity(intent);
            }
        });
    }

    public void previousHealthTipScreen(){
        previousButton = (Button) findViewById(R.id. previousBtn);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HealthTip2.this,HealthTip1.class);
                startActivity(intent);
            }
        });
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tip2);
        nextHealthTipScreen();
        previousHealthTipScreen();
    }
}
