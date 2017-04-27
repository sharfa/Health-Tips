package com.example.nasser.tips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HealthTip5 extends AppCompatActivity {

    public Button previousButton;

    public void previousHealthTipScreen(){
        previousButton = (Button) findViewById(R.id. previousBtn);
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HealthTip5.this,HealthTip4.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tip5);
        previousHealthTipScreen();
    }
}
