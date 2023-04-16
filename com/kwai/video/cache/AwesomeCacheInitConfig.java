package com.kwai.video.cache.AwesomeCacheInitConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.cache.AwesomeCacheInitConfig$2;
import com.kwai.video.cache.AwesomeCacheSoLoader;
import aegon.chrome.net.d;
import com.kuaishou.aegon.Aegon;
import com.kwai.video.hodor.Hodor;
import com.kwai.video.hodor.HodorConfig;
import com.kwai.video.cache.AwesomeCache$VodAdaptive;
import com.kwai.video.hodor.NetworkMonitor;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.cache.AwesomeCacheInitConfig$1;

public class AwesomeCacheInitConfig	// class@0019f3
{
    public static AwesomeCacheSoLoader sAwesomeCacheSoLoader;
    public static final AtomicBoolean sHodorPreLoaded;
    public static String sHodorRootPathDirName;
    public static String sHodorRootPathExtraDirName;
    public static final AtomicBoolean sInitialized;

    static {
       AwesomeCacheInitConfig.sInitialized = new AtomicBoolean(false);
       AwesomeCacheInitConfig.sHodorPreLoaded = new AtomicBoolean(false);
       AwesomeCacheInitConfig.sHodorRootPathExtraDirName = "";
       AwesomeCacheInitConfig.sHodorRootPathDirName = "";
    }
    public void AwesomeCacheInitConfig(){
       super();
    }
    public static String getHodorRootPathDirName(){
       return AwesomeCacheInitConfig.sHodorRootPathDirName;
    }
    public static String getHodorRootPathExtraDirName(){
       return AwesomeCacheInitConfig.sHodorRootPathExtraDirName;
    }
    public static synchronized void init(Context p0){
       _monitor_enter(AwesomeCacheInitConfig.class);
       Context uContext = null;
       if (PatchProxy.applyVoidOneRefs(p0, uContext, AwesomeCacheInitConfig.class, "3")) {
          _monitor_exit(AwesomeCacheInitConfig.class);
          return;
       }else {
          AtomicBoolean sInitialized = AwesomeCacheInitConfig.sInitialized;
          if (sInitialized.get()) {
             _monitor_exit(AwesomeCacheInitConfig.class);
             return;
          }else if(p0 == null){
             uContext = p0.getApplicationContext();
          }
          AwesomeCacheInitConfig$2 u2 = new AwesomeCacheInitConfig$2(AwesomeCacheInitConfig.sAwesomeCacheSoLoader, uContext);
          u2.loadLibrary("c++_shared");
          u2.loadLibrary("ffmpeg");
          u2.loadLibrary("aegon");
          u2.loadLibrary("yuv");
          u2.loadLibrary("opencv_world");
          u2.loadLibrary("ykit");
          AtomicBoolean sHodorPreLoa = AwesomeCacheInitConfig.sHodorPreLoaded;
          if (!sHodorPreLoa.get()) {
             u2.loadLibrary("hodor");
          }
          Aegon.c();
          if (!sHodorPreLoa.get()) {
             Hodor.loadJavaClass();
          }
          HodorConfig.init(p0);
          AwesomeCache$VodAdaptive.init(p0);
          NetworkMonitor.initNetworkChangeReceiver(uContext);
          sInitialized.set(true);
          _monitor_exit(AwesomeCacheInitConfig.class);
          return;
       }
    }
    public static boolean isInitialized(){
       Object obj = PatchProxy.apply(null, null, AwesomeCacheInitConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return AwesomeCacheInitConfig.sInitialized.get();
    }
    public static void preLoadJavaClassForHodor(Context p0,AwesomeCacheSoLoader p1){
       Context uContext = null;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, uContext, AwesomeCacheInitConfig.class, "2")) {
          return;
       }
       AtomicBoolean sHodorPreLoa = AwesomeCacheInitConfig.sHodorPreLoaded;
       if (sHodorPreLoa.get()) {
          return;
       }
       if (p0 != null) {
          uContext = p0.getApplicationContext();
       }
       new AwesomeCacheInitConfig$1(p1, uContext).loadLibrary("hodor");
       Hodor.loadJavaClass();
       sHodorPreLoa.set(true);
       return;
    }
    public static void setHodorRootPathDirName(String p0){
       AwesomeCacheInitConfig.sHodorRootPathDirName = p0;
    }
    public static void setHodorRootPathExtraDirName(String p0){
       AwesomeCacheInitConfig.sHodorRootPathExtraDirName = p0;
    }
    public static void setSoLoader(AwesomeCacheSoLoader p0){
       AwesomeCacheInitConfig.sAwesomeCacheSoLoader = p0;
    }
}
