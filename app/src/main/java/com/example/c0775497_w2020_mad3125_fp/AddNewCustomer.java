package com.example.c0775497_w2020_mad3125_fp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.Calendar;

public class AddNewCustomer extends AppCompatActivity {

    private EditText edtxtId,edtxtFirstName,edtxtLastName,edtxtBirth;
    private RadioButton rdBtnMale,rdBtnFemale,rdBtnOther;
    private EditText edtxtEmail,edtxtUserName,edtxtPassword,edtxtAdress;
    private Button btnAdd,btnClear;

    private DatePickerDialog.OnDateSetListener mDateSetListener;

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

        ActionBar mActionBar=getSupportActionBar();
        mActionBar.hide();

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fieldCheck();

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fieldClear();
            }
        })
        addDatePicker();
    }

    private void fieldClear() {
    }

    private void fieldCheck() {
        boolean flag=false;
        if(edtxtId.getText().toString().isEmpty());
        {
            edtxtId.setError("enter customer Id");
            flag=true;
            return;
        }
        if(edtxtFirstName.getText().toString().isEmpty())
        {
            edtxtFirstName.setError("enter first name");
            flag=true;
            return;
        }
        if(edtxtLastName.getText().toString().isEmpty()){
            edtxtLastName.setError("enter last name");
            flag=true;
            return;
        }
        if(edtxtBirth.getText().toString().isEmpty()){
            edtxtBirth.setError("enter date of birth");
            flag=true;
            return;
        }
        if(edtxtUserName.getText().toString().isEmpty()){
            edtxtBirth.setError("enter username");
            flag=false;
            return;
        }
        if(edtxtEmail.getText().toString().isEmpty()){
            edtxtEmail.setError("enter email");
            flag=false;
            return;
        }
        if(edtxtPassword.getText().toString().isEmpty()){
            edtxtPassword.setErrorEnabled(true);
            edtxtPassword.setError("enter password");
            flag=true;
            return;
        }
        if(edtxtAdress.getText().toString().isEmpty()){
            edtxtAdress.setError("enter address");
            flag=true;
            return;
        }
        if(!flag){
            if(getGender().equals("Female")){
                Customer customer=new Customer(edtxtId.getText().toString(),edtxtFirstName.getText().toString(),edtxtLastName.getText().toString(),getGender(),edtxtEmail.getText().toString(),edtxtUserName.getText().toString(),edtxtPassword.getText().toString(),edtxtAdress.getText().toString(),edtxtBirth.getText().toString());
               DataSingelton.getInstance().getCustomerMap().put(Customer.getCustomerId)
            }
        }
    }

    public String getGender() {
        if (rdBtnMale.isChecked()){
            return "Male";
        }
        else if (rdBtnFemale.isChecked()){
            return "Female";
        }
        else if(rdBtnOther.isChecked()){
            return "Other";
        }
    }


    private void addDatePicker() {
        edtxtBirth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calender cal= Calendar.getInstance();
                int year=cal.get(Calendar.YEAR);
                int month=cal.get(Calendar.MONTH);
                int day=cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog=new DatePickerDialog(AddNewCustomer.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                String date = "";
                month = month + 1;
                String monthName = getMonthName(month);
                if (day < 10) {
                    date = "0" + day + "/" + monthName + "/" + year;
                } else {
                    date = day + "/" + monthName + "/" + year;
                }
                edtxtBirth.setText(date);
            }
        };
    }
    public static String getMonthName(int monthNumber) {
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec"};
        return monthNames[monthNumber - 1];
    }

}
