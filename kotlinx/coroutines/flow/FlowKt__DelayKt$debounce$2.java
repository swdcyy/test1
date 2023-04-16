package kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2;
import msd.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import asd.c;
import ftd.k0;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import kotlin.jvm.internal.Ref$ObjectRef;
import htd.y;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$values$1;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.channels.ProduceKt;
import ktd.j;
import otd.b;
import otd.d;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1;
import otd.a;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2;
import msd.l;
import java.lang.Throwable;
import dsd.e;

public final class FlowKt__DelayKt$debounce$2 extends SuspendLambda implements q	// class@0019e3
{
    public final d $this_debounce;
    public final long $timeoutMillis;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public k0 p$;
    public e p$0;

    public void FlowKt__DelayKt$debounce$2(d p0,long p1,c p2){
       this.$this_debounce = p0;
       this.$timeoutMillis = p1;
       super(3, p2);
    }
    public final c create(k0 p0,e p1,c p2){
       FlowKt__DelayKt$debounce$2 uodebounce$2 = new FlowKt__DelayKt$debounce$2(this.$this_debounce, this.$timeoutMillis, p2);
       uodebounce$2.p$ = p0;
       uodebounce$2.p$0 = p1;
       return uodebounce$2;
    }
    public final Object invoke(Object p0,Object p1,Object p2){
       return this.create(p0, p1, p2).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       FlowKt__DelayKt$debounce$2 uodebounce$21;
       FlowKt__DelayKt$debounce$2 uodebounce$22;
       FlowKt__DelayKt$debounce$2 uodebounce$23;
       FlowKt__DelayKt$debounce$2 uodebounce$24;
       FlowKt__DelayKt$debounce$2 uodebounce$25;
       Object obj1;
       Ref$ObjectRef element;
       b uob1;
       FlowKt__DelayKt$debounce$2 uodebounce$28;
       FlowKt__DelayKt$debounce$2 uodebounce$2 = this;
       Object obj = b.h();
       FlowKt__DelayKt$debounce$2 label = uodebounce$2.label;
       int i = 1;
       if (label != null) {
          if (label == i) {
             j0.n(p0);
             uodebounce$21 = uodebounce$2;
             uodebounce$22 = uodebounce$2.L$3;
             uodebounce$23 = uodebounce$2.L$2;
             uodebounce$24 = uodebounce$2.L$1;
             uodebounce$25 = uodebounce$2.L$0;
             obj1 = obj;
          label_00bd :
             i = 1;
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          label = uodebounce$2.p$;
          element = new Ref$ObjectRef();
          element.element = null;
          uodebounce$21 = uodebounce$2;
          uodebounce$25 = label;
          uodebounce$23 = ProduceKt.f(label, null, -1, new FlowKt__DelayKt$debounce$2$values$1(uodebounce$2, null), 1, null);
          uodebounce$22 = element;
          uodebounce$24 = uodebounce$2.p$0;
          obj1 = obj;
       }
       if (uodebounce$22.element != j.b) {
          uodebounce$21.L$0 = uodebounce$25;
          uodebounce$21.L$1 = uodebounce$24;
          uodebounce$21.L$2 = uodebounce$23;
          uodebounce$21.L$3 = uodebounce$22;
          uodebounce$21.L$4 = uodebounce$21;
          uodebounce$21.label = i;
          b uob = new b(uodebounce$21);
          FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1 uodebounce$26 = v9;
          FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1 uodebounce$27 = v9;
          uodebounce$26 = new FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1(null, uodebounce$21, uodebounce$23, uodebounce$22, uodebounce$24);
          uob.f(uodebounce$23.B(), uodebounce$27);
          element = uodebounce$22.element;
          if (element != null) {
             uob1 = uob;
             uodebounce$28 = uodebounce$21;
             FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2 uodebounce$29 = new FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2(element, null, uob, uodebounce$21, uodebounce$23, uodebounce$22, uodebounce$24);
             uob1.i(uodebounce$21.$timeoutMillis, obj);
          }else {
             uob1 = uob;
             uodebounce$28 = uodebounce$21;
          }
          obj = uob1.h0();
          if (obj == b.h()) {
             e.c(uodebounce$28);
          }
          if (obj == obj1) {
             return obj1;
          }else {
             uodebounce$21 = uodebounce$28;
             goto label_00bd ;
          }
       }else {
          return l1.a;
       }
    }
}
