package com.kwai.sdk.eve.internal.common.utils.TimeRange;
import en7.m;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.utils.TimeRange$elapsed$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Comparable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;
import java.lang.Number;
import java.lang.Boolean;
import en7.i;
import java.util.concurrent.TimeUnit;

public final class TimeRange implements m	// class@0014ae
{
    public final p a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final long f;

    public void TimeRange(String p0,long p1,long p2){
       a.p(p0, "tag");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.a = s.c(new TimeRange$elapsed$2(this));
       this.b = p1;
       this.c = p2;
    }
    public Comparable a(){
       Long longx = PatchProxy.apply(null, this, TimeRange.class, "3");
       if (longx != PatchProxyResult.class) {
       }else {
          longx = Long.valueOf(this.c);
       }
       return longx;
    }
    public Comparable b(){
       Long longx = PatchProxy.apply(null, this, TimeRange.class, "2");
       if (longx != PatchProxyResult.class) {
       }else {
          longx = Long.valueOf(this.b);
       }
       return longx;
    }
    public final long c(){
       Object obj = PatchProxy.apply(null, this, TimeRange.class, "1");
       if (obj == PatchProxyResult.class) {
          obj = this.a.getValue();
       }
       return obj.longValue();
    }
    public final long d(){
       return this.f;
    }
    public final long e(){
       return this.e;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TimeRange.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof TimeRange && (a.g(this.d, p0.d) && (!this.e - p0.e && !this.f - p0.f)))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       TimeRange obj = PatchProxy.apply(null, this, TimeRange.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.d;
       int i = (obj != null)? obj.hashCode(): 0;
       TimeRange te = this.e;
       te = this.f;
       return ((((i * 31) + (int)(te ^ (te >> 32))) * 31) + (int)(te ^ (te >> 32)));
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, TimeRange.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return i.a(i.a, this.c(), null, 2, null);
    }
}
