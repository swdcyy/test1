package kotlinx.coroutines.flow.FlowKt__CountKt$count$3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import jtd.d;
import msd.p;
import jtd.f;

public final class FlowKt__CountKt$count$3 extends ContinuationImpl	// class@0019dd
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public Object result;

    public void FlowKt__CountKt$count$3(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return f.Y(null, null, this);
    }
}