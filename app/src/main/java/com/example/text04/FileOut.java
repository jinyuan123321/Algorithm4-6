package com.example.text04;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut extends AppCompatActivity {
    private TextView mFileOut;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mFileOut = (TextView) findViewById(R.id.File_out);
        String[] values = {"F","E","D","C","B","A"};
        String string = "";
        for(String i : values)
        {
            string += i;
        }
        File file = new File("c:\\新建文件夹\\WriteArr.txt");
        FileOutputStream fileOutputStream = null;
        try {
           fileOutputStream = new FileOutputStream(file);
           fileOutputStream.write(string.getBytes());
           fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
        }
        mFileOut.setText(string);
    }
}
