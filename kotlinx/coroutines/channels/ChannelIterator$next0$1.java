package kotlinx.coroutines.channels.ChannelIterator$next0$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ChannelIterator;
import asd.c;
import java.lang.Object;
import kotlinx.coroutines.channels.ChannelIterator$DefaultImpls;

public final class ChannelIterator$next0$1 extends ContinuationImpl	// class@00193a
{
    public Object L$0;
    public int label;
    public Object result;
    public final ChannelIterator this$0;

    public void ChannelIterator$next0$1(ChannelIterator p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return ChannelIterator$DefaultImpls.a(null, this);
    }
}
