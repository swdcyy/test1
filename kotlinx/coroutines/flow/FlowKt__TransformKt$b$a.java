package kotlinx.coroutines.flow.FlowKt__TransformKt$b$a;
import jtd.e;
import kotlin.jvm.internal.Ref$IntRef;
import java.lang.Object;
import asd.c;
import trd.i0;
import csd.b;
import qrd.l1;
import java.lang.ArithmeticException;
import java.lang.String;

public final class FlowKt__TransformKt$b$a implements e	// class@001a8a
{
    public final e b;
    public final Ref$IntRef c;

    public void FlowKt__TransformKt$b$a(e p0,Ref$IntRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__TransformKt$b$a tb = this.b;
       FlowKt__TransformKt$b$a tc = this.c;
       Ref$IntRef element = tc.element;
       tc.element = element + 1;
       if (element < null) {
          throw new ArithmeticException("Index overflow has happened");
       }
       p0 = tb.emit(new i0(element, p0), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
