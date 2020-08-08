package com.crazy.triveous;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.crazy.triveous.Tabs.Tab1;
import com.crazy.triveous.Tabs.Tab2;
import com.crazy.triveous.Tabs.Tab3;
import com.crazy.triveous.Tabs.Tab4;
import com.crazy.triveous.Tabs.Tab5;
import com.crazy.triveous.Tabs.Tab6;
import com.crazy.triveous.Tabs.Tab7;


/**
 * Created by Priyabrat on 21-08-2015.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            case 3:
                Tab4 tab4 = new Tab4();
                return tab4;
            case 4:
                Tab5 tab5 = new Tab5();
                return tab5;
            case 5:
                Tab6 tab6 = new Tab6();
                return tab6;
            case 6:
                Tab7 tab7 = new Tab7();
                return tab7;
                default:
                 return null;
        }

 //All tabs
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;
        if (position == 0) {
            title = "Top Trending";
        } else if (position == 1) {
            title = "International";
        } else if (position == 2) {
            title = "India";
        }else if (position == 3) {
            title = "Health";
        }else if (position == 4) {
            title = "Sports";
        }else if (position == 5) {
            title = "Entertainment";
        }else if (position == 6) {
            title = "Lifestyle";}
        return title;
    }
}
