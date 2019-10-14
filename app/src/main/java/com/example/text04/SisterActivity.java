package com.example.text04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class SisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mGetSister;
    private TextView mViewSis;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sister);
        initView();
    }

    private void initView() {
        mGetSister = (Button) findViewById(R.id.get_sister);
        mViewSis = (TextView) findViewById(R.id.view_sis);

        mGetSister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.get_sister:
               getsister();
                break;
        }
    }

    public void getsister()
    {
        String strv = "";//用于打印
        List<Integer> num = new ArrayList<>();//用于保存素数
        int s = 0;//用于记录num长度，num.get(s)-num.get(s-1) = 2
        for(int i= 101;i<=997;i +=2)
        {
            // 不是奇数即不是素数
            if (i % 2 != 1)
                continue;
            //能被3，5，7整除不是素数
            if(i % 3 == 0 ||i % 5 == 0||i % 7 == 0)
                continue;
            num.add(i);//将素数添加进来
            s++;
            if(s<2) //确保长度大于1再进行判断
                continue;
            if(num.get(s) - num.get(s-1) == 2)
            {
                strv = strv +num.get(s)+num.get(s-1)+"是一对姐妹素数\n";
            }
        }
        mViewSis.setText(strv);
    }
}
