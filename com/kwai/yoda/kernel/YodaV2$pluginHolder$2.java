package com.kwai.yoda.kernel.YodaV2$pluginHolder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import xy7.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaV2$pluginHolder$2 extends Lambda implements a	// class@00127e
{
    public static final YodaV2$pluginHolder$2 INSTANCE;

    static {
       YodaV2$pluginHolder$2.INSTANCE = new YodaV2$pluginHolder$2();
    }
    public void YodaV2$pluginHolder$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final b invoke(){
       Object obj = PatchProxy.apply(null, this, YodaV2$pluginHolder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new b();
    }
}
