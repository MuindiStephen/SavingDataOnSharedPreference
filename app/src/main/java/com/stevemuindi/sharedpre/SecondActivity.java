package com.stevemuindi.sharedpre;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Stephen on 08/07/2022.
 */

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";
    private TextView mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mName = findViewById(R.id.etName_SL);

        SharedPreferences mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = mPreferences.edit();

        String name = mPreferences.getString(getString(R.string.name), "");
        mName.setText(name);

    }
}