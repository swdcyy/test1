package kotlinx.coroutines.flow.FlowKt__BuildersKt$flowViaChannel$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import htd.c0;
import msd.a;
import kotlinx.coroutines.channels.ProduceKt;

public final class FlowKt__BuildersKt$flowViaChannel$1 extends SuspendLambda implements p	// class@0019cb
{
    public final p $block;
    public Object L$0;
    public int label;
    public w p$;

    public void FlowKt__BuildersKt$flowViaChannel$1(p p0,c p1){
       this.$block = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       FlowKt__BuildersKt$flowViaChannel$1 uoflowViaCha = new FlowKt__BuildersKt$flowViaChannel$1(this.$block, p1);
       uoflowViaCha.p$ = p0;
       return uoflowViaCha;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__BuildersKt$flowViaChannel$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          this.$block.invoke(p0, p0.getChannel());
          this.L$0 = p0;
          this.label = 1;
          if (ProduceKt.b(p0, null, this, 1, null) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
