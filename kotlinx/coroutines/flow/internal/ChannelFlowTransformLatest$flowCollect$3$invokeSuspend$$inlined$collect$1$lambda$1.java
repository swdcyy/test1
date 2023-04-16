package kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import msd.q;

public final class ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1 extends SuspendLambda implements p	// class@001b0f
{
    public final Object $value;
    public Object L$0;
    public int label;
    public k0 p$;
    public final ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 this$0;

    public void ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1(Object p0,c p1,ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 p2){
       this.$value = p0;
       this.this$0 = p2;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1 uoflowCollec = new ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1(this.$value, p1, this.this$0);
       uoflowCollec.p$ = p0;
       return uoflowCollec;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1 b;
       Object obj = b.h();
       ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          b = this.this$0.b;
          this.L$0 = this.p$;
          this.label = 1;
          if (b.this$0.d.invoke(b.$collector, this.$value, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
