package com.zc.demo.util;

import android.widget.Toast;

import com.zc.demo.App;

public class AppToast {

    public static void show(String content){
        Toast.makeText(App.context,content,Toast.LENGTH_SHORT).show();
    }

}
