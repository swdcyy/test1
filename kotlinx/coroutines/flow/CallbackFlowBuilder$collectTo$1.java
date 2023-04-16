package kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import asd.c;
import java.lang.Object;
import htd.w;

public final class CallbackFlowBuilder$collectTo$1 extends ContinuationImpl	// class@0019b3
{
    public Object L$0;
    public Object L$1;
    public int label;
    public Object result;
    public final CallbackFlowBuilder this$0;

    public void CallbackFlowBuilder$collectTo$1(CallbackFlowBuilder p0,c p1){
       this.this$0 = p0;
       super(p1);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return this.this$0.f(null, this);
    }
}
