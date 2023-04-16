package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableForegroundSwitchRefresh$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$enableForegroundSwitchRefresh$2 extends Lambda implements a	// class@0020ea
{
    public static final LocalConfigKeyHelper$enableForegroundSwitchRefresh$2 INSTANCE;

    static {
       LocalConfigKeyHelper$enableForegroundSwitchRefresh$2.INSTANCE = new LocalConfigKeyHelper$enableForegroundSwitchRefresh$2();
    }
    public void LocalConfigKeyHelper$enableForegroundSwitchRefresh$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$enableForegroundSwitchRefresh$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("nearbyRefreshTimeOptimize");
    }
}
