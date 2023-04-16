package com.kuaishou.live.lite.performance.LiveLiteViewRecycler$viewCacheMap$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteViewRecycler$viewCacheMap$2 extends Lambda implements a	// class@000a3c
{
    public static final LiveLiteViewRecycler$viewCacheMap$2 INSTANCE;

    static {
       LiveLiteViewRecycler$viewCacheMap$2.INSTANCE = new LiveLiteViewRecycler$viewCacheMap$2();
    }
    public void LiveLiteViewRecycler$viewCacheMap$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ConcurrentHashMap invoke(){
       Object obj = PatchProxy.apply(null, this, LiveLiteViewRecycler$viewCacheMap$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ConcurrentHashMap();
    }
}
