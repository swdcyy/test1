package com.kwai.video.waynelive.KSLiveCoreInitHelper;
import com.kwai.video.waynelive.KSLiveCoreInitHelper$1;
import com.kwai.video.waynelive.KSLiveCoreInitHelper$2;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.KsSoLoader;
import com.kwai.video.player.KsMediaPlayerInitConfig;
import com.kwai.video.cache.AwesomeCacheSoLoader;
import com.kwai.video.cache.AwesomeCacheInitConfig;
import com.kwai.video.waynelive.KSLiveSoLoader;

public class KSLiveCoreInitHelper	// class@000dca
{
    public static AwesomeCacheSoLoader sAwesomeSoLoader;
    public static KsSoLoader sKsSoLoader;
    public static KSLiveSoLoader sSoKlpLoader;
    public static KSLiveSoLoader sSoLoader;

    static {
       KSLiveCoreInitHelper.sKsSoLoader = new KSLiveCoreInitHelper$1();
       KSLiveCoreInitHelper.sAwesomeSoLoader = new KSLiveCoreInitHelper$2();
    }
    public void KSLiveCoreInitHelper(){
       super();
    }
    public static void initAll(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, KSLiveCoreInitHelper.class, "2")) {
          return;
       }
       KsMediaPlayerInitConfig.setSoLoader(KSLiveCoreInitHelper.sKsSoLoader);
       AwesomeCacheInitConfig.setSoLoader(KSLiveCoreInitHelper.sAwesomeSoLoader);
       AwesomeCacheInitConfig.init(p0);
       KsMediaPlayerInitConfig.init(p0);
       return;
    }
    public static void setKlpSoListener(KSLiveSoLoader p0){
       KSLiveCoreInitHelper.sSoKlpLoader = p0;
    }
    public static void setSoKlploaded(){
       if (PatchProxy.applyVoid(null, null, KSLiveCoreInitHelper.class, "1")) {
          return;
       }
       if (KSLiveCoreInitHelper.sSoKlpLoader != null) {
          KSLiveCoreInitHelper.sSoKlpLoader.loadLibrary("klp");
          KSLiveCoreInitHelper.sSoKlpLoader = null;
       }
       return;
    }
    public static void setSoLoader(KSLiveSoLoader p0){
       KSLiveCoreInitHelper.sSoLoader = p0;
    }
}
