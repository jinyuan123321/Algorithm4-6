package com.example.text04;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.text04.Bean.Circle;
import com.example.text04.Bean.Rectangle;
import com.example.text04.Bean.Shape;
import com.example.text04.Bean.Triangle;

import java.util.ArrayList;
import java.util.List;

public class AreaActivity extends AppCompatActivity {
    private TextView mMianjiView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mianji);
        initView();
    }

    private void initView() {
        mMianjiView = (TextView) findViewById(R.id.mianji_view);
        List<Shape> shape = new ArrayList<>();
        shape.add(new Circle(5));
        shape.add(new Rectangle(6,4));
        shape.add(new Triangle(2,3));
        String str = "";
        for(Shape i : shape)
        {
            i.calArea();
            str = str+i.getArea()+"\n";
        }
        mMianjiView.setText(str);
    }
}
