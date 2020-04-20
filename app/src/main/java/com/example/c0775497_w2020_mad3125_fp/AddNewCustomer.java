package com.example.c0775497_w2020_mad3125_fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class AddNewCustomer extends AppCompatActivity {

    private EditText edtxtId,edtxtFirstName,edtxtLastName,edtxtBirth;
    private RadioButton rdBtnMale,rdBtnFemale,rdBtnOther;
    private EditText edtxtEmail,edtxtUserName,edtxtPassword,edtxtAdress;
    private Button btnAdd,btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_customer);
    }
}
