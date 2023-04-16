package kotlinx.coroutines.flow.FlowKt__ReduceKt$a;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import asd.c;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import ktd.i;

public final class FlowKt__ReduceKt$a implements e	// class@001a71
{
    public final Ref$ObjectRef b;

    public void FlowKt__ReduceKt$a(Ref$ObjectRef p0){
       this.b = p0;
       super();
    }
    public Object emit(Object p0,c p1){
       p1.element = p0;
       throw new AbortFlowException(i.b);
    }
}
