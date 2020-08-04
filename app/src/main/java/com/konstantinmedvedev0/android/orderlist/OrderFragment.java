package com.konstantinmedvedev0.android.orderlist;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static android.widget.CompoundButton.*;

public class OrderFragment extends Fragment {
    private Order mOrder;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mOrder = new Order();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View v = inflater.inflate(R.layout.fragment_order,container,false);
       mTitleField = v.findViewById(R.id.order_title);
       mTitleField.addTextChangedListener(new TextWatcher() {
           @Override
           public void beforeTextChanged(CharSequence s, int start, int count, int after) {
               // пока ничего не пишем
           }

           @Override
           public void onTextChanged(CharSequence s, int start, int before, int count) {
                mOrder.setTitle(s.toString());
           }

           @Override
           public void afterTextChanged(Editable s) {
                // и здесь тоже
           }
       });

       mDateButton = v.findViewById(R.id.order_date);
       mDateButton.setText(mOrder.getDate().toString());
       mDateButton.setEnabled(false);

       mSolvedCheckBox = v.findViewById(R.id.order_done);
       mSolvedCheckBox.setOnCheckedChangeListener(new OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
               mOrder.setDone(isChecked);

           }
       });
       return v;
    }

}
