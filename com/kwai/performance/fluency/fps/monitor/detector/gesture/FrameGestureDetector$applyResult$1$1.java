package com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector$applyResult$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import ye7.a;
import ve7.d;
import com.kwai.performance.fluency.fps.monitor.detector.gesture.FrameGestureDetector;
import java.lang.Object;
import qrd.l1;
import java.util.LinkedHashMap;
import ve7.e;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Number;
import ve7.b;
import java.lang.Integer;
import java.util.Map;
import com.kwai.performance.fluency.fps.monitor.event.FpsEventV2;
import java.util.List;
import ve7.a;
import kotlin.jvm.internal.a;
import java.util.Collection;
import we7.a;

public final class FrameGestureDetector$applyResult$1$1 extends Lambda implements a	// class@001077
{
    public final a $fpsEvent;
    public final d $it;
    public final FrameGestureDetector this$0;

    public void FrameGestureDetector$applyResult$1$1(a p0,d p1,FrameGestureDetector p2){
       this.$fpsEvent = p0;
       this.$it = p1;
       this.this$0 = p2;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       FrameGestureDetector$applyResult$1$1 obj;
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       Iterator iterator = e.a.iterator();
       while (iterator.hasNext()) {
          int i = iterator.next().intValue();
          b uob = new b(i);
          linkedHashMa.put(Integer.valueOf(i), uob);
       }
       b uob1 = new b(-1);
       FrameGestureDetector$applyResult$1$1 t$it = this.$it;
       uob1.g(t$it.b());
       uob1.e((t$it.e - this.$fpsEvent.startTime));
       uob1.f(this.this$0.j(uob1.c(), uob1.a()));
       this.$fpsEvent.e().add(uob1);
       FrameGestureDetector$applyResult$1$1 t$fpsEvent = this.$fpsEvent;
       Iterator iterator1 = this.$it.c().iterator();
       while (iterator1.hasNext()) {
          a uoa = iterator1.next();
          long l = uoa.c() - t$fpsEvent.startTime;
          uoa.startTs = l;
          l = uoa.a() - t$fpsEvent.startTime;
          uoa.endTs = l;
          obj = linkedHashMa.get(Integer.valueOf(uoa.d()));
          a.m(obj);
          int i1 = obj.c() + uoa.b();
          obj.g(i1);
          long l1 = uoa.a() - uoa.c();
          long l2 = obj.a() + l1;
          obj.e(l2);
       }
       this.$fpsEvent.g().addAll(this.$it.c());
       long l3 = 0;
       FrameGestureDetector$applyResult$1$1 tthis$0 = this.this$0;
       obj = this.$fpsEvent;
       Iterator iterator2 = linkedHashMa.values().iterator();
       int i2 = 0;
       while (iterator2.hasNext()) {
          b uob2 = iterator2.next();
          uob2.f(tthis$0.j(uob2.c(), uob2.a()));
          if (tthis$0.m(uob2)) {
             obj.e().add(uob2);
          }
          obj.f().add(new a(uob2.d(), uob2.a()));
          i2 = i2 + uob2.c();
          l3 = l3 + uob2.a();
       }
       b uob3 = new b(0);
       tthis$0 = this.this$0;
       obj = this.$fpsEvent;
       uob3.e((uob1.a() - l3));
       uob3.g((uob1.c() - i2));
       uob3.f(tthis$0.j(uob3.c(), uob3.a()));
       if (tthis$0.m(uob3)) {
          obj.e().add(uob3);
       }
       obj.f().add(new a(uob3.d(), uob3.a()));
       return;
    }
}
