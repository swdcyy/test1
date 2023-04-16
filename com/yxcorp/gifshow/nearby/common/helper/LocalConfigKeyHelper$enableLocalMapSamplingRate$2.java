package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$enableLocalMapSamplingRate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class LocalConfigKeyHelper$enableLocalMapSamplingRate$2 extends Lambda implements a	// class@0020ee
{
    public static final LocalConfigKeyHelper$enableLocalMapSamplingRate$2 INSTANCE;

    static {
       LocalConfigKeyHelper$enableLocalMapSamplingRate$2.INSTANCE = new LocalConfigKeyHelper$enableLocalMapSamplingRate$2();
    }
    public void LocalConfigKeyHelper$enableLocalMapSamplingRate$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$enableLocalMapSamplingRate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableLocalMapSamplingRate", false);
    }
}
