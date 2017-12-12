package com.example.madalinaloghin.apptestbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    Button btnShowToast, btnOpenActivity;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initViews();
        setListeners();
    }
    
    private void initViews() {
        btnShowToast = findViewById(R.id.btn_show_toast);
        btnOpenActivity = findViewById(R.id.btn_open_activity);
    }
    
    private void setListeners() {
        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Congratulations! \n Text revealed :)", Toast.LENGTH_SHORT).show();
            }
        });
        
        
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OpenedActivity.class));
            }
        });
    }
    
    
}
