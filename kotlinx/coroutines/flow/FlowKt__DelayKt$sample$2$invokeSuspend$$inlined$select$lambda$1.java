package kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1;
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
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import java.util.concurrent.CancellationException;
import ktd.j;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1 extends SuspendLambda implements p	// class@0019e5
{
    public final e $downstream$inlined;
    public final Ref$ObjectRef $lastValue$inlined;
    public final y $ticker$inlined;
    public final y $values$inlined;
    public int label;
    public Object p$0;

    public void FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1(c p0,y p1,y p2,Ref$ObjectRef p3,e p4){
       this.$values$inlined = p1;
       this.$ticker$inlined = p2;
       this.$lastValue$inlined = p3;
       this.$downstream$inlined = p4;
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1 osample$2$in = new FlowKt__DelayKt$sample$2$invokeSuspend$$inlined$select$lambda$1(p1, this.$values$inlined, this.$ticker$inlined, this.$lastValue$inlined, this.$downstream$inlined);
       v6.p$0 = p0;
       return v6;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       p0 = this.p$0;
       if (p0 == null) {
          this.$ticker$inlined.b(new ChildCancelledException());
          p0.element = j.b;
       }else {
          this.$lastValue$inlined.element = p0;
       }
       return l1.a;
    }
}
