package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class AdapterPage extends FragmentPagerAdapter {

    int tabcount;
    public AdapterPage(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0: return new BlankFragment1();
            case 1:return new BlankFragment2();
            case 2:return new BlankFragment3();
            default:return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
