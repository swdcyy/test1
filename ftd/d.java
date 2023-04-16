package ftd.d;
import ftd.a;
import kotlin.coroutines.CoroutineContext;
import java.lang.Thread;
import ftd.g1;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.concurrent.locks.LockSupport;
import ftd.j3;
import ftd.k3;
import kotlinx.coroutines.JobSupport;
import ftd.g2;
import ftd.x;
import java.lang.InterruptedException;
import java.lang.Throwable;

public final class d extends a	// class@00163b
{
    public final Thread e;
    public final g1 f;

    public void d(CoroutineContext p0,Thread p1,g1 p2){
       super(p0, true);
       this.e = p1;
       this.f = p2;
    }
    public boolean E0(){
       return true;
    }
    public void Y(Object p0){
       if (a.g(Thread.currentThread(), this.e) ^ 0x01) {
          LockSupport.unpark(this.e);
       }
       return;
    }
    public final Object s1(){
       InterruptedException obj1;
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.d();
       }
       d tf = this.f;
       int i = 1;
       Object obj = null;
       if (tf != null) {
          g1.h0(tf, false, i, obj);
       }
       while (true) {
          if (!Thread.interrupted()) {
             tf = this.f;
             long l = (tf != null)? tf.l0(): Long.MAX_VALUE;
             if (this.c()) {
                tf = this.f;
                if (tf != null) {
                   g1.T(tf, false, i, obj);
                }
                oj3 = k3.b();
                if (oj3 != null) {
                   oj3.f();
                }
                obj1 = g2.i(this.y0());
                if (obj1 instanceof x) {
                   obj = obj1;
                }
                if (obj == null) {
                   break ;
                }else {
                   throw obj.a;
                }
             }else {
                oj3 = k3.b();
                if (oj3 != null) {
                   oj3.c(this, l);
                }else {
                   LockSupport.parkNanos(this, l);
                }
             }
          }else {
             obj1 = new InterruptedException();
             this.b0(obj1);
             throw obj1;
          }
       }
       return obj1;
    }
}
