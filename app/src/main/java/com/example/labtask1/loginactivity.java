package com.example.labtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
    }
    public void  onloginbuttonClicked (View l){
        Intent intent = new Intent(loginactivity.this,signupactivity.class);
        startActivity(intent);
    }

}