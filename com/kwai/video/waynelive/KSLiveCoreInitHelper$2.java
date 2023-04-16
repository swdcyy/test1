package com.kwai.video.waynelive.KSLiveCoreInitHelper$2;
import com.kwai.video.cache.AwesomeCacheSoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.KSLiveCoreInitHelper;
import com.kwai.video.waynelive.KSLiveSoLoader;
import java.lang.System;

public final class KSLiveCoreInitHelper$2 implements AwesomeCacheSoLoader	// class@000dc9
{

    public void KSLiveCoreInitHelper$2(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSLiveCoreInitHelper$2.class, "1")) {
          return;
       }
       if (KSLiveCoreInitHelper.sSoLoader != null) {
          KSLiveCoreInitHelper.sSoLoader.loadLibrary(p0);
       }else {
          System.loadLibrary(p0);
       }
       return;
    }
}
