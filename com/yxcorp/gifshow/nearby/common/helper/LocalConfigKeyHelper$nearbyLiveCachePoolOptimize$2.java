package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.nearby.common.model.NearbyLiveCachePoolConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2 extends Lambda implements a	// class@0020ff
{
    public static final LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2 INSTANCE;

    static {
       LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2.INSTANCE = new LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2();
    }
    public void LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2(){
       super(0);
    }
    public final NearbyLiveCachePoolConfig invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$nearbyLiveCachePoolOptimize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b("nearbyLiveCachePoolOptimize", NearbyLiveCachePoolConfig.class, new NearbyLiveCachePoolConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
