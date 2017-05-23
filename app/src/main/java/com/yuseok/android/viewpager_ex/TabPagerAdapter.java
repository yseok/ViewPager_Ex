package com.yuseok.android.viewpager_ex;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by YS on 2017-05-23.
 */
public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                OneFragment oneFragment = new OneFragment();
                return oneFragment;
            case 1:
                TwoFragment twoFragment = new TwoFragment();
                return twoFragment;
            case 2:
                ThreeFragment threeFragment = new ThreeFragment();
                return threeFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
