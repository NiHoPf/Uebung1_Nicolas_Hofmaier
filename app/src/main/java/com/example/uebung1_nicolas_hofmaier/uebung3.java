package com.example.uebung1_nicolas_hofmaier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class uebung3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uebung3);

        TextView lblMessage = this.findViewById(R.id.lblMessage);

        Intent intent = this.getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("MESSAGE");
            lblMessage.setText(message);
        }
    }
}