package com.sina.weibo.sdk.net.HttpManager;
import java.lang.String;
import java.lang.System;
import android.content.Context;
import java.lang.StringBuilder;
import java.lang.CharSequence;
import android.text.TextUtils;

public class HttpManager	// class@000bbe
{

    static {
       System.loadLibrary("weibosdkcore");
    }
    public static String a(Context p0,String p1,String p2,String p3,String p4){
       StringBuilder str = "";
       if (!TextUtils.isEmpty(p1)) {
          str = str+p1;
       }
       if (!TextUtils.isEmpty(p2)) {
          str = str+p2;
       }
       if (!TextUtils.isEmpty(p3)) {
          str = str+p3;
       }
       return HttpManager.calcOauthSignNative(p0, str, p4);
    }
    public static native String calcOauthSignNative(Context p0,String p1,String p2);
}
