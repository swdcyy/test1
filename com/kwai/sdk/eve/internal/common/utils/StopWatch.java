package com.kwai.sdk.eve.internal.common.utils.StopWatch;
import msd.a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.sdk.eve.internal.common.utils.StopWatch$record$2;
import qrd.p;
import qrd.s;
import java.util.concurrent.atomic.AtomicReference;
import com.kwai.sdk.eve.internal.common.utils.StopWatchKt;
import com.kwai.sdk.eve.internal.common.utils.TimeRange;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class StopWatch	// class@0014a8
{
    public final p a;
    public AtomicReference b;
    public final a c;

    public void StopWatch(){
       super(null, 1, null);
    }
    public void StopWatch(a p0){
       a.p(p0, "ticker");
       super();
       this.c = p0;
       this.a = s.c(StopWatch$record$2.INSTANCE);
       this.b = new AtomicReference();
    }
    public void StopWatch(a p0,int p1,u p2){
       p0 = (p1 & 0x01)? StopWatchKt.a(): null;
       super(p0);
       return;
    }
    public static TimeRange c(StopWatch p0,String p1,boolean p2,a p3,int p4,Object p5){
       StopWatch c = (p4 & 0x04)? p0.c: null;
       return p0.b(p1, p2, c);
    }
    public static TimeRange g(StopWatch p0,String p1,int p2,Object p3){
       p1 = (p2 & 0x01)? "_": null;
       return p0.f(p1);
    }
    public final List a(){
       Object obj = PatchProxy.apply(null, this, StopWatch.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.getValue();
    }
    public final TimeRange b(String p0,boolean p1,a p2){
       TimeRange obj;
       TimeRange andSet;
       if (PatchProxy.isSupport(StopWatch.class)) {
          obj = PatchProxy.applyThreeRefs(p0, Boolean.valueOf(p1), p2, this, StopWatch.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       long l = p2.invoke().longValue();
       StopWatch tb = this.b;
       if (p1) {
          obj = new TimeRange("_", l, 0);
       }else {
          andSet = null;
       }
       andSet = tb.getAndSet(p1);
       if (andSet != null) {
          obj = new TimeRange(p0, andSet.e(), l);
          List list = this.a();
          _monitor_enter(list);
          this.a().add(tb);
          _monitor_exit(list);
          return tb;
       }else {
          return null;
       }
    }
    public TimeRange d(String p0){
       TimeRange obj = PatchProxy.applyOneRefs(p0, this, StopWatch.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       obj = StopWatch.c(this, p0, true, null, 4, null);
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("the stop watch may not running "+p0);
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, StopWatch.class, "2")) {
          return;
       }
       TimeRange timeRange = new TimeRange("_", this.c.invoke().longValue(), 0);
       if (this.b.compareAndSet(objArray, v8)) {
          return;
       }
       StringBuilder str = "already start for last tag ";
       timeRange = this.b.get();
       if (timeRange != null) {
          timeRange = timeRange.d;
          if (timeRange != null) {
          label_0047 :
             throw new IllegalStateException(str+timeRange);
          }
       }
       String str1 = "null";
       goto label_0047 ;
    }
    public TimeRange f(String p0){
       TimeRange obj = PatchProxy.applyOneRefs(p0, this, StopWatch.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tag");
       obj = StopWatch.c(this, p0, false, null, 4, null);
       if (obj != null) {
          return obj;
       }
       throw new IllegalStateException("the stop watch may not running "+p0);
    }
}
