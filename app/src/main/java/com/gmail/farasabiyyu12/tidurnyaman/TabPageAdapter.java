package com.gmail.farasabiyyu12.tidurnyaman;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 *
 * Created by farasabiyyuhandoko on 12/05/18.
 */

public class TabPageAdapter extends FragmentPagerAdapter {

    //TODO Jumlah Halaman
    public static int PAGE_COUNT = 3;

    //TODO Judul Tab
    private String judulTab[] = new String[] {"Lingkungan Nyaman", "Santai Dulu", "Tidak Gelisah"};


    public TabPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentPertama();
            case 1:
                return new FragmentKedua();
            case 2:
                return new FragmentKetiga();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return judulTab[position];
    }
}
