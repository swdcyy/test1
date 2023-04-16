package com.kwai.video.player.kwai_player.Util;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.os.Process;
import android.app.ActivityManager;
import java.util.List;
import java.util.Iterator;
import android.app.ActivityManager$RunningAppProcessInfo;
import java.lang.Exception;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Reader;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.lang.Number;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import java.lang.Boolean;
import android.os.Build;

public class Util	// class@000b4f
{
    public static String sProcessName;

    public void Util(){
       super();
    }
    public static String getProcessName(Context p0){
       StringBuilder obj = PatchProxy.applyOneRefs(p0, null, Util.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.isEmpty(Util.sProcessName)) {
          return Util.sProcessName;
       }
       try{
          int i = Process.myPid();
          ActivityManager systemServic = p0.getSystemService("activity");
          if (systemServic != null) {
             List runningAppPr = systemServic.getRunningAppProcesses();
             if (runningAppPr != null) {
                Iterator iterator = runningAppPr.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      ActivityManager$RunningAppProcessInfo runningAppPr1 = iterator.next();
                      if (runningAppPr1.pid == i) {
                         Util.sProcessName = runningAppPr1.processName;
                      }
                   }
                }
             }
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       if (TextUtils.isEmpty(Util.sProcessName)) {
          try{
             BufferedReader uBufferedRea = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/self/cmdline")));
             obj = "";
             int i1 = uBufferedRea.read();
             while (i1 > 0) {
                obj = obj+(char)i1;
             }
             Util.sProcessName = obj;
             uBufferedRea.close();
          }catch(java.io.FileNotFoundException e3){
             e3.printStackTrace();
          }catch(java.io.IOException e3){
             e3.printStackTrace();
          }
       }
    }
    public static int getVersionCode(Context p0){
       int i;
       PackageManager obj = PatchProxy.applyOneRefs(p0, null, Util.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = p0.getPackageManager();
       try{
          i = 0;
          return obj.getPackageInfo(p0.getPackageName(), i).versionCode;
       }catch(android.content.pm.PackageManager$NameNotFoundException e3){
          e3.printStackTrace();
          return i;
       }
    }
    public static boolean isCriticalErrorInMediaPlayer(int p0,int p1){
       if (p0 != -5108 && (p0 != -5107 && (p0 != -5104 && (p0 != -5101 && (p0 != -5013 && (p0 != -1010 && (p0 != -1007 && (p0 != -1004 && (p0 != -110 && (p0 != 1 && (p0 != 100 && p0 != 200))))))))))) {
          switch (p0){
              case 0xffffec6d:
              case 0xffffec6f:
              case 0xffffec70:
              case 0xffffec71:
              case 0xffffec72:
              case 0xffffec73:
              case 0xffffec74:
              case 0xffffec75:
              case 0xffffec76:
              case 0xffffec77:
              case 0xffffec6e:
              default:
                if (p0 == -5012 && p1 < 0) {
                   return 1;
                }else if(p0 < -20000){
                   return 1;
                }else {
                   return false;
                }
          }
       }
    label_0040 :
       return 1;
    }
    public static boolean isHardWareVendorQualcomm(){
       Object obj = PatchProxy.apply(null, null, Util.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (Build.HARDWARE).matches("qcom");
    }
    public static boolean isHttpForbiddenErrorInMediaPlayer(int p0,int p1){
       if (-5007 == p0 || -2403 == p1) {
          return true;
       }
       return false;
    }
    public static boolean isKSecurityErrorInMediaPlayer(int p0,int p1){
       if (-5131 != p0 && (-5132 != p0 && (-5133 != p0 && (-5134 == p0 || -5135 == p0)))) {
          return true;
       }
       return false;
    }
    public static boolean isNetErrorInMediaplayer(int p0,int p1){
       if (p1 < 0) {
          return true;
       }
       if (p0 != -5101 && (p0 != -1004 && p0 != -110)) {
          switch (p0){
              case 0xffffec6e:
              case 0xffffec70:
              case 0xffffec71:
              case 0xffffec72:
              case 0xffffec73:
              case 0xffffec74:
              case 0xffffec75:
              case 0xffffec76:
              case 0xffffec6f:
              default:
                return false;
          }
       }
       return true;
    }
}
