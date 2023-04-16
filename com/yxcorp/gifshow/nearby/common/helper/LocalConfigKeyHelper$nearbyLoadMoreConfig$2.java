package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyLoadMoreConfig$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.nearby.common.model.NearbyLoadMoreConfig;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$nearbyLoadMoreConfig$2 extends Lambda implements a	// class@002101
{
    public static final LocalConfigKeyHelper$nearbyLoadMoreConfig$2 INSTANCE;

    static {
       LocalConfigKeyHelper$nearbyLoadMoreConfig$2.INSTANCE = new LocalConfigKeyHelper$nearbyLoadMoreConfig$2();
    }
    public void LocalConfigKeyHelper$nearbyLoadMoreConfig$2(){
       super(0);
    }
    public final NearbyLoadMoreConfig invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$nearbyLoadMoreConfig$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b("nearbyLoadMoreOptimizeConfig", NearbyLoadMoreConfig.class, new NearbyLoadMoreConfig());
    }
    public Object invoke(){
       return this.invoke();
    }
}
