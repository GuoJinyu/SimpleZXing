package com.acker.simplezxing.view;

import android.content.Context;
import android.util.TypedValue;

/**
 * @date 2017/6/16 下午3:20
 * @auther GuoJinyu
 * @descripition
 */

public class ViewUtil {

    public static int convertSpToPixels(float sp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.getResources().getDisplayMetrics());
        return px;
    }

    public static int convertDpToPixels(float dp, Context context) {
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
        return px;
    }
}
