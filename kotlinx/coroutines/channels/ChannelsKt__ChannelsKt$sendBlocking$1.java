package kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.c0;
import java.lang.Object;
import asd.c;
import ftd.k0;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class ChannelsKt__ChannelsKt$sendBlocking$1 extends SuspendLambda implements p	// class@00193c
{
    public final Object $element;
    public final c0 $this_sendBlocking;
    public Object L$0;
    public int label;
    public k0 p$;

    public void ChannelsKt__ChannelsKt$sendBlocking$1(c0 p0,Object p1,c p2){
       this.$this_sendBlocking = p0;
       this.$element = p1;
       super(2, p2);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__ChannelsKt$sendBlocking$1 osendBlockin = new ChannelsKt__ChannelsKt$sendBlocking$1(this.$this_sendBlocking, this.$element, p1);
       osendBlockin.p$ = p0;
       return osendBlockin;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelsKt__ChannelsKt$sendBlocking$1 tlabel = this.label;
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
          if (this.$this_sendBlocking.l(this.$element, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
