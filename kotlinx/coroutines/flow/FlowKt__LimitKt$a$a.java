package kotlinx.coroutines.flow.FlowKt__LimitKt$a$a;
import jtd.e;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$a;
import java.lang.Object;
import asd.c;
import csd.b;
import qrd.l1;

public final class FlowKt__LimitKt$a$a implements e	// class@001a1e
{
    public final e b;
    public final Ref$IntRef c;
    public final FlowKt__LimitKt$a d;

    public void FlowKt__LimitKt$a$a(e p0,Ref$IntRef p1,FlowKt__LimitKt$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__LimitKt$a$a tc = this.c;
       Ref$IntRef element = tc.element;
       if (element >= this.d.b) {
          p0 = this.b.emit(p0, p1);
          if (p0 == b.h()) {
             return p0;
          }
       }else {
          tc.element = element + 1;
       }
       return l1.a;
    }
}
