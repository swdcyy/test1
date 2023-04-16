package com.kwai.live.gzone.guess.kshell.b0;
import erd.o;
import java.lang.Object;
import o57.a;
import p57.g;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.kwai.framework.cache.CacheManager;
import com.kwai.live.gzone.guess.bean.KShellGuessConfig;
import java.lang.System;
import java.lang.reflect.Type;
import brd.t;

public final class b0 implements o	// class@000d28
{
    public static final b0 b;

    static {
       b0.b = new b0();
    }
    public void b0(){
       super();
    }
    public final Object apply(Object p0){
       a mConfig = p0.mConfig;
       if (mConfig != null) {
          if (!PatchProxy.applyVoidOneRefs(mConfig, null, g.class, "5")) {
             b.a(0x5f2ddeb4).c("cache_guess", mConfig, KShellGuessConfig.class, (System.currentTimeMillis() + 0x5265c00));
          }
          p0 = t.just(p0.mConfig);
       }else {
          p0 = t.just(g.b());
       }
       return p0;
    }
}
