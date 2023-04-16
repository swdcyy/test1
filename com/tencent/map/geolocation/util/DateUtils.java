package com.tencent.map.geolocation.util.DateUtils;
import java.lang.System;
import java.lang.Object;
import java.lang.Math;

public class DateUtils	// class@000e66
{
    public static long mLocalTime;
    public static long mTencentTime;

    static {
       DateUtils.mTencentTime = System.currentTimeMillis();
       DateUtils.mLocalTime = System.currentTimeMillis();
    }
    public void DateUtils(){
       super();
    }
    public static boolean bbb08788c45327527041933a3f54c56b(long p0,long p1){
       boolean b = (Math.abs((p0 - p1)) - 1000 > 0)? true: false;
       return b;
    }
    public static long f2593e4de50dde6467f44b48c4b8180d(){
       return System.currentTimeMillis();
    }
    public static long getTencentTime(){
       return (System.currentTimeMillis() + (DateUtils.mTencentTime - DateUtils.mLocalTime));
    }
    public static void setTencentTime(long p0){
       DateUtils.mTencentTime = p0;
       DateUtils.mLocalTime = System.currentTimeMillis();
    }
}
