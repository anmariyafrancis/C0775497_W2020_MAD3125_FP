package com.example.c0775497_w2020_mad3125_fp.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Spinner;

import com.example.c0775497_w2020_mad3125_fp.model.Customer;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class AddNewBillActivity extends AppCompatActivity {

    private Spinner spnBillType;
    private TextInputLayout edtBillId,edtNumber,edtBillDate,edtDataUsed,edtMinsUsed,edtManuftrName;
    private TextInputLayout edtPlanName,edtUnitsUsed,edtAgencyName;
    private TextInputEditText edtBillIdText,edtNumberText,edtBillDateText,edtDataUsedText,edtMinsUsedText,edtManuftrNameText;
    private TextInputEditText edtPlanNameText,edtUnitsUsedText,edtAgencyNameText;
    private Button btnBillAdd,btnBillClear;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    Customer custObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_bill);

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.hide();

        edtBillId = findViewById(R.id.edtBillId);
        edtNumber = findViewById(R.id.edtNumber);
        edtBillDate = findViewById(R.id.edtBillDate);
        edtDataUsed = findViewById(R.id.edtDataUsed);
        edtMinsUsed = findViewById(R.id.edtMinsUsed);
        edtManuftrName = findViewById(R.id.edtManufacName);
        edtPlanName = findViewById(R.id.edtPlanName);
        edtUnitsUsed = findViewById(R.id.edtUnitsUsed);
        edtAgencyName = findViewById(R.id.edtAgencyName);
        edtBillIdText = findViewById(R.id.edtBillIdText);
        edtNumberText = findViewById(R.id.edtNumberText);
        edtBillDateText = findViewById(R.id.edtBillDateText);
        edtDataUsedText = findViewById(R.id.edtDataUsedText);
        edtMinsUsedText = findViewById(R.id.edtMinsUsedText);
        edtManuftrNameText = findViewById(R.id.edtManufacNameText);
        edtPlanNameText = findViewById(R.id.edtPlanNameText);
        edtUnitsUsedText = findViewById(R.id.edtUnitsUsedText);
        edtAgencyNameText = findViewById(R.id.edtAgencyNameText);
        spnBillType = findViewById(R.id.spnBillType);

        btnBillAdd = findViewById(R.id.btnBillAdd);
        btnBillClear = findViewById(R.id.btnBillClear);

    }
}
