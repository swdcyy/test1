package com.kwai.video.cache.AwesomeCacheInitConfig$2;
import com.kwai.video.cache.AwesomeCacheSoLoader;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import rg.e;
import rg.d;
import com.kwai.video.hodor.util.Timber;
import java.lang.System;

public final class AwesomeCacheInitConfig$2 implements AwesomeCacheSoLoader	// class@0019f2
{
    public final Context val$appContext;
    public final AwesomeCacheSoLoader val$injectSoLoader;

    public void AwesomeCacheInitConfig$2(AwesomeCacheSoLoader p0,Context p1){
       this.val$injectSoLoader = p0;
       this.val$appContext = p1;
       super();
    }
    public void loadLibrary(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AwesomeCacheInitConfig$2.class, "1")) {
          return;
       }
       AwesomeCacheInitConfig$2 tval$injectS = this.val$injectSoLoader;
       if (tval$injectS != null) {
          tval$injectS.loadLibrary(p0);
       }else if(this.val$appContext != null){
          d.c().h(this.val$appContext, p0);
       }else {
          Object[] objArray = new Object[0];
          Timber.w("WARNING! AwesomeCacheSoLoader is using System.loadLibrary", objArray);
          System.loadLibrary(p0);
       }
       return;
    }
}
