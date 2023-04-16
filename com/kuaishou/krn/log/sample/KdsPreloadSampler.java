package com.kuaishou.krn.log.sample.KdsPreloadSampler;
import com.kuaishou.krn.log.sample.KdsPreloadSampler$hitSample$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class KdsPreloadSampler	// class@0008f0
{
    public static final p a;
    public static final KdsPreloadSampler b;

    static {
       KdsPreloadSampler.b = new KdsPreloadSampler();
       KdsPreloadSampler.a = s.c(KdsPreloadSampler$hitSample$2.INSTANCE);
    }
    public void KdsPreloadSampler(){
       super();
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, KdsPreloadSampler.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = KdsPreloadSampler.a.getValue();
       }
       return obj.booleanValue();
    }
}
