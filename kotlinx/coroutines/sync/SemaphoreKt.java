package kotlinx.coroutines.sync.SemaphoreKt;
import java.lang.String;
import java.lang.Object;
import ltd.g0;
import ltd.e0;
import ptd.e;
import ptd.f;
import ptd.g;
import ftd.k;
import qrd.l1;
import ftd.k$a;
import msd.a;
import asd.c;
import kotlinx.coroutines.sync.SemaphoreKt$withPermit$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import nsd.c0;

public final class SemaphoreKt	// class@001cf5
{
    public static final int a;
    public static final e0 b;
    public static final e0 c;
    public static final e0 d;
    public static final e0 e;
    public static final int f;

    static {
       SemaphoreKt.a = g0.f("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
       SemaphoreKt.b = new e0("PERMIT");
       SemaphoreKt.c = new e0("TAKEN");
       SemaphoreKt.d = new e0("BROKEN");
       SemaphoreKt.e = new e0("CANCELLED");
       SemaphoreKt.f = g0.f("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
    }
    public static void a(){
    }
    public static void b(){
    }
    public static void c(){
    }
    public static void d(){
    }
    public static void e(){
    }
    public static final e f(int p0,int p1){
       return new f(p0, p1);
    }
    public static e g(int p0,int p1,int p2,Object p3){
       if (p2 & 0x02) {
          p1 = 0;
       }
       return SemaphoreKt.f(p0, p1);
    }
    public static void h(){
    }
    public static final g i(long p0,g p1){
       return new g(p0, p1, 0);
    }
    public static final boolean j(k p0){
       Object obj = k$a.b(p0, l1.a, null, 2, null);
       if (obj == null) {
          return false;
       }
       p0.F(obj);
       return true;
    }
    public static final Object k(e p0,a p1,c p2){
       SemaphoreKt$withPermit$1 owithPermit$;
       SemaphoreKt$withPermit$1 owithPermit$1;
       SemaphoreKt$withPermit$1 l$0;
       if (p2 instanceof SemaphoreKt$withPermit$1) {
          owithPermit$ = p2;
          SemaphoreKt$withPermit$1 label = owithPermit$.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             owithPermit$.label = label - i;
          label_0018 :
             SemaphoreKt$withPermit$1 result = owithPermit$.result;
             Object obj = b.h();
             SemaphoreKt$withPermit$1 label1 = owithPermit$.label;
             if (label1 != null) {
                if (label1 == 1) {
                   owithPermit$1 = owithPermit$.L$1;
                   l$0 = owithPermit$.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                owithPermit$.L$0 = p0;
                owithPermit$.L$1 = p1;
                owithPermit$.label = 1;
                if (p0.a(owithPermit$) == obj) {
                   return obj;
                }
             }
             c0.d(1);
             l$0.release();
             c0.c(1);
             return owithPermit$1.invoke();
          }
       }
       owithPermit$ = new SemaphoreKt$withPermit$1(p2);
       goto label_0018 ;
    }
    public static final Object l(e p0,a p1,c p2){
       c0.e(0);
       p0.a(p2);
       c0.e(2);
       c0.e(1);
       c0.d(1);
       p0.release();
       c0.c(1);
       return p1.invoke();
    }
}
