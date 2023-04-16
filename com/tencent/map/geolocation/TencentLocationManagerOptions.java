package com.tencent.map.geolocation.TencentLocationManagerOptions;
import java.lang.Object;
import java.lang.String;
import c.t.m.g.ed;
import java.lang.CharSequence;
import android.text.TextUtils;

public class TencentLocationManagerOptions	// class@000e5f
{
    public static boolean a = true;
    public static String b;

    public void TencentLocationManagerOptions(){
       super();
    }
    public static String getKey(){
       return TencentLocationManagerOptions.b;
    }
    public static boolean isLoadLibraryEnabled(){
       return TencentLocationManagerOptions.a;
    }
    public static void setDebuggable(boolean p0){
       ed.a = p0;
    }
    public static boolean setKey(String p0){
       if (TextUtils.isEmpty(p0)) {
          return false;
       }
       TencentLocationManagerOptions.b = p0;
       return true;
    }
    public static void setLoadLibraryEnabled(boolean p0){
       TencentLocationManagerOptions.a = p0;
    }
}
