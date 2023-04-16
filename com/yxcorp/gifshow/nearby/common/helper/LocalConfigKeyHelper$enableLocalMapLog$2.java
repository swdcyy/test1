package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalMapLog$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class LocalConfigKeyHelper$enableLocalMapLog$2 extends Lambda implements a	// class@0020ed
{
    public static final LocalConfigKeyHelper$enableLocalMapLog$2 INSTANCE;

    static {
       LocalConfigKeyHelper$enableLocalMapLog$2.INSTANCE = new LocalConfigKeyHelper$enableLocalMapLog$2();
    }
    public void LocalConfigKeyHelper$enableLocalMapLog$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$enableLocalMapLog$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("socialEcologyPageCostLocalPhotoMapEnable", false);
    }
}
