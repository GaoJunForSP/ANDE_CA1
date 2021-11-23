package com.example.ande_ca1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        ArrayList<View> btnToFadeIn = new ArrayList<View>();
        Button btn = (Button) findViewById(R.id.LoginBtn);
        Button btn2 = (Button) findViewById(R.id.BrowseBtn);
        btnToFadeIn.add(btn);
        btnToFadeIn.add(btn2);
        for (View v : btnToFadeIn) {
            v.setAlpha(0); // make invisible to start
        }
        for (View v : btnToFadeIn) {
            v.animate().alpha(1.0f).setDuration(5000).start();
        }
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.BrowseBtn:
                i = new Intent(this, BrowseActivity.class);
                startActivity(i);
                break;
        }
    }
}

