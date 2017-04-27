package com.example.nasser.tips;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class HealthTip1 extends AppCompatActivity {

    public Button nextTipButton;

    public void nextHealthTipScreen(){
        nextTipButton = (Button) findViewById(R.id.nextTip2Btn );
        nextTipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HealthTip1.this,HealthTip2.class);
                startActivity(intent);
            }
        });
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_tip1);
        nextHealthTipScreen();
    }
}
