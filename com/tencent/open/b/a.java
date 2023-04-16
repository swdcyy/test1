package com.tencent.open.b.a;
import java.lang.String;
import android.net.Uri;
import android.content.Context;
import android.content.ContentResolver;
import android.database.Cursor;
import java.lang.StringBuilder;
import java.lang.SecurityException;
import com.tencent.open.log.SLog;
import java.lang.Object;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.Exception;

public class a	// class@000f43
{
    public static final Uri a;

    static {
       a.a = Uri.parse("content://telephony/carriers/preferapn");
    }
    public static String a(Context p0){
       int i = a.d(p0);
       if (i == 2) {
          return "wifi";
       }
       if (i == 1) {
          return "cmwap";
       }
       if (i == 4) {
          return "cmnet";
       }
       if (i == 16) {
          return "uniwap";
       }
       if (i == 8) {
          return "uninet";
       }
       if (i == 64) {
          return "wap";
       }
       if (i == 32) {
          return "net";
       }
       if (i == 512) {
          return "ctwap";
       }
       if (i == 256) {
          return "ctnet";
       }
       if (i == 2048) {
          return "3gnet";
       }
       if (i == 1024) {
          return "3gwap";
       }
       String str = a.b(p0);
       if (str == null || !str.length()) {
          return "none";
       }
       return str;
    }
    public static String b(Context p0){
       return "";
    }
    public static String c(Context p0){
       try{
          Cursor uCursor = p0.getContentResolver().query(a.a, null, null, null, null);
          String str = null;
          if (uCursor == null) {
             return str;
          }
          uCursor.moveToFirst();
          if (uCursor.isAfterLast()) {
             uCursor.close();
             return str;
          }else {
             uCursor.close();
             return uCursor.getString(uCursor.getColumnIndex("proxy"));
          }
       }catch(java.lang.SecurityException e6){
          SLog.e("openSDK_LOG.APNUtil", "getApnProxy has exception: "+e6.getMessage());
          return "";
       }
    }
    public static int d(Context p0){
       int i = 128;
       try{
          ConnectivityManager systemServic = p0.getSystemService("connectivity");
          if (systemServic == null) {
             return i;
          }else {
             NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
             if (activeNetwor == null) {
                return i;
             }else if(((activeNetwor.getTypeName()).toUpperCase()).equals("WIFI")){
                return 2;
             }else {
                String str = (activeNetwor.getExtraInfo()).toLowerCase();
                if (str.startsWith("cmwap")) {
                   return 1;
                }else if(str.startsWith("cmnet") || str.startsWith("epc.tmobile.com")){
                   return 4;
                }else if(str.startsWith("uniwap")){
                   return 16;
                }else if(str.startsWith("uninet")){
                   return 8;
                }else if(str.startsWith("wap")){
                   return 64;
                }else if(str.startsWith("net")){
                   return 32;
                }else if(str.startsWith("ctwap")){
                   return 512;
                }else if(str.startsWith("ctnet")){
                   return 256;
                }else if(str.startsWith("3gwap")){
                   return 1024;
                }else if(str.startsWith("3gnet")){
                   return 2048;
                }else if(str.startsWith("#777")){
                   String str1 = a.c(p0);
                   if (str1 != null && str1.length() > 0) {
                      return 512;
                   }else {
                      return 256;
                   }
                }
             }
          }
       }catch(java.lang.Exception e5){
          SLog.e("openSDK_LOG.APNUtil", "getMProxyType has exception: "+e5.getMessage());
       }
       return i;
    }
    public static String e(Context p0){
       ConnectivityManager systemServic = p0.getSystemService("connectivity");
       if (systemServic == null) {
          return "MOBILE";
       }
       NetworkInfo activeNetwor = systemServic.getActiveNetworkInfo();
       if (activeNetwor != null) {
          return activeNetwor.getTypeName();
       }
       return "MOBILE";
    }
}
