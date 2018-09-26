package com.example.student.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity implements{ AdapterView.OnItemSelectedListener

    {
        String[] banknames={"IOB","SBI","HDFC"};
    }
@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main1);
    Spinner spin = (Spinner) findViewById(R.id.spinner);
    spin.setOnItemSelectedListener(this);
    ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, banknames);
    aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    spin.setAdapter(aa);

}
    Spinner spin=(Spinner)findViewById(R.id.spinner);
        spin.setOnItemSelectedListener(this);
    ArrayAdapter aa=new ArrayAdapter(this,android.R.layout.simple_spinner_item,banknames);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spin.setAdapter(aa);

}
