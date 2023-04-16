package com.kwai.sharelib.log.KsSharePerformanceStat$requestShareAnyEndTimestamp$2;
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

public final class KsSharePerformanceStat$requestShareAnyEndTimestamp$2 extends Lambda implements a	// class@0016d6
{
    public final KsSharePerformanceStat this$0;

    public void KsSharePerformanceStat$requestShareAnyEndTimestamp$2(KsSharePerformanceStat p0){
       this.this$0 = p0;
       super(0);
    }
    public final long invoke(){
       Object obj = PatchProxy.apply(null, this, KsSharePerformanceStat$requestShareAnyEndTimestamp$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       return this.this$0.t("request_share_any_end");
    }
    public Object invoke(){
       return Long.valueOf(this.invoke());
    }
}
