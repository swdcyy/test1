package kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import jtd.d;
import msd.q;
import jtd.f;

public final class FlowKt__ReduceKt$fold$1 extends ContinuationImpl	// class@001a81
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public Object result;

    public void FlowKt__ReduceKt$fold$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return f.P0(null, null, null, this);
    }
}