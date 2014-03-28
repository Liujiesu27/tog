
package com.su27.tog;

import com.su27.tog.sort.BubbleSortActivity;
import com.su27.tog.sort.InsertionSortActivity;
import com.su27.tog.sort.MergeSortActivity;
import com.su27.tog.sort.QuickSortActivity;
import com.su27.tog.sort.SelectSortActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

public class MainActivity extends ActionBarActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment()).commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container,
                    false);
            return rootView;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bubble_sort: {
                Intent intent = new Intent(this, BubbleSortActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.quick_sort: {
                Intent intent = new Intent(this, QuickSortActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.merge_sort: {
                Intent intent = new Intent(this, MergeSortActivity.class);
                startActivity(intent);
            }
            case R.id.select_sort: {
                Intent intent = new Intent(this, SelectSortActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.inertion_sort: {
                Intent intent = new Intent(this, InsertionSortActivity.class);
                startActivity(intent);
            }
            break;
        }

    }

}
