package com.example.text04;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.text04.Bean.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentIformation extends AppCompatActivity implements View.OnClickListener {
    private TextView mStuImformation;
    private Button mPrintStuimp;
    private Button mAddStuimp;
    private Button mTonjibtn;
    private List<Student> students;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stuimf);
        initView();
        innte();
    }

    private void initView() {
        mStuImformation = (TextView) findViewById(R.id.stu_imformation);
        mPrintStuimp = (Button) findViewById(R.id.print_stuimp);
        mPrintStuimp.setOnClickListener(this);
        mAddStuimp = (Button) findViewById(R.id.add_stuimp);
        mAddStuimp.setOnClickListener(this);
        mTonjibtn = (Button) findViewById(R.id.tonjibtn);
        mTonjibtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.print_stuimp:
                viewStu();//打印信息
                break;
            case R.id.add_stuimp:
                 addage();
                break;
            case R.id.tonjibtn:

                break;
        }
    }
    //初始化数据
    public void innte(){
        students = new ArrayList<>();
        students.add(new Student(1,"冲天好小子",18));
        students.add(new Student(1,"冲天小号子",21));
        students.add(new Student(1,"冲天自小好",20));
    }

    public void viewStu()
    {
        String string = "";
        for(Student i : students)
        {
            string += i.toString()+"\n";
        }
        mStuImformation.setText(string);
    }

    public void addage()
    {
        for(Student i : students)
        {
            i.setAge(i.getAge()+1);
        }
        Toast.makeText(StudentIformation.this,"增加成功", Toast.LENGTH_SHORT).show();
    }

    public void tonji()
    {
        int sum = 0;
        for(Student i : students)
        {
            if(i.getAge()>20)
            {
                sum += 1;
            }
        }
        Toast.makeText(StudentIformation.this,"年龄大于20的有"+sum+"人", Toast.LENGTH_SHORT).show();
    }
}
