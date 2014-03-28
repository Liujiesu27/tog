package com.su27.tog.sort;

import com.su27.tog.R;
import com.su27.tog.SortBasicActivity;


public class ShellSortActivity extends SortBasicActivity {

    @Override
    protected void sort(int[] array) {

    }

    @Override
    protected String title() {
        return getString(R.string.shell_sort);
    }
    
    @Override
    protected String getAssetChartFile() {
        return "shell_sort.gif";
    }

}
