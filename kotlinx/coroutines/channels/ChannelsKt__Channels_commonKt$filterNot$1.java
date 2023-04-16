package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$filterNot$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;
import java.lang.Boolean;
import dsd.a;

public final class ChannelsKt__Channels_commonKt$filterNot$1 extends SuspendLambda implements p	// class@001959
{
    public final p $predicate;
    public Object L$0;
    public int label;
    public Object p$0;

    public void ChannelsKt__Channels_commonKt$filterNot$1(p p0,c p1){
       this.$predicate = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$filterNot$1 uofilterNot$ = new ChannelsKt__Channels_commonKt$filterNot$1(this.$predicate, p1);
       uofilterNot$.p$0 = p0;
       return uofilterNot$;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       Object obj = b.h();
       ChannelsKt__Channels_commonKt$filterNot$1 tlabel = this.label;
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
          p0 = this.$predicate.invoke(p0, this);
          if (p0 == obj) {
             return obj;
          }
       }
       return a.a((p0.booleanValue() ^ 1));
    }
}
