package kotlinx.coroutines.flow.FlowKt__TransformKt$a$a;
import jtd.e;
import kotlinx.coroutines.flow.FlowKt__TransformKt$a;
import java.lang.Object;
import asd.c;
import csd.b;
import qrd.l1;

public final class FlowKt__TransformKt$a$a implements e	// class@001a88
{
    public final e b;
    public final FlowKt__TransformKt$a c;

    public void FlowKt__TransformKt$a$a(e p0,FlowKt__TransformKt$a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__TransformKt$a$a tb = this.b;
       if (p0 != null) {
          p0 = tb.emit(p0, p1);
          if (p0 == b.h()) {
             return p0;
          }else {
             p0 = l1.a;
          }
       }else {
          p0 = l1.a;
       }
       return p0;
    }
}
