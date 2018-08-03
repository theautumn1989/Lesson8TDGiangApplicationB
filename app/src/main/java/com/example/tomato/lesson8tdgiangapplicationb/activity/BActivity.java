package com.example.tomato.lesson8tdgiangapplicationb.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tomato.lesson8tdgiangapplicationb.R;

public class BActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Intent intent = new Intent(BActivity.this, SubBActivity.class);
        startActivity(intent);
    }
}
