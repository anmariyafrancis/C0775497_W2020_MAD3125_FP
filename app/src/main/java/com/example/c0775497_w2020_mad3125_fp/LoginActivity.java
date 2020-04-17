package com.example.c0775497_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
        if (v==login){
            InputMethodManager im=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            im.hideSoftInputFromWindow(txtEmail.getWindowToken(),0);
            emailId=txtEmail.getText().toString();
            password=txtPassword.getText().toString();
            if(checkRemember.isChecked()){
                loginPrefEditor.putBoolean("rememberMe",true);
                loginPrefEditor.putString("emailId",emailId);
                loginPrefEditor.putString("password",password);
                loginPrefEditor.commit();
            }
            else {
                loginPrefEditor.clear();
                loginPrefEditor.commit();
            }
            goNext();
        }

    }

    private void goNext() {
        if(txtEmail.getText().toString().equals("anmariya@gmail.com")&&(txtPassword.getText().toString().equals("an123"))){
        startActivity(new Intent(LoginActivity.this,CustomerListActivity.class));
        LoginActivity.this.finish();
    }
    else{

    }
}
