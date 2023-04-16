package com.kwai.video.ksheifdec.HeifLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.kwai.video.ksheifdec.HeifLoggerReporter;
import android.util.Log;
import java.lang.Integer;
import com.kwai.video.ksheifdec.KSHeifConfig;

public class HeifLogger	// class@000f97
{
    public static HeifLoggerReporter mLogger;
    public static int sLoggerLevel;

    public void HeifLogger(){
       super();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, HeifLogger.class, "8")) {
          return;
       }
       HeifLogger.d("HEIF", p0, p1, null);
       return;
    }
    public static void d(String p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, HeifLogger.class, "10")) {
          return;
       }
       HeifLoggerReporter mLogger = HeifLogger.mLogger;
       if (mLogger != null) {
          try{
             mLogger.log("HEIF", 3, p1, p2, p3);
          }catch(java.lang.Exception e7){
             Log.getStackTraceString(e7);
          }
       }
    }
    public static void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, HeifLogger.class, "9")) {
          return;
       }
       HeifLogger.d("HEIF", p0, p1, p2);
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, HeifLogger.class, "17")) {
          return;
       }
       HeifLogger.e("HEIF", p0, p1, null);
       return;
    }
    public static void e(String p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, HeifLogger.class, "19")) {
          return;
       }
       HeifLoggerReporter mLogger = HeifLogger.mLogger;
       if (mLogger != null) {
          try{
             mLogger.log("HEIF", 6, p1, p2, p3);
          }catch(java.lang.Exception e7){
             Log.getStackTraceString(e7);
          }
       }
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, HeifLogger.class, "18")) {
          return;
       }
       HeifLogger.e("HEIF", p0, p1, p2);
       return;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, HeifLogger.class, "11")) {
          return;
       }
       HeifLogger.i("HEIF", p0, p1, null);
       return;
    }
    public static void i(String p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, HeifLogger.class, "13")) {
          return;
       }
       HeifLoggerReporter mLogger = HeifLogger.mLogger;
       if (mLogger != null) {
          try{
             mLogger.log("HEIF", 4, p1, p2, p3);
          }catch(java.lang.Exception e7){
             Log.getStackTraceString(e7);
          }
       }
    }
    public static void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, HeifLogger.class, "12")) {
          return;
       }
       HeifLogger.i("HEIF", p0, p1, p2);
       return;
    }
    public static void nativeHeifLoggerCall(int p0,String p1,String p2){
       if (PatchProxy.isSupport(HeifLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, HeifLogger.class, "4")) {
          return;
       }
       HeifLoggerReporter mLogger = HeifLogger.mLogger;
       if (mLogger != null) {
          mLogger.log("HEIF", p0, p1, p2, null);
       }
       return;
    }
    public static native void nativeSetHeifLoggerCallback();
    public static native void nativeSetHeifLoggerLevel(int p0);
    public static void setHeifLoggerCallback(){
       if (PatchProxy.applyVoid(null, null, HeifLogger.class, "3")) {
          return;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       HeifLogger.nativeSetHeifLoggerCallback();
       return;
    }
    public static void setHeifLoggerLevel(int p0){
       HeifLogger heifLogger = HeifLogger.class;
       if (PatchProxy.isSupport(heifLogger) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), null, heifLogger, "1")) {
          return;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       HeifLogger.sLoggerLevel = p0;
       HeifLogger.nativeSetHeifLoggerLevel(p0);
       return;
    }
    public static void setHeifLoggerReporter(HeifLoggerReporter p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, HeifLogger.class, "2")) {
          return;
       }
       HeifLogger.mLogger = p0;
       if (p0 != null) {
          HeifLogger.setHeifLoggerCallback();
       }
       return;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, HeifLogger.class, "5")) {
          return;
       }
       HeifLogger.v("HEIF", p0, p1, null);
       return;
    }
    public static void v(String p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, HeifLogger.class, "7")) {
          return;
       }
       HeifLoggerReporter mLogger = HeifLogger.mLogger;
       if (mLogger != null) {
          try{
             mLogger.log("HEIF", 2, p1, p2, p3);
          }catch(java.lang.Exception e7){
             Log.getStackTraceString(e7);
          }
       }
    }
    public static void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, HeifLogger.class, "6")) {
          return;
       }
       HeifLogger.v("HEIF", p0, p1, p2);
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, HeifLogger.class, "14")) {
          return;
       }
       HeifLogger.w("HEIF", p0, p1, null);
       return;
    }
    public static void w(String p0,String p1,String p2,Throwable p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, null, HeifLogger.class, "16")) {
          return;
       }
       HeifLoggerReporter mLogger = HeifLogger.mLogger;
       if (mLogger != null) {
          try{
             mLogger.log("HEIF", 5, p1, p2, p3);
          }catch(java.lang.Exception e7){
             Log.getStackTraceString(e7);
          }
       }
    }
    public static void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, HeifLogger.class, "15")) {
          return;
       }
       HeifLogger.w("HEIF", p0, p1, p2);
       return;
    }
}
