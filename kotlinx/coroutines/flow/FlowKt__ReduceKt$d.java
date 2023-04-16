package kotlinx.coroutines.flow.FlowKt__ReduceKt$d;
import jtd.e;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import asd.c;
import qrd.l1;
import java.lang.IllegalStateException;
import java.lang.String;

public final class FlowKt__ReduceKt$d implements e	// class@001a74
{
    public final Ref$ObjectRef b;

    public void FlowKt__ReduceKt$d(Ref$ObjectRef p0){
       this.b = p0;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__ReduceKt$d tb = this.b;
       if (tb.element != null) {
          throw new IllegalStateException("Expected only one element".toString());
       }
       tb.element = p0;
       return l1.a;
    }
}
