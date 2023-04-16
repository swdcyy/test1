package kotlinx.coroutines.channels.ChannelsKt__ChannelsKt;
import htd.c0;
import java.lang.Object;
import kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1;
import asd.c;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import kotlinx.coroutines.a;

public final class ChannelsKt__ChannelsKt	// class@00193d
{

    public static final void a(c0 p0,Object p1){
       if (p0.offer(p1)) {
          return;
       }
       a.h(null, new ChannelsKt__ChannelsKt$sendBlocking$1(p0, p1, null), 1, null);
       return;
    }
}
