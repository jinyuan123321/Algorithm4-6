package com.example.text04.Bean;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.text04.R;

public class AvgmaxminActivity extends AppCompatActivity {
    private TextView mSangezhi;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maxavgmin);
        initView();
    }

    private void initView() {
        mSangezhi = (TextView)findViewById(R.id.sangezhi);
        double[] nums = {9.8,12,45,67,23,1.98,2.55,45};
        double max = 0,min = 0,avg = 0,sum = 0;
        for(int i = 0;i<nums.length;i++)
        {
            sum += nums[i];
            if(i == 0)
            {
                max = nums[i];
                min = nums[i];
            }
            else
            {
                if(max<nums[i])
                    max = nums[i];
                if(min>nums[i])
                    min = nums[i];
            }
        }
        avg = sum/(nums.length-1);
        mSangezhi.setText("平均值为"+avg+"最大值为"+max+"最小值为"+min);
    }
}
