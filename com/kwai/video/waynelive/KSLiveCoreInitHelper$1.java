package com.kwai.video.waynelive.KSLiveCoreInitHelper$1;
import com.kwai.video.player.KsSoLoader;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.video.waynelive.KSLiveCoreInitHelper;
import com.kwai.video.waynelive.KSLiveSoLoader;
import java.lang.System;

public final class KSLiveCoreInitHelper$1 implements KsSoLoader	// class@000dc8
{

    public void KSLiveCoreInitHelper$1(){
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSLiveCoreInitHelper$1.class, "1")) {
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
