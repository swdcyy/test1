package com.huawei.emui.hiexperience.iaware.sdk.IAwareSdk;
import java.lang.Object;
import java.lang.String;
import android.os.Parcel;
import java.lang.System;

public class IAwareSdk	// class@0006ab
{

    public void IAwareSdk(){
       super();
    }
    public static void asyncReportData(int p0,String p1,long p2){
       IAwareSdk.reportData(p0, p1, true);
    }
    public static void reportData(int p0,String p1,long p2){
       IAwareSdk.reportData(p0, p1, false);
    }
    public static void reportData(int p0,String p1,boolean p2){
       Parcel parcel = Parcel.obtain();
       parcel.writeInt(p0);
       parcel.writeLong(System.currentTimeMillis());
       parcel.writeString(p1);
       Parcel.obtain().recycle();
       parcel.recycle();
    }
}
