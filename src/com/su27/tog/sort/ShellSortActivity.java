
package com.su27.tog.sort;

import com.su27.tog.R;
import com.su27.tog.SortBasicActivity;

public class ShellSortActivity extends SortBasicActivity {

    @Override
    protected void sort(int[] array) {
        int i, j, gap;
        for (gap = array.length / 2; gap > 0; gap /= 2) {
            for (i = gap; i < array.length; i++) {
                for (j = i - gap; j >= 0 && array[j] > array[j + gap]; j -= gap) {
                    int temp = array[j];
                    array[j] = array[j + gap];
                    array[j + gap] = temp;
                }
            }
        }

    }

    @Override
    protected String title() {
        return getString(R.string.shell_sort);
    }

    @Override
    protected String getAssetChartFile() {
        return "shell_sort.gif";
    }

    @Override
    protected int getCodeResId() {
        return R.drawable.code_shell_sort;
    }

    @Override
    protected String getAssetPrincipleFile() {
        return "principle_shell_sort.html";
    }
}
