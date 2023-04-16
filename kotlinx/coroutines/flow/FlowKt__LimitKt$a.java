package kotlinx.coroutines.flow.FlowKt__LimitKt$a;
import jtd.d;
import java.lang.Object;
import jtd.e;
import asd.c;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.FlowKt__LimitKt$a$a;
import csd.b;
import qrd.l1;

public final class FlowKt__LimitKt$a implements d	// class@001a1f
{
    public final d a;
    public final int b;

    public void FlowKt__LimitKt$a(d p0,int p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public Object b(e p0,c p1){
       Ref$IntRef intRef = new Ref$IntRef();
       intRef.element = 0;
       p0 = this.a.b(new FlowKt__LimitKt$a$a(p0, intRef, this), p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
}
