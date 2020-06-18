package com.example.androidlabs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox theCheckBox = findViewById(R.id.theCheckBox);
        theCheckBox.setOnClickListener( v ->
                Toast.makeText(MainActivity.this, getResources().getString(R.string.toast_message), Toast.LENGTH_LONG).show());

        Switch theSwitch = findViewById(R.id.theSwitch);
        theSwitch.setOnCheckedChangeListener(((buttonView, isChecked) -> {
            Snackbar.make(theSwitch, "The switch is now", Snackbar.LENGTH_LONG).show();
        }));
    }
}