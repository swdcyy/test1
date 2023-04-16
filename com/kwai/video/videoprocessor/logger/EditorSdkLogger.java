package com.kwai.video.videoprocessor.logger.EditorSdkLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.kwai.video.videoprocessor.logger.EditorSdkDebugLogger;
import android.util.Log;
import java.lang.Integer;

public class EditorSdkLogger	// class@000c93
{
    public static EditorSdkDebugLogger sDebugLogger;
    public static boolean sIsOpen;

    public void EditorSdkLogger(){
       super();
    }
    public static void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, EditorSdkLogger.class, "5")) {
          return;
       }
       EditorSdkLogger.d("editorsdk2", p0);
       return;
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "6")) {
          return;
       }
       EditorSdkLogger.d(p0, p1, null);
       return;
    }
    public static void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EditorSdkLogger.class, "8")) {
          return;
       }
       if (!EditorSdkLogger.sIsOpen) {
          return;
       }
       EditorSdkDebugLogger sDebugLogger = EditorSdkLogger.sDebugLogger;
       if (sDebugLogger != null) {
          try{
             sDebugLogger.d(p0, p1, p2);
          }catch(java.lang.Exception e6){
             Log.getStackTraceString(e6);
          }
       }
    }
    public static void d(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "7")) {
          return;
       }
       EditorSdkLogger.d("editorsdk2", p0, p1);
       return;
    }
    public static void e(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, EditorSdkLogger.class, "17")) {
          return;
       }
       EditorSdkLogger.e("editorsdk2", p0, null);
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "18")) {
          return;
       }
       EditorSdkLogger.e(p0, p1, null);
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EditorSdkLogger.class, "20")) {
          return;
       }
       if (!EditorSdkLogger.sIsOpen) {
          return;
       }
       EditorSdkDebugLogger sDebugLogger = EditorSdkLogger.sDebugLogger;
       if (sDebugLogger != null) {
          try{
             sDebugLogger.e(p0, p1, p2);
          }catch(java.lang.Exception e6){
             Log.getStackTraceString(e6);
          }
       }
    }
    public static void e(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "19")) {
          return;
       }
       EditorSdkLogger.e("editorsdk2", p0, p1);
       return;
    }
    public static void i(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, EditorSdkLogger.class, "9")) {
          return;
       }
       EditorSdkLogger.i("editorsdk2", p0);
       return;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "10")) {
          return;
       }
       EditorSdkLogger.i(p0, p1, null);
       return;
    }
    public static void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EditorSdkLogger.class, "12")) {
          return;
       }
       if (!EditorSdkLogger.sIsOpen) {
          return;
       }
       EditorSdkDebugLogger sDebugLogger = EditorSdkLogger.sDebugLogger;
       if (sDebugLogger != null) {
          try{
             sDebugLogger.i(p0, p1, p2);
          }catch(java.lang.Exception e6){
             Log.getStackTraceString(e6);
          }
       }
    }
    public static void i(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "11")) {
          return;
       }
       EditorSdkLogger.i("editorsdk2", p0, p1);
       return;
    }
    public static void nativeCallDebugLogger(int p0,String p1,String p2){
       if (PatchProxy.isSupport(EditorSdkLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, null, EditorSdkLogger.class, "21")) {
          return;
       }
       if (!EditorSdkLogger.sIsOpen) {
          return;
       }
       EditorSdkDebugLogger sDebugLogger = EditorSdkLogger.sDebugLogger;
       if (sDebugLogger != null) {
          try{
             if (p0 != 2) {
                if (p0 != 3) {
                   if (p0 != 4) {
                      if (p0 != 5) {
                         if (p0 != 6) {
                            sDebugLogger.v(p1, p2, null);
                         }else {
                            sDebugLogger.e(p1, p2, null);
                         }
                      }else {
                         sDebugLogger.w(p1, p2, null);
                      }
                   }else {
                      sDebugLogger.i(p1, p2, null);
                   }
                }else {
                   sDebugLogger.d(p1, p2, null);
                }
             }else {
                sDebugLogger.v(p1, p2, null);
             }
          }catch(java.lang.Exception e7){
             Log.getStackTraceString(e7);
          }
       }
    }
    public static void setDebugLogger(EditorSdkDebugLogger p0){
       EditorSdkLogger.sDebugLogger = p0;
    }
    public static void setOpen(boolean p0){
       EditorSdkLogger.sIsOpen = p0;
    }
    public static void v(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, EditorSdkLogger.class, "1")) {
          return;
       }
       EditorSdkLogger.v("editorsdk2", p0);
       return;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "2")) {
          return;
       }
       EditorSdkLogger.v(p0, p1, null);
       return;
    }
    public static void v(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EditorSdkLogger.class, "4")) {
          return;
       }
       if (!EditorSdkLogger.sIsOpen) {
          return;
       }
       EditorSdkDebugLogger sDebugLogger = EditorSdkLogger.sDebugLogger;
       if (sDebugLogger != null) {
          try{
             sDebugLogger.v(p0, p1, p2);
          }catch(java.lang.Exception e6){
             Log.getStackTraceString(e6);
          }
       }
    }
    public static void v(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "3")) {
          return;
       }
       EditorSdkLogger.v("editorsdk2", p0, p1);
       return;
    }
    public static void w(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, EditorSdkLogger.class, "13")) {
          return;
       }
       EditorSdkLogger.w("editorsdk2", p0, null);
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "14")) {
          return;
       }
       EditorSdkLogger.w(p0, p1, null);
       return;
    }
    public static void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, EditorSdkLogger.class, "16")) {
          return;
       }
       if (!EditorSdkLogger.sIsOpen) {
          return;
       }
       EditorSdkDebugLogger sDebugLogger = EditorSdkLogger.sDebugLogger;
       if (sDebugLogger != null) {
          try{
             sDebugLogger.w(p0, p1, p2);
          }catch(java.lang.Exception e6){
             Log.getStackTraceString(e6);
          }
       }
    }
    public static void w(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, EditorSdkLogger.class, "15")) {
          return;
       }
       EditorSdkLogger.w("editorsdk2", p0, p1);
       return;
    }
}
