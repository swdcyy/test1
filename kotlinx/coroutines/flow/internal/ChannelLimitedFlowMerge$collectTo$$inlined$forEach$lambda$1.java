package kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import asd.c;
import htd.w;
import ktd.k;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import jtd.e;

public final class ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1 extends SuspendLambda implements p	// class@001b13
{
    public final k $collector$inlined;
    public final d $flow;
    public final w $scope$inlined;
    public Object L$0;
    public int label;
    public k0 p$;

    public void ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1(d p0,c p1,w p2,k p3){
       this.$flow = p0;
       this.$scope$inlined = p2;
       this.$collector$inlined = p3;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1 uocollectTo$ = new ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1(this.$flow, p1, this.$scope$inlined, this.$collector$inlined);
       uocollectTo$.p$ = p0;
       return uocollectTo$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelLimitedFlowMerge$collectTo$$inlined$forEach$lambda$1 tlabel = this.label;
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
          if (this.$flow.b(this.$collector$inlined, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
