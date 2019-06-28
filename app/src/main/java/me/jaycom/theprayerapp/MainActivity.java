package me.jaycom.theprayerapp;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import me.jaycom.theprayerapp.Adadpters.ViewPagerAdapter;
import me.jaycom.theprayerapp.fragments.MomentBasedFragment;
import me.jaycom.theprayerapp.fragments.TimeBasedFragment;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout_id);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);

        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.AddFragment(new TimeBasedFragment(),"Time based prayers");
        viewPagerAdapter.AddFragment(new MomentBasedFragment(),"Moment based prayers");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);

        ActionBar actionBar=getSupportActionBar();
        actionBar.setElevation(0);
    }
}
