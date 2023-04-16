package kotlinx.coroutines.flow.FlowKt__TransformKt$b;
import jtd.d;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.FlowKt__TransformKt$b$a;
import csd.b;
import qrd.l1;

public final class FlowKt__TransformKt$b implements d	// class@001a8b
{
    public final d a;

    public void FlowKt__TransformKt$b(d p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = 0;
       p0 = this.a.b(new FlowKt__TransformKt$b$a(p0, intRef), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
