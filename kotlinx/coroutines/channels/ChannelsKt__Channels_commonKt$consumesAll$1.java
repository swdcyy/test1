package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$consumesAll$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import htd.y;
import java.lang.Object;
import java.lang.Throwable;
import qrd.l1;
import htd.o;
import qrd.i;

public final class ChannelsKt__Channels_commonKt$consumesAll$1 extends Lambda implements l	// class@00194b
{
    public final y[] $channels;

    public void ChannelsKt__Channels_commonKt$consumesAll$1(y[] p0){
       this.$channels = p0;
       super(1);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(Throwable p0){
       ChannelsKt__Channels_commonKt$consumesAll$1 t$channels = this.$channels;
       int len = t$channels.length;
       int i = 0;
       while (i < len) {
          o.r(t$channels[i], p0);
          i = i + 1;
       }
       if (!null) {
          return;
       }
       throw null;
    }
}
