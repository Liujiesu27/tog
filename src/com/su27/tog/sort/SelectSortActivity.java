
package com.su27.tog.sort;

import com.su27.tog.R;
import com.su27.tog.SortBasicActivity;

public class SelectSortActivity extends SortBasicActivity {

    @Override
    protected void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    @Override
    protected String title() {
        return getString(R.string.select_sort);
    }

}
