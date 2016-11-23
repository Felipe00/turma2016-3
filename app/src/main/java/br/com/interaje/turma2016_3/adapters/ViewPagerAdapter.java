package br.com.interaje.turma2016_3.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import br.com.interaje.turma2016_3.fragments.AboutFragment;
import br.com.interaje.turma2016_3.fragments.HelpFragment;

/**
 * Created by sentinel on 23/11/16.
 */

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    CharSequence Titles[];
    // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created
    int NumbOfTabs;

    // Build a Constructor and assign the passed Values to appropriate values in the class
    public ViewPagerAdapter(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        // if the position is 0 we are returning the First tab

        if (position == 0) {
            HelpFragment tab1 = new HelpFragment();
            return tab1;
        } else {
            AboutFragment tab2 = new AboutFragment();
            return tab2;
        }


    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override
    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }
}
