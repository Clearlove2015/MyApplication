package com.zc.demo.util;

import java.util.ArrayList;
import java.util.List;

public class InitDataUtil {

    public static List<Integer> getFData(){
        List<Integer> mData = new ArrayList<>();
        for (int i = 0;i<20;i++){
            mData.add(i);
        }
        return mData;
    }

}
