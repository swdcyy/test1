package ftd.z1$a;
import ftd.z1;
import java.util.concurrent.CancellationException;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.lang.Throwable;
import msd.p;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.CoroutineContext$a$a;
import kotlin.coroutines.CoroutineContext$b;
import msd.l;
import ftd.c1;
import kotlin.coroutines.CoroutineContext;

public final class z1$a	// class@00168d
{

    public static void a(z1 p0){
       p0.b(null);
    }
    public static void b(z1 p0,CancellationException p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       p0.b(p1);
       return;
    }
    public static boolean c(z1 p0,Throwable p1,int p2,Object p3){
       if (p3 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
       }
       if (p2 & 0x01) {
          p1 = null;
       }
       return p0.a(p1);
    }
    public static Object d(z1 p0,Object p1,p p2){
       return CoroutineContext$a$a.a(p0, p1, p2);
    }
    public static CoroutineContext$a e(z1 p0,CoroutineContext$b p1){
       return CoroutineContext$a$a.b(p0, p1);
    }
    public static c1 f(z1 p0,boolean p1,boolean p2,l p3,int p4,Object p5){
       if (p5 != null) {
          throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
       }
       if (p4 & 0x01) {
          p1 = false;
       }
       if (p4 & 0x02) {
          p2 = true;
       }
       return p0.L(p1, p2, p3);
    }
    public static CoroutineContext g(z1 p0,CoroutineContext$b p1){
       return CoroutineContext$a$a.c(p0, p1);
    }
    public static z1 h(z1 p0,z1 p1){
       return p1;
    }
    public static CoroutineContext i(z1 p0,CoroutineContext p1){
       return CoroutineContext$a$a.d(p0, p1);
    }
}
