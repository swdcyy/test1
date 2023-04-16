package com.kwai.yoda.kernel.YodaV2$bridgeHolder$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ny7.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class YodaV2$bridgeHolder$2 extends Lambda implements a	// class@00127d
{
    public static final YodaV2$bridgeHolder$2 INSTANCE;

    static {
       YodaV2$bridgeHolder$2.INSTANCE = new YodaV2$bridgeHolder$2();
    }
    public void YodaV2$bridgeHolder$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final h invoke(){
       Object obj = PatchProxy.apply(null, this, YodaV2$bridgeHolder$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h();
    }
}
