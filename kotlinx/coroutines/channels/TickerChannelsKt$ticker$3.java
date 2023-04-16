package kotlinx.coroutines.channels.TickerChannelsKt$ticker$3;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.TickerMode;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import htd.e0;
import java.lang.Enum;
import htd.c0;
import kotlinx.coroutines.channels.TickerChannelsKt;

public final class TickerChannelsKt$ticker$3 extends SuspendLambda implements p	// class@0019a1
{
    public final long $delayMillis;
    public final long $initialDelayMillis;
    public final TickerMode $mode;
    public Object L$0;
    public int label;
    public w p$;

    public void TickerChannelsKt$ticker$3(TickerMode p0,long p1,long p2,c p3){
       this.$mode = p0;
       this.$delayMillis = p1;
       this.$initialDelayMillis = p2;
       super(2, p3);
    }
    public final c create(Object p0,c p1){
       TickerChannelsKt$ticker$3 oticker$3 = new TickerChannelsKt$ticker$3(this.$mode, this.$delayMillis, this.$initialDelayMillis, p1);
       v7.p$ = p0;
       return v7;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       TickerChannelsKt$ticker$3 tlabel = this.label;
       int i = 1;
       if (tlabel != null) {
          if (tlabel == i || tlabel == 2) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          int i1 = e0.a[this.$mode.ordinal()];
          if (i1 != i) {
             if (i1 == 2) {
                this.L$0 = p0;
                this.label = 2;
                if (TickerChannelsKt.a(this.$delayMillis, this.$initialDelayMillis, p0.getChannel(), this) == obj) {
                   return obj;
                }
             }
          }else {
             this.L$0 = p0;
             this.label = i;
             if (TickerChannelsKt.b(this.$delayMillis, this.$initialDelayMillis, p0.getChannel(), this) == obj) {
                return obj;
             }
          }
       }
       return l1.a;
    }
}
