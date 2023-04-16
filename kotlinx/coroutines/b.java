package kotlinx.coroutines.b;
import kotlin.coroutines.CoroutineContext;
import msd.p;
import java.lang.Object;
import java.lang.Thread;
import asd.d;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import ftd.f3;
import ftd.g1;
import ftd.r1;
import ftd.k0;
import ftd.f0;
import ftd.d;
import kotlinx.coroutines.CoroutineStart;
import ftd.a;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.a;

public final class b	// class@001ce7
{

    public static final Object a(CoroutineContext p0,p p1){
       g1 og1;
       Thread thread = Thread.currentThread();
       d uod = p0.get(d.b0);
       if (uod == null) {
          og1 = f3.b.b();
          p0 = f0.d(r1.b, p0.plus(og1));
       }else {
          d uod2 = null;
          if (!uod instanceof g1) {
             uod = uod2;
          }
          if (uod != null) {
             if (uod.o0()) {
                uod2 = uod;
             }
             if (uod2 != null) {
                og1 = uod2;
             label_003a :
                p0 = f0.d(r1.b, p0);
             }
          }
          og1 = f3.b.a();
          goto label_003a ;
       }
       d uod1 = new d(p0, thread, og1);
       uod1.q1(CoroutineStart.DEFAULT, uod1, p1);
       return uod1.s1();
    }
    public static Object b(CoroutineContext p0,p p1,int p2,Object p3){
       EmptyCoroutineContext iNSTANCE;
       if (p2 & 0x01) {
          iNSTANCE = EmptyCoroutineContext.INSTANCE;
       }
       return a.g(iNSTANCE, p1);
    }
}
