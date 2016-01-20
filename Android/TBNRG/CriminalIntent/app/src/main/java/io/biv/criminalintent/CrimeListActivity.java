package io.biv.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by andrea on 1/11/16.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
