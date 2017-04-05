package com.example.niranjanprabhu.bt_test_2;

import android.widget.TextView;


/**
 * Created by niranjanprabhu on 3/21/17.
 */

public class BtLog extends Object {
    public void statusLog(TextView statusView, String statusLogText) {
        TextView tStatusView = (TextView) statusView;
        tStatusView.setText(statusLogText);
    }
}
