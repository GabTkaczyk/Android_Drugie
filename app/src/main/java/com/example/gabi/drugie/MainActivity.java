package com.example.gabi.drugie;

import android.content.Context;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bardzo_layout);

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView1 = (TextView)findViewById(R.id.textView);
                textView1.setText("Wcisnieto przycisk 1");
            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView2 = (TextView)findViewById(R.id.textView);
                textView2.setText("Wcienieto przycisk 2");
            }
        });

        Button button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView3 = (TextView)findViewById(R.id.textView);
                textView3.setText("Wcisnieto przycisk 3");
            }
        });

        Button submit = (Button)findViewById(R.id.button4);
        submit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView ostatni = (TextView)findViewById(R.id.tekstKoniec);
                EditText imie = (EditText)findViewById(R.id.poleImie);
                EditText nazwisko = (EditText)findViewById(R.id.poleNazwisko);
                ostatni.setText(imie.getText() + " " + nazwisko.getText());

//                Context context;
//                context = getApplicationContext();
//                Intent intent = new Intent(context, Obrazek.class);
//                startActivity(intent);

            }
        });

    }
}
