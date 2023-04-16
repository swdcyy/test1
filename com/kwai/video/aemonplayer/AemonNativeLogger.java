package com.kwai.video.aemonplayer.AemonNativeLogger;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Exception;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.aemonplayer.AemonNativeLogger$AemonLoggerCb;
import java.lang.Integer;

public class AemonNativeLogger	// class@0019c7
{
    public AemonNativeLogger$AemonLoggerCb logCb;
    public int logLevel;
    public static AemonNativeLogger sInstance;

    public void AemonNativeLogger(){
       super();
       this.logLevel = 4;
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AemonNativeLogger.class, "5")) {
          return;
       }
       AemonNativeLogger.getInstance().log(0, p0, p1);
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AemonNativeLogger.class, "7")) {
          return;
       }
       AemonNativeLogger.getInstance().log(3, p0, p1);
       return;
    }
    public static void e(String p0,String p1,Exception p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, AemonNativeLogger.class, "8")) {
          return;
       }
       AemonNativeLogger.getInstance().log(3, p0, p1+" "+p2.getMessage());
       return;
    }
    public static AemonNativeLogger getInstance(){
       AemonNativeLogger uAemonNative = AemonNativeLogger.class;
       Object obj = PatchProxy.apply(null, null, uAemonNative, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (AemonNativeLogger.sInstance == null) {
          _monitor_enter(uAemonNative);
          if (AemonNativeLogger.sInstance == null) {
             AemonNativeLogger.sInstance = new AemonNativeLogger();
          }
          _monitor_exit(uAemonNative);
       }
       return AemonNativeLogger.sInstance;
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AemonNativeLogger.class, "4")) {
          return;
       }
       AemonNativeLogger.getInstance().log(1, p0, p1);
       return;
    }
    public static void setLogConfig(int p0){
       AemonNativeLogger.getInstance().logLevel = p0;
    }
    public static void setLogConfig(int p0,AemonNativeLogger$AemonLoggerCb p1){
       AemonNativeLogger uAemonNative = AemonNativeLogger.class;
       if (PatchProxy.isSupport(uAemonNative) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, null, uAemonNative, "3")) {
          return;
       }
       AemonNativeLogger.getInstance().logLevel = p0;
       p0.logCb = p1;
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, AemonNativeLogger.class, "6")) {
          return;
       }
       AemonNativeLogger.getInstance().log(2, p0, p1);
       return;
    }
    public final void log(int p0,String p1,String p2){
       if (PatchProxy.isSupport(AemonNativeLogger.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, AemonNativeLogger.class, "2")) {
          return;
       }
       if (p0 < this.logLevel) {
          return;
       }
       AemonNativeLogger logCb = AemonNativeLogger.getInstance().logCb;
       if (logCb != null) {
          logCb.onLog(p0, "["+p1+"] "+p2);
       }
       return;
    }
}
