package kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
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

public final class FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2 extends SuspendLambda implements p	// class@0019e6
{
    public final e $downstream$inlined;
    public final Ref$ObjectRef $lastValue$inlined;
    public final y $ticker$inlined;
    public final y $values$inlined;
    public Object L$0;
    public Object L$1;
    public int label;
    public l1 p$0;

    public void FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2(c p0,y p1,y p2,Ref$ObjectRef p3,e p4){
       this.$values$inlined = p1;
       this.$ticker$inlined = p2;
       this.$lastValue$inlined = p3;
       this.$downstream$inlined = p4;
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2 osample$2$in = new FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2(p1, this.$values$inlined, this.$ticker$inlined, this.$lastValue$inlined, this.$downstream$inlined);
       v6.p$0 = p0;
       return v6;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          tlabel = this.$lastValue$inlined;
          Ref$ObjectRef element = tlabel.element;
          if (element != null) {
             Ref$ObjectRef objectRef = null;
             tlabel.element = objectRef;
             tlabel = this.$downstream$inlined;
             if (element != j.a) {
                objectRef = element;
             }
             this.L$0 = p0;
             this.L$1 = element;
             this.label = 1;
             if (tlabel.emit(objectRef, this) == obj) {
                return obj;
             }
          }else {
             return l1.a;
          }
       }
       return l1.a;
    }
}
