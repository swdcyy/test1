package kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__LimitKt;

public final class FlowKt__LimitKt$emitAbort$1 extends ContinuationImpl	// class@001a23
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;

    public void FlowKt__LimitKt$emitAbort$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return FlowKt__LimitKt.c(null, null, this);
    }
}
