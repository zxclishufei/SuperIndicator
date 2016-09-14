package com.hejunlin.superindicator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.loop.CircleIndicator;
import com.loop.LoopViewPager;

public class TestCommonViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_common);
        LoopViewPager viewpager = (LoopViewPager) findViewById(R.id.viewpager);
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        viewpager.setAdapter(new PicAdapter(TestCommonViewActivity.this));
//        viewpager.setLooperPic(true);
        indicator.setViewPager(viewpager);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        finish();
    }
}
