package com.kwai.sdk.eve.internal.common.utils.StopWatchKt$union$union$2;
import msd.p;
import kotlin.jvm.internal.Lambda;
import java.lang.String;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class StopWatchKt$union$union$2 extends Lambda implements p	// class@0014ab
{
    public final String $unionTag;

    public void StopWatchKt$union$union$2(String p0){
       this.$unionTag = p0;
       super(2);
    }
    public final TimeRange invoke(long p0,long p1){
       Object obj;
       if (PatchProxy.isSupport(StopWatchKt$union$union$2.class)) {
          obj = PatchProxy.applyTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, StopWatchKt$union$union$2.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       TimeRange timeRange = new TimeRange(this.$unionTag, p0, p1);
       return obj;
    }
    public Object invoke(Object p0,Object p1){
       return this.invoke(p0.longValue(), p1.longValue());
    }
}
