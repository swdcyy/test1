package kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2;
import msd.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.lang.Object;
import asd.c;
import otd.a;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2;
import htd.y;
import kotlin.jvm.internal.Ref$ObjectRef;
import jtd.e;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ktd.j;

public final class FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2 extends SuspendLambda implements l	// class@0019e0
{
    public final e $downstream$inlined;
    public final Ref$ObjectRef $lastValue$inlined;
    public final a $this_select$inlined;
    public final Object $value;
    public final y $values$inlined;
    public int label;
    public final FlowKt__DelayKt$debounce$2 this$0;

    public void FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2(Object p0,c p1,a p2,FlowKt__DelayKt$debounce$2 p3,y p4,Ref$ObjectRef p5,e p6){
       this.$value = p0;
       this.$this_select$inlined = p2;
       this.this$0 = p3;
       this.$values$inlined = p4;
       this.$lastValue$inlined = p5;
       this.$downstream$inlined = p6;
       super(1, p1);
    }
    public final c create(c p0){
       FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2 uodebounce$2 = new FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2(this.$value, p0, this.$this_select$inlined, this.this$0, this.$values$inlined, this.$lastValue$inlined, this.$downstream$inlined);
       return v8;
    }
    public final Object invoke(Object p0){
       return this.create(p0).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          tlabel = null;
          p0.element = tlabel;
          p0 = this.$downstream$inlined;
          FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$2 t$value = this.$value;
          if (t$value != j.a) {
             tlabel = t$value;
          }
          this.label = 1;
          if (p0.emit(tlabel, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
