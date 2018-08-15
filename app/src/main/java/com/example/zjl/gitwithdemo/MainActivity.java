package com.example.zjl.gitwithdemo;

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
    }

    private void initListener() {
        findViewById(R.id.request).setOnClickListener(v -> {
            Toast.makeText(this,"点击了获取",Toast.LENGTH_SHORT).show();
        });

        findViewById(R.id.clear).setOnClickListener(v -> {
            Toast.makeText(this,"点击了清除",Toast.LENGTH_SHORT).show();
        });
    }

    private void initView() {
    }
}
