package com.squadpay;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    public TabPagerAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Squads();
            case 1:
                return new Expenses();
            case 2:
                return new Feed();
        }
        return null;

    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3; //No of Tabs
    }
}
