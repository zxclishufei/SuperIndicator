package com.hejunlin.superindicator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button mCommonViewButton;
    private Button mScrollViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_main);
        initView();
    }

    private void initView() {
        mCommonViewButton = (Button) findViewById(R.id.bt_common);
        mScrollViewButton = (Button) findViewById(R.id.bt_scroll);
        mCommonViewButton.setOnClickListener(this);
        mScrollViewButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()){
            case R.id.bt_common:
                intent  = new Intent(MainActivity.this, TestCommonViewActivity.class);
                break;
            case R.id.bt_scroll:
                intent = new Intent(MainActivity.this, TestScrollViewActivity.class);
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
    }
}
