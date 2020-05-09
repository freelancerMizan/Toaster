package com.freelancermizan.easytoaster;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    private static final String TAG = "Toaster";

    public static void create(Context context,String message){
        Toast.makeText(context, ""+message, Toast.LENGTH_SHORT).show();
    }


}
