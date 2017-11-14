package com.example.chandrassekhar.spinner;

import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayAdapter<CharSequence> adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=(Spinner)findViewById(R.id.spinner);
        adapter=(ArrayAdapter.createFromResource(this,R.array.spiner,R.layout.support_simple_spinner_dropdown_item));
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapter, View v,
                                       int i, long l) {
                String  SpinerValue = adapter.getItemAtPosition(i).toString();
                if(i>0) {
                    Toast.makeText(getBaseContext(),
                            "You have selected : " + SpinerValue,
                            Toast.LENGTH_SHORT).show();
                }else{
                    //Toast.makeText(getBaseContext(),"select anygame",Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {


            }
        });

    }
}
