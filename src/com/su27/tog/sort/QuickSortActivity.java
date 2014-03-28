
package com.su27.tog.sort;

import com.su27.tog.R;
import com.su27.tog.SortBasicActivity;

public class QuickSortActivity extends SortBasicActivity {

    @Override
    protected void sort(int[] array) {

        if (array == null || array.length == 0) {
            return;
        }

        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int l, int r) {
        if (array == null || array.length == 0) {
            return;
        }
        if (l >= r) {
            return;
        }
        int i = l;
        int j = r;
        int x = array[i];
        while (i < j) {
            while (i < j && x >= array[j]) {
                j--;
            }
            if (i < j) {
                array[i++] = array[j];
            }
            while (i < j && x <= array[i]) {
                i++;
            }
            if (i < j) {
                array[j--] = array[i];
            }

        }
        array[i] = x;
        quickSort(array, l, i - 1);
        quickSort(array, i + 1, r);

    }

    @Override
    protected String title() {
        return getString(R.string.quick_sort);
    }

    @Override
    protected String getAssetChartFile() {
        return "quick_sort.gif";
    }

}
