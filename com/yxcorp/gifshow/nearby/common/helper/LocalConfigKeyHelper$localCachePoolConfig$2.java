package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localCachePoolConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.nearby.common.model.NearbyCachePoolConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$localCachePoolConfig$2 extends Lambda implements a	// class@0020f8
{
    public static final LocalConfigKeyHelper$localCachePoolConfig$2 INSTANCE;

    static {
       LocalConfigKeyHelper$localCachePoolConfig$2.INSTANCE = new LocalConfigKeyHelper$localCachePoolConfig$2();
    }
    public void LocalConfigKeyHelper$localCachePoolConfig$2(){
       super(0);
    }
    public final NearbyCachePoolConfig invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$localCachePoolConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b("localFirstScreenCacheConfig", NearbyCachePoolConfig.class, new NearbyCachePoolConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
