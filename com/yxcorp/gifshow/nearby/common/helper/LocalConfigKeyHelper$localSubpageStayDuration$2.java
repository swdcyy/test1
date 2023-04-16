package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$localSubpageStayDuration$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class LocalConfigKeyHelper$localSubpageStayDuration$2 extends Lambda implements a	// class@0020fc
{
    public static final LocalConfigKeyHelper$localSubpageStayDuration$2 INSTANCE;

    static {
       LocalConfigKeyHelper$localSubpageStayDuration$2.INSTANCE = new LocalConfigKeyHelper$localSubpageStayDuration$2();
    }
    public void LocalConfigKeyHelper$localSubpageStayDuration$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$localSubpageStayDuration$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("localSubPageStayDuration", 0);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
