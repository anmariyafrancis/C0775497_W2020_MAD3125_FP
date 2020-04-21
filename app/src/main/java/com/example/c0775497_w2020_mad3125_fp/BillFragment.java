package com.example.c0775497_w2020_mad3125_fp;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.c0775497_w2020_mad3125_fp.model.Bill;
import com.example.c0775497_w2020_mad3125_fp.model.Customer;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class BillFragment extends Fragment {
    private TextView txtBillId;
    private TextView txtBillDate;
    private TextView txtBillAmount;
    double totalAmount;

    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;

    public BillFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_bill, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);
        txtBillId = getView().findViewById(R.id.txtBillId);
        txtBillDate = getView().findViewById(R.id.txtBillDate);
        txtBillAmount = getView().findViewById(R.id.txtBillAmount);
        Intent mIntent = getActivity().getIntent();
        Customer customerObj = mIntent.getParcelableExtra("CustomerBills");


        ArrayList<Bill> bills = customerObj.getBills();
        for(int j = 0; j< bills.size(); j++)
        {
            totalAmount += bills.get(j).getBillTotal();
        }

        for(int i =0; i <bills.size(); i++)
        {
            if(bills.get(i).getBillType().equals(Bill.BillType.Mobile))
            {
                txtBillId.setText(bills.get(i).getBillId());
                txtBillAmount.setText(Sign.getInstance().doubleFormatter(bills.get(i).billCalculation()));
                txtBillDate.setText(bills.get(i).getBillDate().toString());
            }

            if(bills.get(i).getBillType().equals(Bill.BillType.Hydro))
            {
                txtBillId.setText(bills.get(i).getBillId());
                txtBillAmount.setText(Sign.getInstance().doubleFormatter(bills.get(i).billCalculation()));
                txtBillDate.setText(bills.get(i).getBillDate().toString());
            }

            if(bills.get(i).getBillType().equals(Bill.BillType.Internet))
            {
                txtBillId.setText(bills.get(i).getBillId());
                txtBillAmount.setText(Sign.getInstance().doubleFormatter(bills.get(i).billCalculation()));
                txtBillDate.setText(bills.get(i).getBillDate().toString());
            }
        }
    }
}
