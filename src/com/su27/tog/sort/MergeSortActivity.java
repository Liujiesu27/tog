
package com.su27.tog.sort;

import com.su27.tog.R;
import com.su27.tog.SortBasicActivity;

public class MergeSortActivity extends SortBasicActivity {

    @Override
    protected void sort(int[] array) {
        int[] sort = new int[array.length];
        mergesort(array, 0, array.length, sort);
    }

    private void mergearray(int[] unsort, int l, int r, int mid, int[] sort) {
        int s1 = l;
        int s2 = mid;
        int i = 0;
        while (s1 < mid && s2 < r) {
            if (unsort[s1] < unsort[s2]) {
                sort[i++] = unsort[s1++];
            } else {
                sort[i++] = unsort[s2++];
            }
        }
        while (s1 < mid) {
            sort[i++] = unsort[s1++];
        }
        while (s2 < r) {
            sort[i++] = unsort[s2++];
        }
        for (int v = 0; v < i; v++) {
            unsort[l + v] = sort[v];
        }
    }

    private void mergesort(int[] unsort, int l, int r, int[] sort) {
        if (l + 1 < r) {
            int mid = (l + r) / 2;
            mergesort(unsort, l, mid, sort);
            mergesort(unsort, mid, r, sort);
            mergearray(unsort, l, r, mid, sort);
        }
    }

    @Override
    protected String title() {
        return getString(R.string.merge_sort);
    }

    @Override
    protected String getAssetChartFile() {
        return "merge_sort.gif";
    }
    
    @Override
    protected int getCodeResId() {
        return R.drawable.code_merge_sort;
    }

    @Override
    protected String getAssetPrincipleFile() {
        return "principle_merge_sort.html";
    }
}
