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

        edtxtId=findViewById(R.id.edtxtId);
        edtxtFirstName=findViewById(R.id.edtxtFirstName);
        edtxtLastName=findViewById(R.id.edtxtLastName);
        edtxtBirth=findViewById(R.id.edtxtBirth);
        edtxtUserName=findViewById(R.id.edtxtUserName);
        edtxtEmail=findViewById(R.id.edtxtEmail);
        edtxtUserName=findViewById(R.id.edtxtUserName);
        edtxtPassword=findViewById(R.id.edtxtPassword);
        edtxtAdress=findViewById(R.id.edtxtAddress);
        rdBtnMale=findViewById(R.id.rdBtnMale);
        rdBtnFemale=findViewById(R.id.rdBtnFemale);
        rdBtnOther=findViewById(R.id.rdBtnOther);
        btnAdd=findViewById(R.id.btnAdd);
        btnClear=findViewById(R.id.btnClear);


    }
}
