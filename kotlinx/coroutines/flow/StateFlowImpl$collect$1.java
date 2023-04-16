package kotlinx.coroutines.flow.StateFlowImpl$collect$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import asd.c;
import java.lang.Object;
import jtd.e;

public final class StateFlowImpl$collect$1 extends ContinuationImpl	// class@001b02
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public Object result;
    public final StateFlowImpl this$0;

    public void StateFlowImpl$collect$1(StateFlowImpl p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.b(null, this);
    }
}
