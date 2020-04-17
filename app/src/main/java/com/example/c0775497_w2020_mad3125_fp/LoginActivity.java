package com.example.c0775497_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private String emailId,password;
    private String login;
    private EditText txtEmail,txtPassword;
    private CheckBox CheckRemember;
    private Boolean rememberMe;
    private SharedPreferences loginPreferences;
    private SharedPreferences.Editor loginPrefEditor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
