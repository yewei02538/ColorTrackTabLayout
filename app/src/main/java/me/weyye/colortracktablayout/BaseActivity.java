package me.weyye.colortracktablayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import me.weyye.library.colortrackview.ColorTrackTabLayout;

public abstract class BaseActivity extends AppCompatActivity {
    protected String[] titles;
    protected ColorTrackTabLayout mTab;
    protected ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadViewLayout();
        initView();
        initTab();
    }

    protected abstract void loadViewLayout();

    protected void initView() {
        mTab = (ColorTrackTabLayout) findViewById(R.id.tab);
//        TabLayout tab = (TabLayout) findViewById(R.id.tab);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);


    }

    protected void initTab() {
        final List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            fragments.add(MyFragment.newInstance());
        }


        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return titles.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
        });
        mTab.setupWithViewPager(mViewPager);
    }
}
