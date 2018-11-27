package com.example.aweso.csc250androidstarter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Rot13LargeTextActivity extends AppCompatActivity
{
    private EditText outputET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rot13_large_text);
        this.outputET = (EditText)this.findViewById(R.id.outputET);
        //String value = this.getIntent().getStringExtra("passedValue");
        String value = Core.passedValue;
        this.outputET.setText(value);

    }


}
