package org.ridemetro.webmobile.theapptab;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.TabLayout);
        appBarLayout = (AppBarLayout)findViewById(R.id.AppBarId);
        viewPager = (ViewPager)findViewById(R.id.ViewPager);

        ViewPagerAdapater adapater = new ViewPagerAdapater((getSupportFragmentManager()));

        // Adding Fragments
        adapater.AddFragment(new FragmentF01(),"Home");
        adapater.AddFragment(new FragmentF02(),"About");

        //adapter setup
        viewPager.setAdapter(adapater);
        tabLayout.setupWithViewPager(viewPager);
    }
}
