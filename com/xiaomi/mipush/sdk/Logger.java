package com.xiaomi.mipush.sdk.Logger;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.io.File;
import rs8.a;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import ws8.i2;
import ws8.j2;
import rs8.c;

public class Logger	// class@0010d4
{
    public static boolean sDisablePushLog;
    public static a sUserLogger;

    public void Logger(){
       super();
    }
    public static void disablePushFileLog(Context p0){
       Logger.sDisablePushLog = true;
       Logger.setPushLog(p0);
    }
    public static void enablePushFileLog(Context p0){
       Logger.sDisablePushLog = false;
       Logger.setPushLog(p0);
    }
    public static File getLogFile(String p0){
       return null;
    }
    public static a getUserLogger(){
       return Logger.sUserLogger;
    }
    public static boolean hasWritePermission(Context p0){
       boolean b = false;
       try{
          PackageInfo requestedPer = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 4096).requestedPermissions;
          if (requestedPer != null) {
             int len = requestedPer.length;
             int i = 0;
             while (i < len) {
                if (("android.permission.WRITE_EXTERNAL_STORAGE").equals(requestedPer[i])) {
                   return true;
                }
                i = i + 1;
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static void setLogger(Context p0,a p1){
       Logger.sUserLogger = p1;
       Logger.setPushLog(p0);
    }
    public static void setPushLog(Context p0){
       j2 oj21;
       int i = 1;
       a uoa = null;
       i2 oi2 = (Logger.sUserLogger != null)? 1: null;
       if (!Logger.sDisablePushLog) {
          uoa = oi2;
          if (Logger.hasWritePermission(p0)) {
          label_0017 :
             j2 oj2 = null;
             uoa = (uoa != null)? Logger.sUserLogger: oj2;
             if (i) {
                oj2 = j2.e(p0);
             }
             c.p(new i2(uoa, oj2));
             return;
          }
       }
       i = 0;
       goto label_0017 ;
    }
    public static void uploadLogFile(Context p0,boolean p1){
    }
}
