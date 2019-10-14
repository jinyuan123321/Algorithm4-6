package com.example.text04;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class StuScoreActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText mEd02;
    private Button mBtn02;
    List<Integer> score;
    int bujige = 0;
    int jige = 0;
    int zhongdeng = 0;
    int lianghao = 0;
    int youxiu = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stu);
        initView();
    }

    private void initView() {
        mEd02 = (EditText) findViewById(R.id.ed_02);
        mBtn02 = (Button) findViewById(R.id.btn_02);

        mBtn02.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_02:
               String s = mEd02.getText().toString().trim();
               s.replace(" -1",null);//去除-1
               String[] s2 = s.split(" ");//保存
                score = new ArrayList<>();
                for(String i : s2)          //加入ArrayList<>()；
                {
                    score.add(Integer.parseInt(i));
                }
                getscore(score);
                break;
        }
    }
    public void getscore(List<Integer> num){
        for(Integer i : num)
        {
            int e = i/10;
            if(e<0||e>100)
            {
                Toast.makeText(StuScoreActivity.this,"请输入0~100的数",Toast.LENGTH_SHORT).show();
            }
            else
                panduan(e);
        }
    }

    public void panduan(int e)
    {
        switch (e)
        {
            case 6:
                jige += 1;
                break;
            case 7:
                zhongdeng += 1;
                break;
            case 8:
                lianghao += 1;
                break;
            case 9:
                youxiu += 1;
                break;
            default:
                bujige += 1;
        }
        mEd02.setText("不及格"+bujige+"人及格"+jige+"人中等"+zhongdeng+"人良好"+lianghao+"人优秀"+youxiu+"人");
    }
}
