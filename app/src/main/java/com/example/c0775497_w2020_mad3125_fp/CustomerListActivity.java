package com.example.c0775497_w2020_mad3125_fp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CustomerListActivity extends AppCompatActivity {

    private RecyclerView rvCustomerList;
    private ArrayList customers;
    private ArrayList customersList;
    private CustomerAdapter customerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
        ActionBar mActionBar = getSupportActionBar();
        mActionBar.setTitle("Customers List");
        rvCustomerList = findViewById(R.id.rvCustomerList);
        populateCustomers();

        customerAdapter = new CustomerAdapter(customers);
        RecyclerView.LayoutManager mLinearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvCustomerList.setLayoutManager(mLinearLayoutManager);
        rvCustomerList.setAdapter(customerAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }

    private void populateCustomers() {
        DataSingelton.getInstance().populateData();
        customers = new ArrayList();
        HashMap<String, Customer> customerHashMap = DataSingelton.getInstance().getCustomerMap();
        Collection<Customer> demoValues = customerHashMap.values();
        customersList = new ArrayList<>(demoValues);
        customers.addAll(customersList);
    }
}
