package kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import msd.q;
import asd.c;
import java.lang.Object;
import jtd.e;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1;
import nsd.c0;

public final class FlowKt__EmittersKt$transform$1 extends SuspendLambda implements p	// class@001a0a
{
    public final d $this_transform;
    public final q $transform;
    public Object L$0;
    public Object L$1;
    public int label;
    public e p$;

    public void FlowKt__EmittersKt$transform$1(d p0,q p1,c p2){
       this.$this_transform = p0;
       this.$transform = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       FlowKt__EmittersKt$transform$1 otransform$1 = new FlowKt__EmittersKt$transform$1(this.$this_transform, this.$transform, p1);
       otransform$1.p$ = p0;
       return otransform$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__EmittersKt$transform$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          tlabel = this.$this_transform;
          this.L$0 = p0;
          this.L$1 = tlabel;
          this.label = 1;
          if (tlabel.b(new FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1(this, p0), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
    public final Object invokeSuspend$$forInline(Object p0){
       c0.e(0);
       this.$this_transform.b(new FlowKt__EmittersKt$transform$1$invokeSuspend$$inlined$collect$1(this, this.p$), this);
       c0.e(2);
       c0.e(1);
       return l1.a;
    }
}
