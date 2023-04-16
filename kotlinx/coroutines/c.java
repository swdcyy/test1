package kotlinx.coroutines.c;
import asd.c;
import java.lang.Object;
import qrd.l1;
import ftd.l;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.CoroutineContext;
import ftd.s0;
import ftd.k;
import csd.b;
import dsd.e;
import asd.d;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import ftd.q0;
import btd.d;
import btd.d$a;
import usd.q;

public final class c	// class@001ce8
{

    public static final Object a(long p0,c p1){
       if (p0 - null <= 0) {
          return l1.a;
       }
       l ol = new l(IntrinsicsKt__IntrinsicsJvmKt.d(p1), 1);
       ol.u();
       c.c(ol.getContext()).g(p0, ol);
       Object obj = ol.r();
       if (obj == b.h()) {
          e.c(p1);
       }
       return obj;
    }
    public static final Object b(double p0,c p1){
       Object obj = c.a(c.d(p0), p1);
       if (obj == b.h()) {
          return obj;
       }
       return l1.a;
    }
    public static final s0 c(CoroutineContext p0){
       CoroutineContext$a uoa = p0.get(d.b0);
       if (!uoa instanceof s0) {
          uoa = null;
       }
       if (uoa == null) {
          uoa = q0.a();
       }
       return uoa;
    }
    public static final long d(double p0){
       long l = (d.c(p0, d.e.getZERO()) > 0)? q.o(d.y0(p0), 1): 0;
       return l;
    }
}
