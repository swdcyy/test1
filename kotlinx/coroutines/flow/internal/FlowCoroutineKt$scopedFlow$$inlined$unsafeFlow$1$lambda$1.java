package kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.e;
import asd.c;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import msd.q;

public final class FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1 extends SuspendLambda implements p	// class@001b27
{
    public final e $this_unsafeFlow;
    public Object L$0;
    public int label;
    public k0 p$;
    public final FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 this$0;

    public void FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1(e p0,c p1,FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1 p2){
       this.$this_unsafeFlow = p0;
       this.this$0 = p2;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1 oscopedFlow$ = new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1(this.$this_unsafeFlow, p1, this.this$0);
       oscopedFlow$.p$ = p0;
       return oscopedFlow$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          this.L$0 = p0;
          this.label = 1;
          if (this.this$0.a.invoke(p0, this.$this_unsafeFlow, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
