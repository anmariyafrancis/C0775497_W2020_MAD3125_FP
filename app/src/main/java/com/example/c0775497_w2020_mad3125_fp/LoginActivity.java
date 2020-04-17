package com.example.c0775497_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import javax.microedition.khronos.egl.EGLDisplay;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private String emailId,password;
    private Button login;
    private EditText txtEmail,txtPassword;
    private CheckBox checkRemember;
    private Boolean rememberMe;
    private SharedPreferences loginPreferences;
    private SharedPreferences.Editor loginPrefEditor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login= (Button)findViewById(R.id.btnLogin);
        login.setOnClickListener(this);
        txtEmail=(EditText)findViewById(R.id.txtEmail);
        txtPassword=(EditText)findViewById(R.id.txtPassword);
        checkRemember=(CheckBox)findViewById(R.id.checkRemember);
        loginPreferences=getSharedPreferences("loginPref",MODE_PRIVATE);
        loginPrefEditor=loginPreferences.edit();
        rememberMe=loginPreferences.getBoolean("rememberMe",false);

        if(rememberMe==true){
            txtEmail.setText(loginPreferences.getString("emailId",""));
            txtPassword.setText(loginPreferences.getString("password",""));
            checkRemember.setChecked(true);
        }
    }

    public void onClick(View v) {

    }
}
