package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$requireNoNulls$1;
import msd.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import htd.y;
import asd.c;
import java.lang.Object;
import qrd.l1;
import csd.b;
import qrd.j0;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;

public final class ChannelsKt__Channels_commonKt$requireNoNulls$1 extends SuspendLambda implements p	// class@001989
{
    public final y $this_requireNoNulls;
    public int label;
    public Object p$0;

    public void ChannelsKt__Channels_commonKt$requireNoNulls$1(y p0,c p1){
       this.$this_requireNoNulls = p0;
       super(2, p1);
    }
    public final c create(Object p0,c p1){
       ChannelsKt__Channels_commonKt$requireNoNulls$1 orequireNoNu = new ChannelsKt__Channels_commonKt$requireNoNulls$1(this.$this_requireNoNulls, p1);
       orequireNoNu.p$0 = p0;
       return orequireNoNu;
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
       p0 = this.p$0;
       if (p0 != null) {
          return p0;
       }
       throw new IllegalArgumentException("null element found in "+this.$this_requireNoNulls+'.');
    }
}
