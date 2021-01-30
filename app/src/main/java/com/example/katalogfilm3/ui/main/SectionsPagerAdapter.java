package com.example.katalogfilm3.ui.main;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

//import ListMoviesFragment;
import com.example.katalogfilm3.listmovies.ListMoviesFragment;
import com.example.katalogfilm3.listtvshow.ListTvShowFragment;
import com.example.katalogfilm3.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_movies, R.string.tab_tv_shows};
    private final Context mContext;
    private ListMoviesFragment moviesFragment;
    private ListTvShowFragment tvShowFragment;

    SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mContext = context;
        moviesFragment = new ListMoviesFragment();
        tvShowFragment = new ListTvShowFragment();
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        if (position == 0) {
            return moviesFragment;
        } else {
            return tvShowFragment;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
