package kotlinx.coroutines.flow.AbstractFlow$collect$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractFlow;
import asd.c;
import java.lang.Object;
import jtd.e;

public final class AbstractFlow$collect$1 extends ContinuationImpl	// class@0019b1
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final AbstractFlow this$0;

    public void AbstractFlow$collect$1(AbstractFlow p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.b(null, this);
    }
}
