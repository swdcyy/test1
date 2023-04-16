package com.yxcorp.gifshow.nearby.common.helper.LocalConfigKeyHelper$nearbyBubbleSupportClick$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.abtest.f;

public final class LocalConfigKeyHelper$nearbyBubbleSupportClick$2 extends Lambda implements a	// class@0020fe
{
    public static final LocalConfigKeyHelper$nearbyBubbleSupportClick$2 INSTANCE;

    static {
       LocalConfigKeyHelper$nearbyBubbleSupportClick$2.INSTANCE = new LocalConfigKeyHelper$nearbyBubbleSupportClick$2();
    }
    public void LocalConfigKeyHelper$nearbyBubbleSupportClick$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, LocalConfigKeyHelper$nearbyBubbleSupportClick$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("nearbyBubbleSupportClick");
    }
}
