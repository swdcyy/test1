package kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import jtd.e;
import asd.c;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import jtd.d;
import kotlin.jvm.internal.Ref$ObjectRef;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1;

public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements p	// class@001b11
{
    public final e $collector;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public k0 p$;
    public final ChannelFlowTransformLatest this$0;

    public void ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest p0,e p1,c p2){
       this.this$0 = p0;
       this.$collector = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelFlowTransformLatest$flowCollect$3 uoflowCollec = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, p1);
       uoflowCollec.p$ = p0;
       return uoflowCollec;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelFlowTransformLatest$flowCollect$3 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          Ref$ObjectRef objectRef = new Ref$ObjectRef();
          objectRef.element = null;
          ChannelFlowOperator c = this.this$0.c;
          this.L$0 = p0;
          this.L$1 = objectRef;
          this.L$2 = c;
          this.label = 1;
          if (c.b(new ChannelFlowTransformLatest$flowCollect$3$invokeSuspend$$inlined$collect$1(this, p0, objectRef), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
