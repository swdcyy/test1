package kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import asd.c;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$$inlined$collect$1;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import jtd.e;
import ptd.e;

public final class ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1 extends SuspendLambda implements p	// class@001b09
{
    public final d $inner;
    public Object L$0;
    public int label;
    public k0 p$;
    public final ChannelFlowMerge$collectTo$$inlined$collect$1 this$0;

    public void ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1(d p0,c p1,ChannelFlowMerge$collectTo$$inlined$collect$1 p2){
       this.$inner = p0;
       this.this$0 = p2;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1 uocollectTo$ = new ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1(this.$inner, p1, this.this$0);
       uocollectTo$.p$ = p0;
       return uocollectTo$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelFlowMerge$collectTo$$inlined$collect$1$lambda$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          this.L$0 = this.p$;
          this.label = 1;
          if (this.$inner.b(this.this$0.e, this) == obj) {
             return obj;
          }
       }
       this.this$0.c.release();
       return l1.a;
    }
}
