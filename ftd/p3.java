package ftd.p3;
import kotlin.coroutines.CoroutineContext;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.util.concurrent.CancellationException;
import asd.c;
import java.lang.Object;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.t0;
import kotlinx.coroutines.CoroutineDispatcher;
import qrd.l1;
import ftd.o3;
import ftd.u0;
import csd.b;
import dsd.e;

public final class p3	// class@00166b
{

    public static final void a(CoroutineContext p0){
       z1 oz1 = p0.get(z1.p0);
       if (oz1 == null || oz1.E()) {
          return;
       }
       throw oz1.O();
    }
    public static final Object b(c p0){
       l1 ol1;
       CoroutineContext context = p0.getContext();
       p3.a(context);
       c uoc = IntrinsicsKt__IntrinsicsJvmKt.d(p0);
       if (!uoc instanceof t0) {
          uoc = null;
       }
       if (uoc != null) {
          if (uoc.h.x(context)) {
             uoc.m(context, l1.a);
          }else {
             o3 oo3 = new o3();
             ol1 = l1.a;
             uoc.m(context.plus(oo3), ol1);
             if (oo3.b != null) {
                if (u0.f(uoc)) {
                   ol1 = b.h();
                }
             }
          }
          ol1 = b.h();
       }else {
          ol1 = l1.a;
       }
       if (ol1 == b.h()) {
          e.c(p0);
       }
       if (ol1 == b.h()) {
          return ol1;
       }else {
          return l1.a;
       }
    }
}
