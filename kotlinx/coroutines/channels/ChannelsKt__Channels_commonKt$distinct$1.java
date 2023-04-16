package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$distinct$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import asd.c;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import java.lang.String;

public final class ChannelsKt__Channels_commonKt$distinct$1 extends SuspendLambda implements p	// class@00194e
{
    public int label;
    public Object p$0;

    public void ChannelsKt__Channels_commonKt$distinct$1(c p0){
       super(2, p0);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$distinct$1 uodistinct$1 = new ChannelsKt__Channels_commonKt$distinct$1(p1);
       uodistinct$1.p$0 = p0;
       return uodistinct$1;
    }
    public final Object invoke(Object p0,Object p1){
       return this.create(p0, p1).invokeSuspend(l1.a);
    }
    public final Object invokeSuspend(Object p0){
       b.h();
       if (this.label != null) {
          throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
       }
       j0.n(p0);
       return this.p$0;
    }
}
