package com.kwai.video.kstmf.KSTMFConfig;
import java.util.concurrent.Semaphore;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.kwai.video.kstmf.KSTMFConfig$2;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution;
import android.content.Context;
import com.google.gson.JsonObject;
import java.lang.System;
import com.kwai.video.kstmf.KSTMFSoManager;
import java.lang.Long;
import java.lang.Number;
import com.kwai.video.kstmf.KSTMFSoLoader;
import rg.e;
import rg.d;
import com.kwai.plugin.dva.Dva;
import com.kwai.plugin.dva.install.b;
import com.kwai.plugin.dva.work.c;
import com.kwai.video.kstmf.KSTMFConfig$1;
import com.kwai.plugin.dva.work.c$c;
import com.google.gson.JsonElement;
import com.kwai.video.kstmf.KSTMFLogReporter;
import java.lang.Exception;
import com.kwai.robust.PatchProxyResult;
import android.os.Looper;
import java.lang.Thread;
import java.lang.InterruptedException;

public class KSTMFConfig	// class@00093a
{
    public static JsonObject jsonObject;
    public static int loadState;
    public static boolean sAbiCheckDisabled;
    public static Context sContext;
    public static int sErrorCode;
    public static boolean sHadLoadLibrary;
    public static boolean sOpenDvaDownload;
    public static KSTMFSoLoader sSoLoader;
    public static final Semaphore semaphore;
    public static long start;

    static {
       KSTMFConfig.semaphore = new Semaphore(0);
       KSTMFConfig.sErrorCode = 0;
       KSTMFConfig.sOpenDvaDownload = false;
       KSTMFConfig.loadState = 1;
    }
    public void KSTMFConfig(){
       super();
    }
    public static void changeLoadState(int p0,int p1){
       KSTMFConfig kSTMFConfig = KSTMFConfig.class;
       if (PatchProxy.isSupport(kSTMFConfig) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), null, kSTMFConfig, "3")) {
          return;
       }
       KSTMFConfig.loadState = p0;
       if (p0 == 4 || p0 == 3) {
          KSTMFConfig.sErrorCode = p1;
          KSTMFConfig.semaphore.release();
       }
       return;
    }
    public static void checkAbi(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSTMFConfig.class, "2")) {
          return;
       }
       if (KSTMFConfig.sAbiCheckDisabled || ("a3b5052c6da21dd7d32115795e5389eaae71a4d6").equals(p0)) {
          return;
       }
       throw new RuntimeException("Wrong TMF version. Contact library\'s owner. Check if TMF\'s commit matches tmf-aar-distribution\'s. distributed version:a3b5052c6da21dd7d32115795e5389eaae71a4d6 requested version: "+p0);
    }
    public static void disableAbiCheck(){
       KSTMFConfig.sAbiCheckDisabled = true;
    }
    public static synchronized void ensureLoadDecodeLibrary(){
       _monitor_enter(KSTMFConfig.class);
       if (PatchProxy.applyVoid(null, null, KSTMFConfig.class, "7")) {
          _monitor_exit(KSTMFConfig.class);
          return;
       }else if(!KSTMFConfig.sHadLoadLibrary){
          StringBuilder str = "ensureLoadDecodeLibrary: "+KSTMFConfig.sContext;
          KSFFmpegAARDistribution.checkAbiAndLoadFFmpeg("30d6bc259d76805709c1e4f0dc1c8f3955a7729a", new KSTMFConfig$2());
          KSTMFConfig.loadLibrary("c++_shared");
          KSTMFConfig.loadLibrary("KSTMF");
          KSTMFConfig.sHadLoadLibrary = true;
       }
       _monitor_exit(KSTMFConfig.class);
       return;
    }
    public static int getLoadState(){
       return KSTMFConfig.loadState;
    }
    public static boolean getOpenDvaDownload(){
       return KSTMFConfig.sOpenDvaDownload;
    }
    public static boolean hasInitComplete(){
       return KSTMFConfig.sHadLoadLibrary;
    }
    public static synchronized void init(Context p0){
       _monitor_enter(KSTMFConfig.class);
       if (PatchProxy.applyVoidOneRefs(p0, null, KSTMFConfig.class, "1")) {
          _monitor_exit(KSTMFConfig.class);
          return;
       }else if(KSTMFConfig.loadState != 1){
          _monitor_exit(KSTMFConfig.class);
          return;
       }else {
          StringBuilder str = "tmf start init context: "+p0;
          KSTMFConfig.jsonObject = new JsonObject();
          KSTMFConfig.start = System.currentTimeMillis();
          KSTMFConfig.sContext = p0;
          if (p0 == null) {
             _monitor_exit(KSTMFConfig.class);
             return;
          }else {
             KSTMFConfig.changeLoadState(2, 0);
             KSTMFConfig.ensureLoadDecodeLibrary();
             KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "load_library_cost", Long.valueOf((System.currentTimeMillis() - KSTMFConfig.start)));
             KSTMFConfig.changeLoadState(3, 0);
             KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "init_cost", Long.valueOf((System.currentTimeMillis() - KSTMFConfig.start)));
             _monitor_exit(KSTMFConfig.class);
             return;
          }
       }
    }
    public static void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSTMFConfig.class, "8")) {
          return;
       }
       if (KSTMFConfig.sSoLoader != null) {
          KSTMFConfig.sSoLoader.loadLibrary(p0);
       }else if(KSTMFConfig.sContext != null){
          d.c().h(KSTMFConfig.sContext, p0);
       }else {
          System.loadLibrary(p0);
       }
       return;
    }
    public static void registerDVA(){
       if (PatchProxy.applyVoid(null, null, KSTMFConfig.class, "5")) {
          return;
       }
       Dva.instance().getPluginInstallManager().j("tmf_ffmpeg_full").a(new KSTMFConfig$1(System.currentTimeMillis()));
       return;
    }
    public static void report(){
       if (PatchProxy.applyVoid(null, null, KSTMFConfig.class, "6")) {
          return;
       }
       try{
          KSTMFSoManager.getInstance().safeAddJsonProperty(KSTMFConfig.jsonObject, "total_cost", Long.valueOf((System.currentTimeMillis() - KSTMFConfig.start)));
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("qos", KSTMFSoManager.getInstance().safeGetJsonString(KSTMFConfig.jsonObject));
          KSTMFLogReporter.report(jsonObject.toString());
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public static void setKSTMFSoLoader(KSTMFSoLoader p0){
       KSTMFConfig.sSoLoader = p0;
    }
    public static synchronized int tmfSyncGetLoadResult(){
       _monitor_enter(KSTMFConfig.class);
       Object obj = PatchProxy.apply(null, null, KSTMFConfig.class, "4");
       if (obj != PatchProxyResult.class) {
          _monitor_exit(KSTMFConfig.class);
          return obj.intValue();
       }else {
          int loadState = KSTMFConfig.loadState;
          if (loadState == 3) {
             _monitor_exit(KSTMFConfig.class);
             return 0;
          }else if(loadState == 4){
             _monitor_exit(KSTMFConfig.class);
             return KSTMFConfig.sErrorCode;
          }else if(Looper.getMainLooper().getThread() == Thread.currentThread()){
             KSTMFConfig.sErrorCode = -60012;
             _monitor_exit(KSTMFConfig.class);
             return -60012;
          }else {
             try{
                KSTMFConfig.semaphore.acquire();
                if (KSTMFConfig.loadState == 3) {
                   _monitor_exit(KSTMFConfig.class);
                   return 0;
                }else {
                   _monitor_exit(KSTMFConfig.class);
                   return KSTMFConfig.sErrorCode;
                }
             }catch(java.lang.InterruptedException e1){
                e1.printStackTrace();
                KSTMFConfig.sErrorCode = -60013;
                _monitor_exit(KSTMFConfig.class);
                return KSTMFConfig.sErrorCode;
             }
          }
       }
    }
}
