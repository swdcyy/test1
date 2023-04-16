package kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$a;
import jtd.e;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import java.lang.Object;
import asd.c;
import csd.b;
import qrd.l1;
import kotlinx.coroutines.flow.FlowKt__LimitKt;

public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1$a implements e	// class@001a25
{
    public final e b;
    public final Ref$IntRef c;
    public final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 d;

    public void FlowKt__LimitKt$take$$inlined$unsafeFlow$1$a(e p0,Ref$IntRef p1,FlowKt__LimitKt$take$$inlined$unsafeFlow$1 p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object emit(Object p0,c p1){
       FlowKt__LimitKt$take$$inlined$unsafeFlow$1$a tc = this.c;
       int i = tc.element + 1;
       tc.element = i;
       if (i < this.d.b) {
          p0 = this.b.emit(p0, p1);
          if (p0 == b.h()) {
             return p0;
          }else {
             p0 = l1.a;
          }
       }else {
          p0 = FlowKt__LimitKt.c(this.b, p0, p1);
          if (p0 == b.h()) {
             return p0;
          }else {
             p0 = l1.a;
          }
       }
       return p0;
    }
}
