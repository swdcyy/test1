package com.android.kwai.foundation.network.core.utils.NetLog;
import java.lang.Object;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Throwable;

public class NetLog	// class@000efa
{
    public static boolean isDebug = true;
    public static int maxLengthSingleLine;

    public void NetLog(){
       super();
    }
    public static void d(String p0){
       NetLog.d("", p0);
    }
    public static void d(String p0,String p1){
       if (NetLog.isDebug) {
          if (TextUtils.isEmpty(p1)) {
             return;
          }else {
             int maxLengthSin = NetLog.maxLengthSingleLine;
             if (p1.length() >= maxLengthSin) {
                int i = 0;
                while (p1.length() > i) {
                   if (maxLengthSin >= p1.length()) {
                      p1.substring(i);
                   }else {
                      p1.substring(i, maxLengthSin);
                   }
                   i = NetLog.maxLengthSingleLine + maxLengthSin;
                   maxLengthSin = i;
                   i = maxLengthSin;
                }
             }
          }
       }
       return;
    }
    public static void e(String p0){
       NetLog.e("", p0);
    }
    public static void e(String p0,String p1){
       if (NetLog.isDebug) {
          if (TextUtils.isEmpty(p1)) {
             return;
          }else {
             int maxLengthSin = NetLog.maxLengthSingleLine;
             if (p1.length() >= maxLengthSin) {
                int i = 0;
                while (p1.length() > i) {
                   if (maxLengthSin >= p1.length()) {
                      p1.substring(i);
                   }else {
                      p1.substring(i, maxLengthSin);
                   }
                   i = NetLog.maxLengthSingleLine + maxLengthSin;
                   maxLengthSin = i;
                   i = maxLengthSin;
                }
             }
          }
       }
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (NetLog.isDebug) {
          if (TextUtils.isEmpty(p1)) {
             return;
          }else {
             int maxLengthSin = NetLog.maxLengthSingleLine;
             if (p1.length() >= maxLengthSin) {
                int i = 0;
                while (p1.length() > i) {
                   if (maxLengthSin >= p1.length()) {
                      p1.substring(i);
                   }else {
                      p1.substring(i, maxLengthSin);
                   }
                   i = NetLog.maxLengthSingleLine + maxLengthSin;
                   maxLengthSin = i;
                   i = maxLengthSin;
                }
             }
          }
       }
       return;
    }
    public static void e(String p0,Throwable p1){
    }
    public static void e(Throwable p0){
    }
    public static void i(String p0){
       NetLog.i("", p0);
    }
    public static void i(String p0,String p1){
       if (NetLog.isDebug) {
          if (TextUtils.isEmpty(p1)) {
             return;
          }else {
             int maxLengthSin = NetLog.maxLengthSingleLine;
             if (p1.length() >= maxLengthSin) {
                int i = 0;
                while (p1.length() > i) {
                   if (maxLengthSin >= p1.length()) {
                      p1.substring(i);
                   }else {
                      p1.substring(i, maxLengthSin);
                   }
                   i = NetLog.maxLengthSingleLine + maxLengthSin;
                   maxLengthSin = i;
                   i = maxLengthSin;
                }
             }
          }
       }
       return;
    }
    public static void v(String p0){
       NetLog.v("", p0);
    }
    public static void v(String p0,String p1){
       if (NetLog.isDebug) {
          if (TextUtils.isEmpty(p1)) {
             return;
          }else {
             int maxLengthSin = NetLog.maxLengthSingleLine;
             if (p1.length() > maxLengthSin) {
                int i = 0;
                while (p1.length() > i) {
                   if (maxLengthSin >= p1.length()) {
                      p1.substring(i);
                   }else {
                      p1.substring(i, maxLengthSin);
                   }
                   i = NetLog.maxLengthSingleLine + maxLengthSin;
                   maxLengthSin = i;
                   i = maxLengthSin;
                }
             }
          }
       }
       return;
    }
    public static void w(String p0){
       NetLog.w("", p0);
    }
    public static void w(String p0,String p1){
       if (NetLog.isDebug) {
          if (TextUtils.isEmpty(p1)) {
             return;
          }else {
             int maxLengthSin = NetLog.maxLengthSingleLine;
             if (p1.length() >= maxLengthSin) {
                int i = 0;
                while (p1.length() > i) {
                   if (maxLengthSin >= p1.length()) {
                      p1.substring(i);
                   }else {
                      p1.substring(i, maxLengthSin);
                   }
                   i = NetLog.maxLengthSingleLine + maxLengthSin;
                   maxLengthSin = i;
                   i = maxLengthSin;
                }
             }
          }
       }
       return;
    }
}
