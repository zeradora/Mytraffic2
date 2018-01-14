package com.example.libraries.mytraffic.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.example.libraries.mytraffic.R;

/**
 * Created by Libraries on 11/1/2561.
 */

public class MyAlertDialog {
    private Context context;

    public MyAlertDialog(Context context) {
        this.context = context;
    }

    public void normalDialog(String titleString ,String messageString) {
        AlertDialog.Builder builder= new AlertDialog.Builder(context);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setCancelable(false);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}
