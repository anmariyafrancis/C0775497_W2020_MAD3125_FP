package com.example.c0775497_w2020_mad3125_fp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.c0775497_w2020_mad3125_fp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private String emailId,password;
    private Button ok;
    private EditText edtxtEmailId,edtxtPassword;
    private CheckBox rememberMe;
    private SharedPreferences loginPreferences;
    private SharedPreferences.Editor loginPrefsEditor;
    private Boolean saveLogin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ok = (Button)findViewById(R.id.btnLogin);
        ok.setOnClickListener(this);
        edtxtEmailId = (EditText)findViewById(R.id.txtEmail);
        edtxtPassword = (EditText)findViewById(R.id.txtPassword);
        rememberMe = (CheckBox)findViewById(R.id.checkRemember);
        loginPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE);
        loginPrefsEditor = loginPreferences.edit();

        saveLogin = loginPreferences.getBoolean("saveLogin", false);
        if (saveLogin == true) {
            edtxtEmailId.setText(loginPreferences.getString("username", ""));
            edtxtPassword.setText(loginPreferences.getString("password", ""));
            rememberMe.setChecked(true);
        }

    }
    public void onClick(View view) {
        if (view == ok) {
            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(edtxtEmailId.getWindowToken(), 0);

            emailId = edtxtEmailId.getText().toString();
            password = edtxtPassword.getText().toString();

            if (rememberMe.isChecked())
            {
                loginPrefsEditor.putBoolean("saveLogin", true);
                loginPrefsEditor.putString("anmariya@gmail.com", emailId);
                loginPrefsEditor.putString("an123", password);
                loginPrefsEditor.commit();

            } else
            {
                loginPrefsEditor.clear();
                loginPrefsEditor.commit();

            }
            goNext();
        }
    }
    public void goNext() {
        if (edtxtEmailId.getText().toString().equals("anmariya@gmail.com") && (edtxtPassword.getText().toString().equals("an123"))) {
            startActivity(new Intent(LoginActivity.this, CustomerListActivity.class));
            LoginActivity.this.finish();
        }

    }
}
