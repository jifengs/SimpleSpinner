package com.jf.simplespinner;

import android.text.Spannable;
import android.text.SpannableString;

/**
 * Created by admin on 2018/2/8.
 */

public class SimpleSpinnerTextFormatter implements SpinnerTextFormatter {
    @Override
    public Spannable format(String text) {
        return new SpannableString(text);
    }
}
