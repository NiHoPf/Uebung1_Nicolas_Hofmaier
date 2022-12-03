package com.example.uebung1_nicolas_hofmaier;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;


public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);


        String[] permissions = {
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.MANAGE_EXTERNAL_STORAGE };
        Permissions.check(this, permissions, null, null, new
                PermissionHandler() {
            @Override public void onGranted() {
            }
        });
    }
}
