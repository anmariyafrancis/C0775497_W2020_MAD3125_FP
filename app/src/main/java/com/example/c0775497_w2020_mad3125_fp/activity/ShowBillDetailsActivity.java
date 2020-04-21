package com.example.c0775497_w2020_mad3125_fp.activity;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c0775497_w2020_mad3125_fp.BillFragment;
import com.example.c0775497_w2020_mad3125_fp.R;
import com.example.c0775497_w2020_mad3125_fp.Sign;
import com.example.c0775497_w2020_mad3125_fp.model.Bill;
import com.example.c0775497_w2020_mad3125_fp.model.Customer;

import java.util.ArrayList;

public class ShowBillDetailsActivity extends AppCompatActivity {

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    private TextView txtTotal;
    private ImageView imgBtnAdd;
    private TextView txtId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bill_details);

        Intent mIntent = getIntent();
        Customer customerObj = mIntent.getParcelableExtra("CustomerBills");

        ArrayList<Bill> bills = customerObj.getBills();

        txtTotal = findViewById(R.id.txtTotal);
        imgBtnAdd = findViewById(R.id.imgBtnAdd);
        txtId = findViewById(R.id.txtId);

        imgBtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(ShowBillDetailsActivity.this, AddNewBillActivity.class);
                startActivity(mIntent);
            }
        });

        txtId.setText(customerObj.getCustomerId());
        txtTotal.setText(Sign.getInstance().doubleFormatter(customerObj.getTotalAmount()));

        ActionBar mActionBar = getSupportActionBar();
        mActionBar.hide();

        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.container, new BillFragment());
        mFragmentTransaction.commit();

    }
}
