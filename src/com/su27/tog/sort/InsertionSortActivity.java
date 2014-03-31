
package com.su27.tog.sort;

import com.su27.tog.R;
import com.su27.tog.SortBasicActivity;

public class InsertionSortActivity extends SortBasicActivity {

    @Override
    protected void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i;
            int t = array[i];
            while (j > 0 && array[j - 1] > t) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = t;
        }

    }

    @Override
    protected String title() {
        return getString(R.string.inertion_sort);
    }
    
    @Override
    protected String getAssetChartFile() {
        return "insertion_sort.gif";
    }

    @Override
    protected int getCodeResId() {
        return R.drawable.code_insertion_sort;
    }
}
