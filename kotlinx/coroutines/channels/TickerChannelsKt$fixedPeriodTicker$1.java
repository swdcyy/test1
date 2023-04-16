package kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import htd.c0;
import kotlinx.coroutines.channels.TickerChannelsKt;

public final class TickerChannelsKt$fixedPeriodTicker$1 extends ContinuationImpl	// class@0019a0
{
    public long J$0;
    public long J$1;
    public long J$2;
    public long J$3;
    public long J$4;
    public long J$5;
    public long J$6;
    public Object L$0;
    public int label;
    public Object result;

    public void TickerChannelsKt$fixedPeriodTicker$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return TickerChannelsKt.b(0, 0, null, this);
    }
}
