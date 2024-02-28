package com.example.rediapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NavigationActivity extends AppCompatActivity {

    ViewPager sliderViewPager;
    ViewPagerAdapter viewPagerAdapter;
    Button skip_btn_onboard, next_btn_onboard;


    ViewPager.OnPageChangeListener viewPagerListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        skip_btn_onboard = findViewById(R.id.skip_btn_onboard);
        next_btn_onboard = findViewById(R.id.next_btn_onboard);

        next_btn_onboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(getItem(0)<1){
                    sliderViewPager.setCurrentItem(getItem(1), true);
                } else{
                    Intent intent = new Intent(NavigationActivity.this, GetStarted.class);
                    startActivity(intent);

                }
            }
        });

        skip_btn_onboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NavigationActivity.this, GetStarted.class);
                startActivity(intent);


            }
        });

        sliderViewPager = findViewById(R.id.sliderViewPager);

        viewPagerAdapter = new ViewPagerAdapter(this);
        sliderViewPager.setAdapter(viewPagerAdapter);
    }

    private int getItem(int i){
        return sliderViewPager.getCurrentItem()+i;
    }
}