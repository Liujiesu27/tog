
package com.su27.tog.sort;

import com.su27.tog.R;
import com.su27.tog.SortBasicActivity;

public class BubbleSortActivity extends SortBasicActivity {

    protected void sort(int[] array) {
        if (array != null && array.length > 0) {
            for (int i = 1; i < array.length; i++) {
                for (int j = 0; j < array.length - i; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }
    }

    protected String title() {
        return getString(R.string.bubble_sort);
    }

    @Override
    protected String getAssetChartFile() {
        return "bubble_sort.gif";
    }

    @Override
    protected int getCodeResId() {
        return R.drawable.code_bubble_sort;
    }

}
