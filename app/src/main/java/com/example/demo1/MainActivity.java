package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtMessage;
    private Button btnA, btnB, btnSlut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMessage = findViewById(R.id.txtMessage);

        btnA = findViewById(R.id.btnA);
        btnB = findViewById(R.id.btnB);
        btnSlut = findViewById(R.id.btnSlut);

        btnSlut.setOnClickListener( v ->{
            txtMessage.setText("Du klikkede på slut");
        });

        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
    }

    public void klikHandler(View view) {
        txtMessage.setText("Du klikkede på start");
    }

    public void klikA(View view){
        txtMessage.setText("Fuck you");
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnA) {
            txtMessage.setText("Du klikkede på knap A");
        }
        if(view.getId() == R.id.btnB) {
            txtMessage.setText("Du klikkede på knap B");
        }
    }
}