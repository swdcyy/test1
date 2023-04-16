package kotlinx.coroutines.sync.MutexKt;
import ltd.e0;
import java.lang.String;
import ptd.b;
import java.lang.Object;
import ptd.c;
import ptd.d;
import msd.a;
import asd.c;
import kotlinx.coroutines.sync.MutexKt$withLock$1;
import csd.b;
import qrd.j0;
import java.lang.IllegalStateException;
import nsd.c0;

public final class MutexKt	// class@001b4b
{
    public static final e0 a;
    public static final e0 b;
    public static final e0 c;
    public static final e0 d;
    public static final e0 e;
    public static final e0 f;
    public static final b g;
    public static final b h;

    static {
       MutexKt.a = new e0("LOCK_FAIL");
       MutexKt.b = new e0("ENQUEUE_FAIL");
       MutexKt.c = new e0("UNLOCK_FAIL");
       MutexKt.d = new e0("SELECT_SUCCESS");
       e0 uoe0 = new e0("LOCKED");
       MutexKt.e = uoe0;
       e0 uoe01 = new e0("UNLOCKED");
       MutexKt.f = uoe01;
       MutexKt.g = new b(uoe0);
       MutexKt.h = new b(uoe01);
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
    public static final c f(boolean p0){
       return new d(p0);
    }
    public static c g(boolean p0,int p1,Object p2){
       if (p1 & 0x01) {
          p0 = false;
       }
       return MutexKt.f(p0);
    }
    public static void h(){
    }
    public static void i(){
    }
    public static void j(){
    }
    public static final Object k(c p0,Object p1,a p2,c p3){
       MutexKt$withLock$1 owithLock$1;
       MutexKt$withLock$1 owithLock$11;
       MutexKt$withLock$1 l$0;
       if (p3 instanceof MutexKt$withLock$1) {
          owithLock$1 = p3;
          MutexKt$withLock$1 label = owithLock$1.label;
          int i = Integer.MIN_VALUE;
          if (label & i) {
             owithLock$1.label = label - i;
          label_0018 :
             MutexKt$withLock$1 result = owithLock$1.result;
             Object obj = b.h();
             MutexKt$withLock$1 label1 = owithLock$1.label;
             if (label1 != null) {
                if (label1 == 1) {
                   owithLock$11 = owithLock$1.L$2;
                   p1 = owithLock$1.L$1;
                   l$0 = owithLock$1.L$0;
                   j0.n(result);
                }else {
                   throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                }
             }else {
                j0.n(result);
                owithLock$1.L$0 = p0;
                owithLock$1.L$1 = p1;
                owithLock$1.L$2 = p2;
                owithLock$1.label = 1;
                if (p0.e(p1, owithLock$1) == obj) {
                   return obj;
                }
             }
             c0.d(1);
             l$0.f(p1);
             c0.c(1);
             return owithLock$11.invoke();
          }
       }
       owithLock$1 = new MutexKt$withLock$1(p3);
       goto label_0018 ;
    }
    public static final Object l(c p0,Object p1,a p2,c p3){
       c0.e(0);
       p0.e(p1, p3);
       c0.e(2);
       c0.e(1);
       c0.d(1);
       p0.f(p1);
       c0.c(1);
       return p2.invoke();
    }
    public static Object m(c p0,Object p1,a p2,c p3,int p4,Object p5){
       if (p4 & 1) {
          p1 = null;
       }
       c0.e(0);
       p0.e(p1, p3);
       c0.e(2);
       c0.e(1);
       c0.d(1);
       p0.f(p1);
       c0.c(1);
       return p2.invoke();
    }
}
