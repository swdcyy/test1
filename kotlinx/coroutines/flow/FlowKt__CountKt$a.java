package kotlinx.coroutines.flow.FlowKt__CountKt$a;
import jtd.e;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import asd.c;
import qrd.l1;

public final class FlowKt__CountKt$a implements e	// class@0019d9
{
    public final Ref$IntRef b;

    public void FlowKt__CountKt$a(Ref$IntRef p0){
       this.b = p0;
       super();
    }
    public Object emit(Object p0,c p1){
       p0 = this.b;
       p0.element = p0.element + 1;
       return l1.a;
    }
}
