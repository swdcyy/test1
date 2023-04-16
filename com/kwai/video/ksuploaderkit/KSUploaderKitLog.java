package com.kwai.video.ksuploaderkit.KSUploaderKitLog;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksuploaderkit.KSUploaderKitLogger;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.ksuploaderkit.DefaultUploaderKitLogger;
import java.lang.Exception;
import com.ks.ksuploader.KSUploaderLogLevel;
import com.ks.ksuploader.KSUploader;
import com.kwai.video.ksuploaderkit.KSUploaderKitLog$1;
import com.ks.ksuploader.KSUploaderLogListener;

public class KSUploaderKitLog	// class@00097b
{
    public static boolean isInitLogger = false;
    public static int sCurrentLogLevel;
    public static KSUploaderKitLogger sUploaderKitLogger;

    public void KSUploaderKitLog(){
       super();
    }
    public static void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSUploaderKitLog.class, "4")) {
          return;
       }
       if (KSUploaderKitLog.getKSUploaderKitLogger() != null) {
          KSUploaderKitLog.getKSUploaderKitLogger().d(p0, p1);
       }
       return;
    }
    public static void e(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSUploaderKitLog.class, "7")) {
          return;
       }
       if (KSUploaderKitLog.getKSUploaderKitLogger() != null) {
          KSUploaderKitLog.getKSUploaderKitLogger().e(p0, p1, null);
       }
       return;
    }
    public static void e(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, KSUploaderKitLog.class, "8")) {
          return;
       }
       if (KSUploaderKitLog.getKSUploaderKitLogger() != null) {
          KSUploaderKitLog.getKSUploaderKitLogger().e(p0, p1, p2);
       }
       return;
    }
    public static synchronized KSUploaderKitLogger getKSUploaderKitLogger(){
       _monitor_enter(KSUploaderKitLog.class);
       Object obj = PatchProxy.apply(null, null, KSUploaderKitLog.class, "2");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSUploaderKitLog.class);
          return obj;
       }else if(KSUploaderKitLog.isInitLogger || KSUploaderKitLog.sUploaderKitLogger != null){
          _monitor_exit(KSUploaderKitLog.class);
          return KSUploaderKitLog.sUploaderKitLogger;
       }else {
          KSUploaderKitLog.isInitLogger = true;
          try{
             KSUploaderKitLog.setKSUploaderKitLogger(DefaultUploaderKitLogger.class.newInstance());
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          _monitor_exit(KSUploaderKitLog.class);
          return KSUploaderKitLog.sUploaderKitLogger;
       }
    }
    public static void i(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSUploaderKitLog.class, "5")) {
          return;
       }
       if (KSUploaderKitLog.getKSUploaderKitLogger() != null) {
          KSUploaderKitLog.getKSUploaderKitLogger().i(p0, p1);
       }
       return;
    }
    public static void setKSUploaderKitLogger(KSUploaderKitLogger p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSUploaderKitLog.class, "1")) {
          return;
       }
       KSUploaderKitLog.sUploaderKitLogger = p0;
       KSUploader.setLogLevel(KSUploaderLogLevel.KSUploaderLogLevel_Debug);
       KSUploader.setLogListener(new KSUploaderKitLog$1());
       return;
    }
    public static void setLogLevel(int p0){
       KSUploaderKitLog.sCurrentLogLevel = p0;
    }
    public static void v(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSUploaderKitLog.class, "3")) {
          return;
       }
       if (KSUploaderKitLog.getKSUploaderKitLogger() != null) {
          KSUploaderKitLog.getKSUploaderKitLogger().v(p0, p1);
       }
       return;
    }
    public static void w(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, KSUploaderKitLog.class, "6")) {
          return;
       }
       if (KSUploaderKitLog.getKSUploaderKitLogger() != null) {
          KSUploaderKitLog.getKSUploaderKitLogger().w(p0, p1);
       }
       return;
    }
}
