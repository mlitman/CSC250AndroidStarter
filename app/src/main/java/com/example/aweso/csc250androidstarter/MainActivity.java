package com.example.aweso.csc250androidstarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //non-static (instance) context
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        //this - how an object refers to itself from within itself
        //this is this particular instance of Activity


    }

    public void someButtonWasPressed(View v)
    {
        Button b = (Button)v;
        TextView appNameTV = (TextView)this.findViewById(R.id.appNameTV);
        appNameTV.setText(b.getText().toString());
    }

    public void lolButtonPressed(View v)
    {
        TextView appNameTV = (TextView)this.findViewById(R.id.appNameTV);
        appNameTV.setText("LOL");
    }

    public void wootButtonPressed(View v)
    {
        TextView appNameTV = (TextView)this.findViewById(R.id.appNameTV);
        appNameTV.setText("WOOT");
    }

    public void blaineButtonPressed(View v)
    {
        TextView appNameTV = (TextView)this.findViewById(R.id.appNameTV);
        appNameTV.setText("BLAINE");
    }
}
