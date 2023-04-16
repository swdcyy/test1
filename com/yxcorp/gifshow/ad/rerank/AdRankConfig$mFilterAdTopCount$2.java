package com.yxcorp.gifshow.ad.rerank.AdRankConfig$mFilterAdTopCount$2;
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
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;

public final class AdRankConfig$mFilterAdTopCount$2 extends Lambda implements a	// class@0017c0
{
    public static final AdRankConfig$mFilterAdTopCount$2 INSTANCE;

    static {
       AdRankConfig$mFilterAdTopCount$2.INSTANCE = new AdRankConfig$mFilterAdTopCount$2();
    }
    public void AdRankConfig$mFilterAdTopCount$2(){
       super(0);
    }
    public final int invoke(){
       c obj = PatchProxy.apply(null, this, AdRankConfig$mFilterAdTopCount$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = c.h();
       a.o(obj, "ABManager.getInstance\(\)");
       int i = 2;
       if (obj.k()) {
          i = a.t().a("adFilterTopCount", i);
       }
       return i;
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
