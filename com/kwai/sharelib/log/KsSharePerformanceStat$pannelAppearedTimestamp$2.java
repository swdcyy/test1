package com.kwai.sharelib.log.KsSharePerformanceStat$pannelAppearedTimestamp$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.sharelib.log.KsSharePerformanceStat;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Long;

public final class KsSharePerformanceStat$pannelAppearedTimestamp$2 extends Lambda implements a	// class@0016d5
{
    public final KsSharePerformanceStat this$0;

    public void KsSharePerformanceStat$pannelAppearedTimestamp$2(KsSharePerformanceStat p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat$pannelAppearedTimestamp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.this$0.t("pannel_appeared");
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
