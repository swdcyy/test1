package kotlinx.coroutines.flow.FlowKt__EmittersKt$invokeSafely$1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import asd.c;
import java.lang.Object;
import jtd.e;
import msd.q;
import java.lang.Throwable;
import kotlinx.coroutines.flow.FlowKt__EmittersKt;

public final class FlowKt__EmittersKt$invokeSafely$1 extends ContinuationImpl	// class@0019ff
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;

    public void FlowKt__EmittersKt$invokeSafely$1(c p0){
       super(p0);
    }
    public final Object invokeSuspend(Object p0){
       this.result = p0;
       this.label = this.label | Integer.MIN_VALUE;
       return FlowKt__EmittersKt.a(null, null, null, this);
    }
}
