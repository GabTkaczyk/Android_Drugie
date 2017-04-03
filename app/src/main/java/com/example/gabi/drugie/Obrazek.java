package com.example.gabi.drugie;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Obrazek extends AppCompatActivity {

    public static Boolean obr = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrazek);
    }
    ///---------------------
    public void zmienObrazek( View v )
    {
        if( obr == true )
        {
            obr = false;
            ImageView imageView = (ImageView)findViewById(R.id.android);
            imageView.setImageResource(R.mipmap.android2);
        }
        else//obr = false
        {
            obr = true;
            ImageView imageView = (ImageView)findViewById(R.id.android);
            imageView.setImageResource(R.mipmap.android);
        }

    }

    public void poprzedniaAktywnosc( View v )
    {
        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context, MainActivity.class);
        startActivity(intent);
    }

    public void poprzedniObrazek( View v )
    {
        if( obr == true )
        {
            obr = false;
            ImageView imageView = (ImageView)findViewById(R.id.android);
            imageView.setImageResource(R.mipmap.android2);
        }
        else//obr = false
        {
            obr = true;
            ImageView imageView = (ImageView)findViewById(R.id.android);
            imageView.setImageResource(R.mipmap.android);
        }
    }
}
