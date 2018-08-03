package com.example.tomato.lesson8tdgiangapplicationb.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;


public class MyBroadCast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.example.tomato.lesson8tdgiangsendbroadcast.CALL_SUB_B")) {

            Bundle bundle = intent.getExtras();
            String text = bundle.getString("hello_B");

            Toast.makeText(context, text, Toast.LENGTH_LONG).show();
        }
    }
}
