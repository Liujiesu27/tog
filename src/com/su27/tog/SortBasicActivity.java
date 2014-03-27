
package com.su27.tog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

import java.util.Random;

public abstract class SortBasicActivity extends Activity implements
        OnClickListener {
    private static final String LOG_TAG = "SortBasicActivity";

    private TextView mTVShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
        mTVShow = (TextView) findViewById(R.id.tv_show);
        setTitle(title());
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_display:
                onDisplayClick(mTVShow);
                break;
        }

    }

    protected int[] getRandomArray(int length, int max) {
        int[] array = new int[length];
        Random r = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = r.nextInt(max);
        }
        return array;
    }

    protected String print(int[] array) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sb.append(array[i]);
                if (i != array.length - 1) {
                    sb.append(",");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    protected abstract void sort(int[] array);
    
    protected abstract String title();

    protected void onDisplayClick(TextView showView) {
        int[] array = getRandomArray(10, 100);
        String str1 = print(array);
        sort(array);
        String str2 = print(array);
        showView.setText(str1 + "\n" + str2);

    }

}
