package kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class ChannelFlow$collectToFun$1 extends SuspendLambda implements p	// class@001b06
{
    public Object L$0;
    public int label;
    public w p$0;
    public final ChannelFlow this$0;

    public void ChannelFlow$collectToFun$1(ChannelFlow p0,c p1){
       this.this$0 = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelFlow$collectToFun$1 uocollectToF = new ChannelFlow$collectToFun$1(this.this$0, p1);
       uocollectToF.p$0 = p0;
       return uocollectToF;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelFlow$collectToFun$1 tlabel = this.label;
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
          if (this.this$0.f(p0, this) == obj) {
             return obj;
          }
       }
       return l1.a;
    }
}
