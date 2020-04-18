package com.example.c0775497_w2020_mad3125_fp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class CustomerListActivity extends AppCompatActivity {

    private RecyclerView rvCustomerList;
    private ArrayList customers;
    private ArrayList customersList;
    private CustomerAdapter customerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        ActionBar mActionBar=getSupportActionBar();
        mActionBar.setTitle("Customers List");
        rvCustomerList=findViewById(R.id.rvCustomerList);
        populateCustomers();

        customerAdapter=new CustomerAdapter(customers);
        RecyclerView.LayoutManager mLinearLayoutManager=new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        rvCustomerList.setLayoutManager(mLinearLayoutManager);
        rvCustomerList.setAdapter(customerAdapter);
    }

    private void populateCustomers() {
    }
}
