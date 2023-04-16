package com.kwai.video.stannis.utils.Log;
import com.kwai.video.stannis.utils.NativeLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.kwai.video.stannis.Stannis$LogParam;

public class Log	// class@000c7b
{

    static {
       NativeLoader.loadNative();
    }
    public void Log(){
       super();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "3")) {
          return;
       }
       Log.nativeLog(0, Log.getMsg(p0, p1));
       return;
    }
    public static void d(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "4")) {
          return;
       }
       Log.nativeLog(0, Log.getMsg(p0, p1, p2));
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "9")) {
          return;
       }
       Log.nativeLog(3, Log.getMsg(p0, p1));
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "10")) {
          return;
       }
       Log.nativeLog(3, Log.getMsg(p0, p1, p2));
       return;
    }
    public static String getMsg(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, Log.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"| "+p1;
    }
    public static String getMsg(String p0,String p1,Throwable p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, Log.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0+"| "+p1+" "+p2.getMessage();
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "5")) {
          return;
       }
       Log.nativeLog(1, Log.getMsg(p0, p1));
       return;
    }
    public static void i(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "6")) {
          return;
       }
       Log.nativeLog(1, Log.getMsg(p0, p1, p2));
       return;
    }
    public static native void nativeLog(int p0,String p1);
    public static native void nativeSetLogParam(Stannis$LogParam p0);
    public static void setLogParam(Stannis$LogParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, Log.class, "11")) {
          return;
       }
       Log.nativeSetLogParam(p0);
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, Log.class, "7")) {
          return;
       }
       Log.nativeLog(2, Log.getMsg(p0, p1));
       return;
    }
    public static void w(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, Log.class, "8")) {
          return;
       }
       Log.nativeLog(2, Log.getMsg(p0, p1, p2));
       return;
    }
}
