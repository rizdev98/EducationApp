package com.educationapp;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class PagerAdapter extends FragmentStatePagerAdapter{

    List<Fragment> fragmentList;
    public PagerAdapter(FragmentManager fm, List<Fragment> fragmentList){
        super(fm ,FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.fragmentList = fragmentList;
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    @Override
    public Fragment getItem(int position){
        return fragmentList.get(position);

    }


}
