package com.kwai.video.player.KsMediaPlayerInitConfig$1;
import com.kwai.video.ksffmpegandroid.KSFFmpegAARDistribution$SoLoader;
import com.kwai.video.player.KsSoLoader;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rg.e;
import rg.d;
import java.lang.System;

public final class KsMediaPlayerInitConfig$1 implements KSFFmpegAARDistribution$SoLoader	// class@000aef
{
    public final Context val$appContext;
    public final KsSoLoader val$injectLoader;

    public void KsMediaPlayerInitConfig$1(KsSoLoader p0,Context p1){
       this.val$injectLoader = p0;
       this.val$appContext = p1;
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KsMediaPlayerInitConfig$1.class, "1")) {
          return;
       }
       KsMediaPlayerInitConfig$1 tval$injectL = this.val$injectLoader;
       if (tval$injectL != null) {
          tval$injectL.loadLibrary(p0);
       }else if(this.val$appContext != null){
          d.c().h(this.val$appContext, p0);
       }else {
          System.loadLibrary(p0);
       }
       return;
    }
}
