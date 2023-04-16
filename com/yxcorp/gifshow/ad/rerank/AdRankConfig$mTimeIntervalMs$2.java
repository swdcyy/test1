package com.yxcorp.gifshow.ad.rerank.AdRankConfig$mTimeIntervalMs$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.experiment.c;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Long;
import java.lang.reflect.Type;
import com.kwai.framework.abtest.f;

public final class AdRankConfig$mTimeIntervalMs$2 extends Lambda implements a	// class@0017c1
{
    public static final AdRankConfig$mTimeIntervalMs$2 INSTANCE;

    static {
       AdRankConfig$mTimeIntervalMs$2.INSTANCE = new AdRankConfig$mTimeIntervalMs$2();
    }
    public void AdRankConfig$mTimeIntervalMs$2(){
       super(0);
    }
    public final long invoke(){
       c obj = PatchProxy.apply(null, this, AdRankConfig$mTimeIntervalMs$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = c.h();
       a.o(obj, "ABManager.getInstance\(\)");
       long l = 232;
       if (obj.k()) {
          Object obj1 = f.b("adRankTimeInterval", Integer.class, Long.valueOf(l));
          a.o(obj1, "ExperimentManager.getCon¡­::class.java, 232\n      \)");
          l = obj1.longValue();
       }
       return l;
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
