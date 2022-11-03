package com.example.uebung1_nicolas_hofmaier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSendMessage = this.findViewById(R.id.btnSendMessage);

        EditText edtMessage = this.findViewById(R.id.edtMessage);

        TextView txtMessage = this.findViewById(R.id.txtMessage);

        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message = edtMessage.getText().toString();
                txtMessage.setText(message);

                Intent intent = new Intent(MainActivity.this, uebung3.class);
                intent.putExtra("MESSAGE", message);

                startActivity(intent);
            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("TAG", "onPause!");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"Hello World! Hallo H-KA!", Toast.LENGTH_SHORT).show();
        Log.i("TAG", "onResume!");
    }

    public void openUrl(View view)
    {
        EditText txtUrl = this.findViewById(R.id.edtUrl);
        String url =txtUrl.getText().toString();

        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        Intent browserChooser = Intent.createChooser(browserIntent,  "Wähle einen Browser");
    this.startActivity(browserChooser);

    }
}