package com.example.text04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DiGuiActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mJeichengView;
    private Button mDigui;
    private Button mNodigui;
    int sum01 = 6,sum02 = 6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiecheng);
        initView();
    }

    private void initView() {
        mJeichengView = (TextView) findViewById(R.id.jeicheng_view);
        mDigui = (Button) findViewById(R.id.digui);
        mNodigui = (Button) findViewById(R.id.nodigui);

        mDigui.setOnClickListener(this);
        mNodigui.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.digui:
                //递归
                int sum = digui(3,5);
                mJeichengView.setText(sum+"递归算法");
                break;
            case R.id.nodigui:
                int sum01 = feidigui(3,5);
                mJeichengView.setText(sum01+"非递归算法");
                break;
        }
    }
    public int digui(int n,int m)//n为开始，m为结束
    {
        int sum = 6;    //此sum用于保存阶乘的和
        sum01 = sum01*(n+1);
        sum += sum01;
        n++;
        if(n != m)
        {
            digui(n,m);;
        }
        return sum;
    }

    public int feidigui(int n,int m)
    {
        int sum = 6;//此sum用于保存阶乘的和
        for (int i = n;i<m;i++)
        {
            sum02 = sum02*(n+1);
            sum += sum02;
        }
        return sum;
    }
}
