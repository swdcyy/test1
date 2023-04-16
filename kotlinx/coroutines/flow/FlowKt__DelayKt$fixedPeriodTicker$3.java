package kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$3;
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
import kotlinx.coroutines.c;
import htd.c0;

public final class FlowKt__DelayKt$fixedPeriodTicker$3 extends SuspendLambda implements p	// class@0019e4
{
    public final long $delayMillis;
    public final long $initialDelayMillis;
    public Object L$0;
    public int label;
    public w p$;

    public void FlowKt__DelayKt$fixedPeriodTicker$3(long p0,long p1,c p2){
       this.$initialDelayMillis = p0;
       this.$delayMillis = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       FlowKt__DelayKt$fixedPeriodTicker$3 uofixedPerio = new FlowKt__DelayKt$fixedPeriodTicker$3(this.$initialDelayMillis, this.$delayMillis, p1);
       v6.p$ = p0;
       return v6;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       FlowKt__DelayKt$fixedPeriodTicker$3 tlabel = this.label;
       c0 uoc0 = 1;
       if (tlabel != null) {
          if (tlabel != uoc0) {
             if (tlabel != 2) {
                if (tlabel != 3) {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                tlabel = this.L$0;
                j0.n(p0);
                p0 = this;
             label_004e :
                p0.L$0 = tlabel;
                p0.label = 3;
                if (c.a(p0.$delayMillis, p0) == obj) {
                   return obj;
                }else {
                label_003d :
                   p0.L$0 = tlabel;
                   p0.label = 2;
                   if (tlabel.getChannel().l(l1.a, p0) == obj) {
                      return obj;
                   }else {
                      goto label_004e ;
                   }
                }
             }
          }
          tlabel = this.L$0;
          j0.n(p0);
       }else {
          j0.n(p0);
          tlabel = this.p$;
          this.L$0 = tlabel;
          this.label = uoc0;
          if (c.a(this.$initialDelayMillis, this) == obj) {
             return obj;
          }
       }
       p0 = this;
       goto label_003d ;
    }
}
