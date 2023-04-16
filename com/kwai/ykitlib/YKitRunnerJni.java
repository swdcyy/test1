package com.kwai.ykitlib.YKitRunnerJni;
import java.lang.String;
import java.lang.System;
import java.lang.Throwable;
import java.lang.Object;

public class YKitRunnerJni	// class@00115b
{
    public static String TAG = "YKitRunnerJni";

    static {
       System.loadLibrary("c++_shared");
       System.loadLibrary("ykit");
       System.loadLibrary("ykit_module");
    }
    public void YKitRunnerJni(){
       super();
    }
    public native int devFun(Object p0,int p1);
    public native int init(Object p0);
    public native int ready(Object p0);
    public native int release(Object p0);
    public native int run(Object p0);
    public native int setUploadStatsCallBack(Object p0,String p1);
}
