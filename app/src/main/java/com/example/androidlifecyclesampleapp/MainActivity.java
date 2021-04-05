package com.example.androidlifecyclesampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String msg = "Prateek";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg,"onCreate");


       //code to hide app icon.....
        PackageManager p = getPackageManager();
        ComponentName componentName = new ComponentName(this, MainActivity.class);
        // activity which is first time open in manifiest file which is declare as <category android:name="android.intent.category.LAUNCHER" />
        p.setComponentEnabledSetting(componentName,PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg,"onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"onResume");
    }
}
