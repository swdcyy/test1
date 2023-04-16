package ftd.l0;
import kotlin.coroutines.CoroutineContext;
import ftd.k0;
import ltd.i;
import ftd.z1;
import kotlin.coroutines.CoroutineContext$b;
import kotlin.coroutines.CoroutineContext$a;
import java.lang.Object;
import ftd.w;
import ftd.c2;
import ftd.c3;
import ftd.j2;
import ftd.z0;
import java.lang.String;
import java.lang.Throwable;
import java.util.concurrent.CancellationException;
import ftd.l1;
import java.lang.StringBuilder;
import java.lang.IllegalStateException;
import msd.p;
import asd.c;
import ltd.a0;
import mtd.b;
import csd.b;
import dsd.e;
import nsd.c0;

public final class l0	// class@000ea4
{

    public static final k0 a(CoroutineContext p0){
       if (p0.get(z1.p0) != null) {
       }else {
          p0 = p0.plus(c2.d(null, 1, null));
       }
       return new i(p0);
    }
    public static final k0 b(){
       return new i(c3.c(null, 1, null).plus(z0.g()));
    }
    public static final void c(k0 p0,String p1,Throwable p2){
       l0.d(p0, l1.a(p1, p2));
    }
    public static final void d(k0 p0,CancellationException p1){
       z1 oz1 = p0.getCoroutineContext().get(z1.p0);
       if (oz1 == null) {
          throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: "+p0.toString());
       }
       oz1.b(p1);
       return;
    }
    public static void e(k0 p0,String p1,Throwable p2,int p3,Object p4){
       if (p3 & 0x02) {
          p2 = null;
       }
       l0.c(p0, p1, p2);
       return;
    }
    public static void f(k0 p0,CancellationException p1,int p2,Object p3){
       if (p2 & 0x01) {
          p1 = null;
       }
       l0.d(p0, p1);
       return;
    }
    public static final Object g(p p0,c p1){
       p0 = b.f(new a0(p1.getContext(), p1), new a0(p1.getContext(), p1), p0);
       if (p0 == b.h()) {
          e.c(p1);
       }
       return p0;
    }
    public static final Object h(c p0){
       return p0.getContext();
    }
    public static final Object i(c p0){
       c0.e(3);
       throw null;
    }
    public static final void j(k0 p0){
       c2.B(p0.getCoroutineContext());
    }
    public static final boolean k(k0 p0){
       z1 oz1 = p0.getCoroutineContext().get(z1.p0);
       boolean b = (oz1 != null)? oz1.E(): true;
       return b;
    }
    public static void l(k0 p0){
    }
    public static final k0 m(k0 p0,CoroutineContext p1){
       return new i(p0.getCoroutineContext().plus(p1));
    }
}
