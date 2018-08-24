package com.example.zjl.gitwithdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
        initTest();
    }

    private void initTest() {
        Toast.makeText(this,"测试git,所以不弹出",Toast.LENGTH_SHORT);
    }

    private void initListener() {
        findViewById(R.id.request).setOnClickListener(v -> {
            Toast.makeText(this,"点击了获取",Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.clear).setOnClickListener(v -> {
            Toast.makeText(this,"点击了清除",Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.download).setOnClickListener(v -> {
            Toast.makeText(this,"点击了下载",Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.btn).setOnClickListener(v -> {
            Intent intent = new Intent(this,TestActivity.class);
            startActivity(intent);
        });
    }

    private void initView() {
    }
}
