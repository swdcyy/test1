package ftd.u0;
import ltd.e0;
import java.lang.String;
import ftd.t0;
import java.lang.Object;
import msd.a;
import ftd.f3;
import ftd.g1;
import ftd.w0;
import nsd.c0;
import java.lang.Throwable;
import asd.c;
import ftd.y;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import java.lang.Runnable;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import qrd.j0;
import kotlinx.coroutines.internal.ThreadContextKt;
import qrd.l1;

public final class u0	// class@00167d
{
    public static final e0 a;
    public static final e0 b;

    static {
       u0.a = new e0("UNDEFINED");
       u0.b = new e0("REUSABLE_CLAIMED");
    }
    public static void a(){
    }
    public static void b(){
    }
    public static final boolean c(t0 p0,Object p1,int p2,boolean p3,a p4){
       g1 og1 = f3.b.b();
       boolean b = false;
       if (p3 && og1.k0()) {
          return b;
       }
       if (og1.j0()) {
          p0.e = p1;
          p0.d = p2;
          og1.b0(p0);
          b = true;
       }else {
          og1.g0(true);
          p4.invoke();
          do {
          } while (!og1.n0());
          c0.d(true);
          og1.A(true);
          c0.c(true);
       }
       return b;
    }
    public static boolean d(t0 p0,Object p1,int p2,boolean p3,a p4,int p5,Object p6){
       boolean b = false;
       if (p5 & 0x04) {
          p3 = false;
       }
       g1 og1 = f3.b.b();
       if (p3 && og1.k0()) {
          return b;
       }else if(og1.j0()){
          p0.e = p1;
          p0.d = p2;
          og1.b0(p0);
          b = true;
       }else {
          og1.g0(true);
          p4.invoke();
          do {
          } while (!og1.n0());
          c0.d(true);
          og1.A(true);
          c0.c(true);
       }
       return b;
    }
    public static final void e(c p0,Object p1){
       CoroutineContext uCoroutineCo;
       if (p0 instanceof t0) {
          z1 obj = y.b(p1);
          if (p0.h.x(p0.getContext())) {
             p0.e = obj;
             p0.d = 1;
             p0.h.u(p0.getContext(), p0);
          }else {
             g1 og1 = f3.b.b();
             if (og1.j0()) {
                p0.e = obj;
                p0.d = 1;
                og1.b0(p0);
             }else {
                og1.g0(1);
                obj = p0.getContext().get(z1.p0);
                if (obj != null && !obj.E()) {
                   p0.resumeWith(Result.constructor-impl(j0.a(obj.O())));
                   uCoroutineCo = 1;
                }else {
                   uCoroutineCo = null;
                }
                if (!uCoroutineCo) {
                   uCoroutineCo = p0.getContext();
                   p0.i.resumeWith(p1);
                   ThreadContextKt.a(uCoroutineCo, ThreadContextKt.c(uCoroutineCo, p0.g));
                }
                do {
                } while (!og1.n0());
                og1.A(1);
             }
          }
       }else {
          p0.resumeWith(p1);
       }
       return;
    }
    public static final boolean f(t0 p0){
       l1 a = l1.a;
       g1 og1 = f3.b.b();
       boolean b = false;
       if (og1.k0()) {
       }else if(og1.j0()){
          p0.e = a;
          p0.d = 1;
          og1.b0(p0);
          b = true;
       }else {
          og1.g0(1);
          p0.run();
          do {
          } while (!og1.n0());
          og1.A(1);
       }
       return b;
    }
}
