package kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import htd.c0;
import kotlinx.coroutines.channels.TickerChannelsKt;

public final class TickerChannelsKt$fixedDelayTicker$1 extends ContinuationImpl	// class@00199f
{
    public long J$0;
    public long J$1;
    public Object L$0;
    public int label;
    public Object result;

    public void TickerChannelsKt$fixedDelayTicker$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return TickerChannelsKt.a(0, 0, null, this);
    }
}
