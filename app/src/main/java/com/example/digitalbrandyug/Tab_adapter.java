package com.example.digitalbrandyug;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Tab_adapter  extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public Tab_adapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                EnterNumber enterNumber=new EnterNumber();
                return enterNumber;
            case 1:
                calllogs mcalllogs = new calllogs();
                return mcalllogs;
            case 2:
                contact mcontact = new contact();
                return mcontact;
            default:
                return null;
        }    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
