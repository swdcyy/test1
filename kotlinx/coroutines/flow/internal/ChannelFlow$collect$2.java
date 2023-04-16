package kotlinx.coroutines.flow.internal.ChannelFlow$collect$2;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import jtd.e;
import asd.c;
import java.lang.Object;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import htd.y;
import jtd.f;

public final class ChannelFlow$collect$2 extends SuspendLambda implements p	// class@001b05
{
    public final e $collector;
    public Object L$0;
    public int label;
    public k0 p$;
    public final ChannelFlow this$0;

    public void ChannelFlow$collect$2(ChannelFlow p0,e p1,c p2){
       this.this$0 = p0;
       this.$collector = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelFlow$collect$2 uocollect$2 = new ChannelFlow$collect$2(this.this$0, this.$collector, p1);
       uocollect$2.p$ = p0;
       return uocollect$2;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelFlow$collect$2 tlabel = this.label;
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
          if (f.i0(this.$collector, this.this$0.j(p0), this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
