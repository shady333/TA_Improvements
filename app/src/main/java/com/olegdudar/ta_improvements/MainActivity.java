package com.olegdudar.ta_improvements;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button)findViewById(R.id.btn_start);
//        startButton.setOnClickListener(goToApplicationTypeSelection(this));
    }

    public void goToApplicationTypeSelection(View view){
        Intent intent = new Intent(this, TypeOfApplication.class);
        startActivity(intent);
    }
}
