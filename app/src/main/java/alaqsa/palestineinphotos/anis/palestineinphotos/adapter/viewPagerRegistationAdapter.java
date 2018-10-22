package alaqsa.palestineinphotos.anis.palestineinphotos.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import alaqsa.palestineinphotos.anis.palestineinphotos.LoginFragment;
import alaqsa.palestineinphotos.anis.palestineinphotos.SignUpFragment;

public class viewPagerRegistationAdapter extends FragmentPagerAdapter {

    public viewPagerRegistationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0 :
                LoginFragment loginFragment = new LoginFragment();
                return loginFragment;
            case 1:
                SignUpFragment signUpFragment = new SignUpFragment();
                return signUpFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
