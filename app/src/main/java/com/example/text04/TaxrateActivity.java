package com.example.text04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TaxrateActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mInputGonzi;
    private Button mKoding;
    private TextView mViewTax;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.taxrate);
        initView();

    }

    private void initView() {
        mInputGonzi = (EditText) findViewById(R.id.input_gonzi);
        mKoding = (Button) findViewById(R.id.koding);
        mViewTax = (TextView) findViewById(R.id.view_tax);
        mKoding.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.koding:
                String s = mInputGonzi.getText().toString().trim();
                int num = Integer.parseInt(s);
                getTax(num);
                break;
        }
    }

    public void getTax(int num)
    {
        double tax = 0;
        if(num < 0)
            Toast.makeText(TaxrateActivity.this,"工资不能小于0",Toast.LENGTH_SHORT).show();
        else if (num <=1500) {
            tax = num*0.05;
            mViewTax.setText("你要交的税为："+tax);
        }
        else if (num <=4500 )
        {
            tax = num*0.1;
            mViewTax.setText("你要交的税为："+tax);
        }
        else if(num <= 9000)
        {
            tax = num*0.2;
            mViewTax.setText("你要交的税为："+tax);
        }else if(num <= 35000)
        {
            tax = num*0.25;
            mViewTax.setText("你要交的税为："+tax);
        }else if(num <= 55000)
        {
            tax = num*0.3;
            mViewTax.setText("你要交的税为："+tax);
        }else if(num <= 80000)
        {
            tax = num*0.35;
            mViewTax.setText("你要交的税为："+tax);
        }else
        {
            tax = num*0.45;
            mViewTax.setText("你要交的税为："+tax);
        }
    }

}
