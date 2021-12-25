package com.example.service1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        Button a=(Button) findViewById(R.id.start);
        Button b=(Button) findViewById(R.id.stop);
        a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent startintent=new Intent(MainActivity.this,MyService.class);
                startService(startintent);
                Toast.makeText(getApplicationContext(), "Service Start", Toast.LENGTH_SHORT).show();
            }
        });
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent stopintent=new Intent(MainActivity.this,MyService.class);
                startService(stopintent);
                Toast.makeText(getApplicationContext(), "Service Stop", Toast.LENGTH_SHORT).show();
            }
        });
    }
}