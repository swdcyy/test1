package kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1;
import jtd.d;
import msd.p;
import java.lang.Object;
import jtd.e;
import asd.c;
import csd.b;
import qrd.l1;
import nsd.c0;
import kotlinx.coroutines.flow.internal.SafeCollector_commonKt$unsafeFlow$1$collect$1;

public final class SafeCollector_commonKt$unsafeFlow$1 implements d	// class@001b30
{
    public final p a;

    public void SafeCollector_commonKt$unsafeFlow$1(p p0){
       this.a = p0;
       super();
    }
    public Object b(e p0,c p1){
       p0 = this.a.invoke(p0, p1);
       if (p0 == b.h()) {
          return p0;
       }
       return l1.a;
    }
    public Object c(e p0,c p1){
       c0.e(4);
       SafeCollector_commonKt$unsafeFlow$1$collect$1 ounsafeFlow$ = new SafeCollector_commonKt$unsafeFlow$1$collect$1(this, p1);
       c0.e(5);
       this.a.invoke(p0, p1);
       return l1.a;
    }
}
