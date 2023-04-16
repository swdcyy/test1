package kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import ftd.k0;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import htd.y;
import htd.l;
import htd.n;
import ftd.f0;
import ktd.f;
import kotlinx.coroutines.CoroutineStart;
import java.lang.Object;
import ftd.a;
import asd.c;
import ktd.d;
import ltd.a0;
import mtd.b;
import csd.b;
import dsd.e;
import msd.q;
import jtd.d;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1;

public final class FlowCoroutineKt	// class@001b29
{

    public static final y a(k0 p0,CoroutineContext p1,int p2,p p3){
       f uof = new f(f0.d(p0, p1), n.a(p2));
       uof.q1(CoroutineStart.ATOMIC, uof, p3);
       return uof;
    }
    public static y b(k0 p0,CoroutineContext p1,int p2,p p3,int p4,Object p5){
       if (p4 & 0x02) {
          p2 = 0;
       }
       return FlowCoroutineKt.a(p0, p1, p2, p3);
    }
    public static final Object c(p p0,c p1){
       p0 = b.f(new d(p1.getContext(), p1), new d(p1.getContext(), p1), p0);
       if (p0 == b.h()) {
          e.c(p1);
       }
       return p0;
    }
    public static final d d(q p0){
       return new FlowCoroutineKt$scopedFlow$$inlined$unsafeFlow$1(p0);
    }
}
