package kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import kotlinx.coroutines.flow.FlowKt__DelayKt$debounce$2;
import htd.y;
import kotlin.jvm.internal.Ref$ObjectRef;
import jtd.e;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import ktd.j;

public final class FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1 extends SuspendLambda implements p	// class@0019df
{
    public final e $downstream$inlined;
    public final Ref$ObjectRef $lastValue$inlined;
    public final y $values$inlined;
    public Object L$0;
    public int label;
    public Object p$0;
    public final FlowKt__DelayKt$debounce$2 this$0;

    public void FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1(c p0,FlowKt__DelayKt$debounce$2 p1,y p2,Ref$ObjectRef p3,e p4){
       this.this$0 = p1;
       this.$values$inlined = p2;
       this.$lastValue$inlined = p3;
       this.$downstream$inlined = p4;
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1 uodebounce$2 = new FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1(p1, this.this$0, this.$values$inlined, this.$lastValue$inlined, this.$downstream$inlined);
       v6.p$0 = p0;
       return v6;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          if (p0 == null) {
             Ref$ObjectRef element = this.$lastValue$inlined.element;
             if (element != null) {
                FlowKt__DelayKt$debounce$2$invokeSuspend$$inlined$select$lambda$1 t$downstream = this.$downstream$inlined;
                if (element == j.a) {
                   element = null;
                }
                this.L$0 = p0;
                this.label = 1;
                if (t$downstream.emit(element, this) == obj) {
                   return obj;
                }
             }
          }else {
             this.$lastValue$inlined.element = p0;
          label_0041 :
             return l1.a;
          }
       }
       p0.element = j.b;
       goto label_0041 ;
    }
}
