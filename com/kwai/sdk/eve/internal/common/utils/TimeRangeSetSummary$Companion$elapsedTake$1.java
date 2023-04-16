package com.kwai.sdk.eve.internal.common.utils.TimeRangeSetSummary$Companion$elapsedTake$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import kotlin.jvm.internal.a;
import java.lang.Long;

public final class TimeRangeSetSummary$Companion$elapsedTake$1 extends Lambda implements l	// class@0014b0
{
    public static final TimeRangeSetSummary$Companion$elapsedTake$1 INSTANCE;

    static {
       TimeRangeSetSummary$Companion$elapsedTake$1.INSTANCE = new TimeRangeSetSummary$Companion$elapsedTake$1();
    }
    public void TimeRangeSetSummary$Companion$elapsedTake$1(){
       super(1);
    }
    public final long invoke(TimeRange p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRangeSetSummary$Companion$elapsedTake$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       a.p(p0, "it");
       return p0.c();
    }
    public Object invoke(Object p0){
       return Long.valueOf(this.invoke(p0));
    }
}
