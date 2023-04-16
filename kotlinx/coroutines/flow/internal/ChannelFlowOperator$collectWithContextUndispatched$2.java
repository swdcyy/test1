package kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.ChannelFlowOperator;
import asd.c;
import java.lang.Object;
import jtd.e;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class ChannelFlowOperator$collectWithContextUndispatched$2 extends SuspendLambda implements p	// class@001b0c
{
    public Object L$0;
    public int label;
    public e p$0;
    public final ChannelFlowOperator this$0;

    public void ChannelFlowOperator$collectWithContextUndispatched$2(ChannelFlowOperator p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelFlowOperator$collectWithContextUndispatched$2 uocollectWit = new ChannelFlowOperator$collectWithContextUndispatched$2(this.this$0, p1);
       uocollectWit.p$0 = p0;
       return uocollectWit;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelFlowOperator$collectWithContextUndispatched$2 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$0;
          this.L$0 = p0;
          this.label = 1;
          if (this.this$0.n(p0, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
