package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyVideoCacheConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.nearby.common.model.NearbyVideoCacheConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$nearbyVideoCacheConfig$2 extends Lambda implements a	// class@002103
{
    public static final LocalConfigKeyHelper$nearbyVideoCacheConfig$2 INSTANCE;

    static {
       LocalConfigKeyHelper$nearbyVideoCacheConfig$2.INSTANCE = new LocalConfigKeyHelper$nearbyVideoCacheConfig$2();
    }
    public void LocalConfigKeyHelper$nearbyVideoCacheConfig$2(){
       super(0);
    }
    public final NearbyVideoCacheConfig invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$nearbyVideoCacheConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b("localLoadMoreCacheConfig", NearbyVideoCacheConfig.class, new NearbyVideoCacheConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
