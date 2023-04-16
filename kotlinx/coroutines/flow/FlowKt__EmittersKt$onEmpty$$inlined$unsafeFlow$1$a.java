package kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$a;
import jtd.e;
import kotlin.jvm.internal.Ref$BooleanRef;
import java.lang.Object;
import asd.c;
import csd.b;
import qrd.l1;

public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$a implements e	// class@001a04
{
    public final e b;
    public final Ref$BooleanRef c;

    public void FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$a(e p0,Ref$BooleanRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object emit(Object p0,c p1){
       this.c.element = false;
       p0 = this.b.emit(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
