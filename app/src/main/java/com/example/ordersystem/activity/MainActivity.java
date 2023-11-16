package com.example.ordersystem.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.ordersystem.R;

/**
 * 主页面
 * 3个底部tab：首页、购物车、我的，默认显示首页
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}