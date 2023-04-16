package com.kwai.video.devicepersona.DevicePersonaLog;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import com.kwai.video.devicepersona.DevicePersonaLogger;
import java.lang.Throwable;
import java.lang.Integer;
import android.util.Log;

public class DevicePersonaLog	// class@001b16
{
    public static int sCurrentLogLevel = 1;
    public static DevicePersonaLogger sKSClipLogger;

    public void DevicePersonaLog(){
       super();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DevicePersonaLog.class, "2")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          DevicePersonaLogger sKSClipLogge = DevicePersonaLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.d(p0, str);
          }
          i = i1;
       }
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DevicePersonaLog.class, "5")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          DevicePersonaLogger sKSClipLogge = DevicePersonaLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.e(p0, str, null);
          }
          i = i1;
       }
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DevicePersonaLog.class, "6")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          DevicePersonaLogger sKSClipLogge = DevicePersonaLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.e(p0, str, p2);
          }
          i = i1;
       }
       return;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DevicePersonaLog.class, "3")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          DevicePersonaLogger sKSClipLogge = DevicePersonaLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.i(p0, str);
          }
          i = i1;
       }
       return;
    }
    public static void nativeCallDebugLogger(int p0,String p1,String p2){
       if (PatchProxy.isSupport(DevicePersonaLog.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, DevicePersonaLog.class, "7")) {
          return;
       }
       try{
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 != 5) {
                      if (p0 != 6) {
                         DevicePersonaLog.v(p1, p2);
                      }else {
                         DevicePersonaLog.e(p1, p2, null);
                      }
                   }else {
                      DevicePersonaLog.w(p1, p2);
                   }
                }else {
                   DevicePersonaLog.i(p1, p2);
                }
             }else {
                DevicePersonaLog.d(p1, p2);
             }
          }else {
             DevicePersonaLog.v(p1, p2);
          }
       }catch(java.lang.Exception e7){
          Log.getStackTraceString(e7);
       }
       return;
    }
    public static void setKSDeviceLogger(DevicePersonaLogger p0){
       DevicePersonaLog.sKSClipLogger = p0;
    }
    public static void setLogLevel(int p0){
       DevicePersonaLog.sCurrentLogLevel = p0;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DevicePersonaLog.class, "1")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          DevicePersonaLogger sKSClipLogge = DevicePersonaLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.v(p0, str);
          }
          i = i1;
       }
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, DevicePersonaLog.class, "4")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          DevicePersonaLogger sKSClipLogge = DevicePersonaLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.w(p0, str);
          }
          i = i1;
       }
       return;
    }
}
