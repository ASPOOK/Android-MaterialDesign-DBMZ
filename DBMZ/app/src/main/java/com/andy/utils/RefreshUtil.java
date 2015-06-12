package com.andy.utils;

import android.content.Context;
import android.text.format.DateUtils;

/**
 * Created by Andy on 2015/6/12
 */
public class RefreshUtil {
    /**
     *
     * @param context
     * @return string label
     */
    public static String getRefreshTime(Context context) {
        String label = DateUtils.formatDateTime(context, System.currentTimeMillis(),
                DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_ABBREV_ALL);

        return label;
    }
}
