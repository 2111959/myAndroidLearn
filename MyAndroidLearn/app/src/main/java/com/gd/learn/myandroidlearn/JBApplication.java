package com.gd.learn.myandroidlearn;

import com.squareup.leakcanary.LeakCanary;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

public class JBApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        //内存泄漏检测
        LeakCanary.install(this);
    }
}
