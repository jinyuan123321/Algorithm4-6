package com.example.text04;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mTronned;
    private Button mTelnet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jisuan);
        initView();
    }

    private void initView() {
        mTronned = (EditText) findViewById(R.id.ed_01);
        mTelnet = (Button) findViewById(R.id.btn_01);

        mTelnet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ed_01:
                String str = mTronned.getText().toString().trim();
                Log.e("",""+str);
                int num = Integer.parseInt(str);
                tosum(num);
                break;
        }
    }

    public void tosum(int num){
        if(num >10||num<1)
            Toast.makeText(MainActivity.this,"请输入1~10的数",Toast.LENGTH_LONG).show();
        else
        {
            int a1 = 1;
            double an = 0;
            int sum = 0;
            for(int i = 0;i<num;i++)
            {
                 an = a1*Math.pow(2,i);
                 sum += an;
            }
            Toast.makeText(MainActivity.this,"该数列的前"+num+"项和s="+sum,Toast.LENGTH_SHORT).show();
        }

    }
}
