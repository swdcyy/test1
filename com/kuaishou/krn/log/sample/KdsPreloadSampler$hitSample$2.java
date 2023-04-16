package com.kuaishou.krn.log.sample.KdsPreloadSampler$hitSample$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import dk0.a;

public final class KdsPreloadSampler$hitSample$2 extends Lambda implements a	// class@0008ef
{
    public static final KdsPreloadSampler$hitSample$2 INSTANCE;

    static {
       KdsPreloadSampler$hitSample$2.INSTANCE = new KdsPreloadSampler$hitSample$2();
    }
    public void KdsPreloadSampler$hitSample$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, KdsPreloadSampler$hitSample$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.b.a("krn_preload_usage", Boolean.FALSE);
    }
}
