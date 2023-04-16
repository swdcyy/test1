package kotlinx.coroutines.flow.internal.CombineKt$asFairChannel$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import jtd.d;
import asd.c;
import java.lang.Object;
import htd.w;
import qrd.l1;
import csd.b;
import htd.m;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import htd.c0;
import kotlinx.coroutines.flow.internal.CombineKt$asFairChannel$1$a;
import jtd.e;
import kotlin.TypeCastException;

public final class CombineKt$asFairChannel$1 extends SuspendLambda implements p	// class@001b19
{
    public final d $flow;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public w p$;

    public void CombineKt$asFairChannel$1(d p0,c p1){
       this.$flow = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       CombineKt$asFairChannel$1 uoasFairChan = new CombineKt$asFairChannel$1(this.$flow, p1);
       uoasFairChan.p$ = p0;
       return uoasFairChan;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       CombineKt$asFairChannel$1 tlabel = this.label;
       if (tlabel != null) {
          if (tlabel == 1) {
             j0.n(p0);
          }else {
             throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
          }
       }else {
          j0.n(p0);
          p0 = this.p$;
          c0 channel = p0.getChannel();
          if (channel != null) {
             CombineKt$asFairChannel$1 t$flow = this.$flow;
             this.L$0 = p0;
             this.L$1 = channel;
             this.L$2 = t$flow;
             this.label = 1;
             if (t$flow.b(new CombineKt$asFairChannel$1$a(channel), this) == obj) {
                return obj;
             }
          }else {
             throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelCoroutine<kotlin.Any>");
          }
       }
       return l1.a;
    }
}
