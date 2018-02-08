package com.jf.simplespinner;

import android.content.Context;
import android.widget.ListAdapter;

/**
 * Created by admin on 2018/2/8.
 */

public class JFSpinnerAdapterWrapper extends JFSpinnerBaseAdapter{
    private final ListAdapter baseAdapter;

    JFSpinnerAdapterWrapper(Context context, ListAdapter toWrap, int textColor, int backgroundSelector,
                              SpinnerTextFormatter spinnerTextFormatter) {
        super(context, textColor, backgroundSelector, spinnerTextFormatter);
        baseAdapter = toWrap;
    }

    @Override public int getCount() {
        return baseAdapter.getCount() - 1;
    }

    @Override public Object getItem(int position) {
        return baseAdapter.getItem(position >= selectedIndex ? position + 1 : position);
    }

    @Override public Object getItemInDataset(int position) {
        return baseAdapter.getItem(position);
    }
}
