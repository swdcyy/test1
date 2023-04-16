package kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt$none$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import htd.y;
import htd.o;

public final class ChannelsKt__Channels_commonKt$none$1 extends ContinuationImpl	// class@001984
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object result;

    public void ChannelsKt__Channels_commonKt$none$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return o.z1(null, this);
    }
}
