package com.example.ques1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabAccessorAdapter extends FragmentPagerAdapter {
    public TabAccessorAdapter(@NonNull FragmentManager fm){
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                frag1 firstFragment;
                firstFragment = new frag1();
                return firstFragment;
            case 1:
                frag2 secondFragment;
                secondFragment = new frag2();
                return secondFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount(){
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch(position){
            case 0:
                return "Fragment1";
            case 1:
                return "Fragment2";
            default:
                return null;
        }
    }
}
