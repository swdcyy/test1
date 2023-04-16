package com.kwai.sdk.eve.internal.common.utils.TimeRangeSetSummary;
import com.kwai.sdk.eve.internal.common.utils.TimeRangeSetSummary$a;
import nsd.u;
import com.kwai.sdk.eve.internal.common.utils.TimeRangeSetSummary$Companion$elapsedTake$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.StringBuilder;
import en7.i;
import java.util.concurrent.TimeUnit;

public final class TimeRangeSetSummary	// class@0014b2
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public static final l e;
    public static final TimeRangeSetSummary$a f;

    static {
       TimeRangeSetSummary.f = new TimeRangeSetSummary$a(null);
       TimeRangeSetSummary.e = TimeRangeSetSummary$Companion$elapsedTake$1.INSTANCE;
    }
    public void TimeRangeSetSummary(long p0,long p1,long p2,long p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final long a(){
       return this.c;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof TimeRangeSetSummary && (!this.a - p0.a && (!this.b - p0.b && (!this.c - p0.c && !this.d - p0.d))))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TimeRangeSetSummary obj = PatchProxy.apply(null, this, TimeRangeSetSummary.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       TimeRangeSetSummary tb = this.b;
       tb = this.c;
       tb = this.d;
       return (((((((int)(obj ^ (obj >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TimeRangeSetSummary.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       i a = i.a;
       return "[start="+this.a+", end="+this.b+", total="+i.a(a, this.c, null, 2, null)+", busy="+i.a(a, this.d, null, 2, null)+']';
    }
}
