package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.nearby.common.model.NearbyVideoCacheConfig;
import com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper;

public final class LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2 extends Lambda implements a	// class@0020f6
{
    public static final LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2 INSTANCE;

    static {
       LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2.INSTANCE = new LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2();
    }
    public void LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$isEnableLocalLoadMoreOptimize$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (LocalConfigKeyHelper.j().mCacheSize > null)? true: false;
       return b;
    }
}
