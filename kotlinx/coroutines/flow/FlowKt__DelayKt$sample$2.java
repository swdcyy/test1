package kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import asd.c;
import ftd.k0;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import htd.y;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.channels.ProduceKt;
import jtd.f;
import ktd.j;
import otd.b;
import otd.d;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1;
import otd.a;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2;
import java.lang.Throwable;
import dsd.e;

public final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements q	// class@0019e9
{
    public final long $periodMillis;
    public final d $this_sample;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public k0 p$;
    public e p$0;

    public void FlowKt__DelayKt$sample$2(d p0,long p1,c p2){
       this.$this_sample = p0;
       this.$periodMillis = p1;
       super(3, p2);
    }
    public final c create(k0 p0,e p1,c p2){
       FlowKt__DelayKt$sample$2 osample$2 = new FlowKt__DelayKt$sample$2(this.$this_sample, this.$periodMillis, p2);
       osample$2.p$ = p0;
       osample$2.p$0 = p1;
       return osample$2;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       FlowKt__DelayKt$sample$2 osample$21;
       FlowKt__DelayKt$sample$2 osample$22;
       FlowKt__DelayKt$sample$2 osample$23;
       FlowKt__DelayKt$sample$2 osample$24;
       FlowKt__DelayKt$sample$2 osample$25;
       FlowKt__DelayKt$sample$2 osample$26;
       Object obj1;
       b this;
       FlowKt__DelayKt$sample$2 osample$2 = this;
       Object obj = b.h();
       FlowKt__DelayKt$sample$2 label = osample$2.label;
       int i = 1;
       if (label != null) {
          if (label == i) {
             j0.n(p0);
             osample$21 = osample$2;
             osample$22 = osample$2.L$4;
             osample$23 = osample$2.L$3;
             osample$24 = osample$2.L$2;
             osample$25 = osample$2.L$1;
             osample$26 = osample$2.L$0;
             obj1 = obj;
          label_00ba :
             i = 1;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          label = osample$2.p$;
          osample$25 = osample$2.p$0;
          FlowKt__DelayKt$sample$2 osample$27 = label;
          osample$24 = ProduceKt.f(osample$27, null, -1, new FlowKt__DelayKt$sample$2$values$1(osample$2, null), 1, null);
          osample$23 = new Ref$ObjectRef();
          osample$23.element = null;
          osample$21 = osample$2;
          osample$26 = label;
          osample$22 = f.v0(osample$27, osample$2.$periodMillis, 0, 2, null);
          obj1 = obj;
       }
       if (osample$23.element != j.b) {
          osample$21.L$0 = osample$26;
          osample$21.L$1 = osample$25;
          osample$21.L$2 = osample$24;
          osample$21.L$3 = osample$23;
          osample$21.L$4 = osample$22;
          osample$21.L$5 = osample$21;
          osample$21.label = i;
          FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1 osample$2$in = v8;
          FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1 osample$2$in1 = v8;
          this = new b(osample$21);
          osample$2$in = new FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1(null, osample$24, osample$22, osample$23, osample$25);
          this.f(osample$24.B(), osample$2$in1);
          FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2 osample$2$in2 = new FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2(null, osample$24, osample$22, osample$23, osample$25);
          this.f(osample$22.s(), osample$2$in1);
          obj = this.h0();
          if (obj == b.h()) {
             e.c(osample$21);
          }
          if (obj == obj1) {
             return obj1;
          }else {
             goto label_00ba ;
          }
       }else {
          return l1.a;
       }
    }
}
