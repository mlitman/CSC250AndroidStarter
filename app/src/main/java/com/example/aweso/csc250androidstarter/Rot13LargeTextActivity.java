package com.example.aweso.csc250androidstarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Rot13LargeTextActivity extends AppCompatActivity
{
    private EditText outputET;
    private EditText inputET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rot13_large_text);
        this.outputET = (EditText)this.findViewById(R.id.outputET);
        this.inputET = (EditText)this.findViewById(R.id.inputET);
    }

    public void convertButtonPressed(View v)
    {
        String input = this.inputET.getText().toString();
        String answer = "";
        for(int i = 0; i < input.length(); i++)
        {
            answer = answer + Core.rot13(input.charAt(i));
        }
        this.inputET.setText(answer);
    }
}
