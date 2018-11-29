package com.example.aweso.csc250androidstarter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    private TextView decodeTV, outputTV;
    private EditText inputET;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //non-static (instance) context
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        //this - how an object refers to itself from within itself
        //this is this particular instance of Activity
        this.decodeTV = (TextView)this.findViewById(R.id.decodeTV);
        this.inputET = (EditText)this.findViewById(R.id.inputET);
        this.outputTV = (TextView)this.findViewById(R.id.outputTV);

    }

    public void largeTextbuttonPressed(View v)
    {
        Intent i = new Intent(this, Rot13LargeTextActivity.class);
        //i.putExtra("passedValue", this.outputTV.getText().toString());
        Core.passedValue = this.outputTV.getText().toString();
        this.startActivity(i);
    }

    public void decodeButtonPressed(View v)
    {
        char encoded = this.outputTV.getText().toString().charAt(0);
        char decoded = Core.rot13(encoded);
        this.decodeTV.setText("" + decoded);
    }

    public void goButtonPressed(View v)
    {
        String input = this.inputET.getText().toString();
        this.outputTV.setText("" + Core.rot13(input.charAt(0)));
        //outputTV.setText("" + (int)input.charAt(0));
    }

    public void runtimeInterfaceButtonPressed(View v)
    {
        Intent i = new Intent(this, RuntimeInterfaceActivity.class);
        this.startActivity(i);
    }
    public char rot13_4(char c)
    {
        return (char)(65 + ((((int)c) + 13) % 26));
    }


































}
