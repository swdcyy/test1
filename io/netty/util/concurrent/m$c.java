package io.netty.util.concurrent.m$c;
import java.lang.Runnable;
import io.netty.util.concurrent.m;
import java.lang.Object;
import java.lang.Thread;
import java.util.Objects;
import yqd.n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.StringBuilder;
import java.lang.String;
import yqd.e;
import java.lang.Class;
import ard.b;
import java.util.concurrent.Semaphore;
import java.util.Queue;
import io.netty.util.concurrent.l;
import java.lang.Throwable;

public class m$c implements Runnable	// class@001113
{
    public final m b;

    public void m$c(m p0){
       this.b = p0;
       super();
    }
    public void run(){
       AtomicIntegerFieldUpdater w;
       int i2;
       String str = "An event executor terminated with non-empty task queue \(";
       this.b.g = Thread.currentThread();
       if (this.b.j != null) {
          this.b.g.interrupt();
       }
       m$c tb = this.b;
       Objects.requireNonNull(tb);
       tb.n = n.a1();
       int i = 3;
       int i1 = 5;
       this.b.H();
       do {
          w = m.w;
          i2 = w.get(this.b);
       } while (i2 >= i || w.compareAndSet(this.b, i2, i));
       if (!this.b.r) {
          m.t.error("Buggy "+e.class.getSimpleName()+" implementation; "+m.class.getSimpleName()+".confirmShutdown\(\) must be called "+"before run\(\) implementation terminates.");
       }
       do {
       } while (this.b.v());
       this.b.u();
       m.w.set(this.b, i1);
       this.b.k.release();
       if (!this.b.f.isEmpty()) {
          b t = m.t;
          StringBuilder str1 = "";
          t.warn(str1+str+this.b.f.size()+')');
       }
       this.b.s.p(null);
       return;
    }
}
