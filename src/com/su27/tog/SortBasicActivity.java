
package com.su27.tog;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public abstract class SortBasicActivity extends Activity implements
        OnClickListener {
    private static final String LOG_TAG = "SortBasicActivity";

    private TextView mTVShow;
    private WebView mWVChart;
    private ImageView mIVChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
        mTVShow = (TextView) findViewById(R.id.tv_show);
        mWVChart = (WebView) findViewById(R.id.wv_chart);
        mIVChart = (ImageView) findViewById(R.id.iv_code);
        setTitle(title());
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btn_display:
                mTVShow.setVisibility(View.VISIBLE);
                mWVChart.setVisibility(View.GONE);
                mIVChart.setVisibility(View.GONE);
                onDisplayClick(mTVShow);
                break;
            case R.id.btn_chart:
                mTVShow.setVisibility(View.GONE);
                mWVChart.setVisibility(View.VISIBLE);
                mIVChart.setVisibility(View.GONE);
                onChartClick();
                break;
            case R.id.btn_code:
                mTVShow.setVisibility(View.GONE);
                mWVChart.setVisibility(View.GONE);
                mIVChart.setVisibility(View.VISIBLE);
                onCodeClick();
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

    protected abstract String getAssetChartFile();

    protected abstract int getCodeResId();

    protected void onDisplayClick(TextView showView) {
        int[] array = getRandomArray(10, 100);
        String str1 = print(array);
        sort(array);
        String str2 = print(array);
        showView.setText(str1 + "\n" + str2);
    }

    protected void onChartClick() {
        mWVChart.loadDataWithBaseURL(null,
                "<center><img src='file:///android_asset/"
                        + getAssetChartFile() + "'/></center>", "text/html",
                "utf-8", null);

    }

    protected void onCodeClick() {
        mIVChart.setImageResource(getCodeResId());
    }

}
