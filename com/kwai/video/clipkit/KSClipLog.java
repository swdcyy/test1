package com.kwai.video.clipkit.KSClipLog;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Math;
import com.kwai.video.clipkit.KSClipLogger;
import java.lang.Throwable;
import java.lang.Boolean;
import com.kwai.video.clipkit.KSClipLog$1;
import com.kwai.video.editorsdk2.logger.EditorSdkDebugLogger;
import com.kwai.video.editorsdk2.logger.EditorSdkLogger;
import com.kwai.video.clipkit.cape.CapeManager;
import com.kwai.video.clipkit.KSClipLog$2;
import com.kwai.video.devicepersona.DevicePersonaLogger;
import com.kwai.video.devicepersona.DevicePersonaLog;

public class KSClipLog	// class@001a40
{
    public static int sCurrentLogLevel = 1;
    public static KSClipLogger sKSClipLogger;

    public void KSClipLog(){
       super();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSClipLog.class, "5")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.d(p0, str);
          }
          i = i1;
       }
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSClipLog.class, "8")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.e(p0, str, null);
          }
          i = i1;
       }
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSClipLog.class, "9")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.e(p0, str, p2);
          }
          i = i1;
       }
       return;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSClipLog.class, "6")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.i(p0, str);
          }
          i = i1;
       }
       return;
    }
    public static void setKSClipLogger(KSClipLogger p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSClipLog.class, "1")) {
          return;
       }
       KSClipLog.setKSClipLogger(p0, false, false);
       return;
    }
    public static void setKSClipLogger(KSClipLogger p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(KSClipLog.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), null, KSClipLog.class, "2")) {
          return;
       }
       KSClipLog.setKSClipLogger(p0, p1, p2, false);
       return;
    }
    public static void setKSClipLogger(KSClipLogger p0,boolean p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(KSClipLog.class) && PatchProxy.applyVoidFourRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), Boolean.valueOf(p3), null, KSClipLog.class, "3")) {
          return;
       }
       KSClipLog.sKSClipLogger = p0;
       if (p1) {
          EditorSdkLogger.setDebugLogger(new KSClipLog$1());
       }
       if (p3) {
          CapeManager.setCapeLogger(KSClipLog.sKSClipLogger);
       }
       DevicePersonaLog.setKSDeviceLogger(new KSClipLog$2());
       return;
    }
    public static void setLogLevel(int p0){
       KSClipLog.sCurrentLogLevel = p0;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSClipLog.class, "4")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.v(p0, str);
          }
          i = i1;
       }
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSClipLog.class, "7")) {
          return;
       }
       int i = 0;
       while (i < p1.length()) {
          int i1 = i + 2000;
          String str = p1.substring(i, Math.min(p1.length(), i1));
          KSClipLogger sKSClipLogge = KSClipLog.sKSClipLogger;
          if (sKSClipLogge != null) {
             sKSClipLogge.w(p0, str);
          }
          i = i1;
       }
       return;
    }
}
