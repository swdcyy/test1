package com.kwai.video.ksheifdec.KSHeifConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.ksheifdec.KSHeifConfig$FFmpegLoader;
import com.kwai.video.ksheifdec.KSHeifConfig$1;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution;
import com.kwai.video.ksheifdec.KSHeifSoLoader;
import java.lang.System;

public class KSHeifConfig	// class@000f9d
{
    public static int sFFmpegDecodeHeifThreadCount = 1;
    public static int sFFmpegDecodeWebpThreadCount = 0;
    public static boolean sHadLoadLibrary = false;
    public static KSHeifSoLoader sSoLoader;
    public static boolean sStaticImgFirstUseSystemDecoder = false;
    public static boolean sStaticImgRetryUseSystemDecoder;
    public static boolean sUseFFmpegSwScale;

    public void KSHeifConfig(){
       super();
    }
    public static synchronized void ensureLoadDecodeLibrary(){
       _monitor_enter(KSHeifConfig.class);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, objArray, KSHeifConfig.class, "1")) {
          _monitor_exit(KSHeifConfig.class);
          return;
       }else if(!KSHeifConfig.sHadLoadLibrary){
          KSHeifConfig.loadLibrary("c++_shared");
          KSFFmpegAARDistribution.checkAbiAndLoadFFmpeg("30d6bc259d76805709c1e4f0dc1c8f3955a7729a", new KSHeifConfig$FFmpegLoader(objArray));
          KSHeifConfig.loadLibrary("yuv");
          KSHeifConfig.loadLibrary("ffmpeg");
          KSHeifConfig.loadLibrary("kwaiheif");
          KSHeifConfig.sHadLoadLibrary = true;
       }
       _monitor_exit(KSHeifConfig.class);
       return;
    }
    public static boolean getStaticImgFirstUseSystemDecoder(){
       return KSHeifConfig.sStaticImgFirstUseSystemDecoder;
    }
    public static boolean getStaticImgRetryUseSystemDecoder(){
       return KSHeifConfig.sStaticImgRetryUseSystemDecoder;
    }
    public static boolean getUseFFmpegSwScale(){
       return KSHeifConfig.sUseFFmpegSwScale;
    }
    public static void init(){
       if (PatchProxy.applyVoid(null, null, KSHeifConfig.class, "2")) {
          return;
       }
       KSHeifConfig.ensureLoadDecodeLibrary();
       return;
    }
    public static void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSHeifConfig.class, "3")) {
          return;
       }
       if (KSHeifConfig.sSoLoader != null) {
          KSHeifConfig.sSoLoader.loadLibrary(p0);
       }else {
          System.loadLibrary(p0);
       }
       return;
    }
    public static void setFFmpegDecodeHeifThreadCount(int p0){
       KSHeifConfig.sFFmpegDecodeHeifThreadCount = p0;
    }
    public static void setFFmpegDecodeWebpThreadCount(int p0){
       KSHeifConfig.sFFmpegDecodeWebpThreadCount = p0;
    }
    public static void setKSHeifSoLoader(KSHeifSoLoader p0){
       KSHeifConfig.sSoLoader = p0;
    }
    public static void setStaticImgFirstUseSystemDecoder(boolean p0){
       KSHeifConfig.sStaticImgFirstUseSystemDecoder = p0;
    }
    public static void setStaticImgRetryUseSystemDecoder(boolean p0){
       KSHeifConfig.sStaticImgRetryUseSystemDecoder = p0;
    }
    public static void setUseFFmpegSwScale(boolean p0){
       KSHeifConfig.sUseFFmpegSwScale = p0;
    }
}
