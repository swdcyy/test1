package com.kwai.video.player.pragma.DebugLog;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Locale;

public class DebugLog	// class@000b94
{

    public void DebugLog(){
       super();
    }
    public static void d(String p0,String p1){
    }
    public static void d(String p0,String p1,Throwable p2){
    }
    public static void dfmt(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DebugLog.class, "4")) {
          return;
       }
       String.format(Locale.US, p1, p2);
       return;
    }
    public static void e(String p0,String p1){
    }
    public static void e(String p0,String p1,Throwable p2){
    }
    public static void efmt(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DebugLog.class, "1")) {
          return;
       }
       String.format(Locale.US, p1, p2);
       return;
    }
    public static void i(String p0,String p1){
    }
    public static void i(String p0,String p1,Throwable p2){
    }
    public static void ifmt(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DebugLog.class, "2")) {
          return;
       }
       String.format(Locale.US, p1, p2);
       return;
    }
    public static void printCause(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, DebugLog.class, "6")) {
          return;
       }
       Throwable cause = p0.getCause();
       if (cause != null) {
          p0 = cause;
       }
       DebugLog.printStackTrace(p0);
       return;
    }
    public static void printStackTrace(Throwable p0){
    }
    public static void v(String p0,String p1){
    }
    public static void v(String p0,String p1,Throwable p2){
    }
    public static void vfmt(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DebugLog.class, "5")) {
          return;
       }
       String.format(Locale.US, p1, p2);
       return;
    }
    public static void w(String p0,String p1){
    }
    public static void w(String p0,String p1,Throwable p2){
    }
    public static void wfmt(String p0,String p1,Object[] p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, DebugLog.class, "3")) {
          return;
       }
       String.format(Locale.US, p1, p2);
       return;
    }
}
