package ftd.v0;
import ltd.a0;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import asd.c;
import java.lang.Object;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import ftd.y;
import ftd.u0;
import csd.b;
import kotlinx.coroutines.JobSupport;
import ftd.g2;
import ftd.x;
import java.lang.IllegalStateException;

public final class v0 extends a0	// class@001680
{
    public int _decision;
    public static final AtomicIntegerFieldUpdater f;

    static {
       AtomicIntegerFieldUpdater uAtomicInteg = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_decision");
       uAtomicInteg.f = uAtomicInteg;
    }
    public void v0(CoroutineContext p0,c p1){
       super(p0, p1);
       this._decision = 0;
    }
    public void Y(Object p0){
       this.k1(p0);
    }
    public void k1(Object p0){
       if (this.u1()) {
          return;
       }
       u0.e(IntrinsicsKt__IntrinsicsJvmKt.d(this.e), y.a(p0, this.e));
       return;
    }
    public final Object t1(){
       if (this.v1()) {
          return b.h();
       }
       Object obj = g2.i(this.y0());
       if (!obj instanceof x) {
          return obj;
       }
       throw obj.a;
    }
    public final boolean u1(){
       boolean b;
       while (true) {
          v0 t_decision = this._decision;
          b = false;
          if (t_decision != null) {
             if (t_decision != true) {
                throw new IllegalStateException("Already resumed".toString());
             }
             break ;
          }else {
             boolean b1 = t_decision.f.compareAndSet(this, b, 2);
             if (b1) {
                return true;
             }
             continue ;
          }
       }
       return b;
    }
    public final boolean v1(){
       boolean b;
       while (true) {
          v0 t_decision = this._decision;
          b = false;
          if (t_decision != null) {
             if (t_decision != 2) {
                throw new IllegalStateException("Already suspended".toString());
             }
             break ;
          }else {
             int i = 1;
             boolean b1 = t_decision.f.compareAndSet(this, b, i);
             if (b1) {
                return i;
             }
             continue ;
          }
       }
       return b;
    }
}
