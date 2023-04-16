package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableRefreshUseNotShow$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$enableRefreshUseNotShow$2 extends Lambda implements a	// class@0020f1
{
    public static final LocalConfigKeyHelper$enableRefreshUseNotShow$2 INSTANCE;

    static {
       LocalConfigKeyHelper$enableRefreshUseNotShow$2.INSTANCE = new LocalConfigKeyHelper$enableRefreshUseNotShow$2();
    }
    public void LocalConfigKeyHelper$enableRefreshUseNotShow$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$enableRefreshUseNotShow$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("nearbySilenceRefreshUseNotShow");
    }
}
