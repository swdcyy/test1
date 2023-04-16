package com.kwai.yoda.kernel.YodaV2;
import com.kwai.yoda.kernel.YodaV2$bridgeHolder$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.yoda.kernel.YodaV2$pluginHolder$2;
import java.lang.Object;
import ny7.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xy7.b;

public final class YodaV2	// class@00127f
{
    public static final p a;
    public static final p b;
    public static boolean c;
    public static boolean d;
    public static a e;
    public static final YodaV2 f;

    static {
       YodaV2.f = new YodaV2();
       YodaV2.a = s.c(YodaV2$bridgeHolder$2.INSTANCE);
       YodaV2.b = s.c(YodaV2$pluginHolder$2.INSTANCE);
    }
    public void YodaV2(){
       super();
    }
    public final h a(){
       Object obj = PatchProxy.apply(null, this, YodaV2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaV2.a.getValue();
    }
    public final b b(){
       Object obj = PatchProxy.apply(null, this, YodaV2.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return YodaV2.b.getValue();
    }
}
