package io.netty.channel.m;
import java.lang.Class;
import ard.b;
import ard.c;
import io.netty.channel.m$a;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.h;
import io.netty.util.internal.f;
import sun.misc.Unsafe;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import io.netty.channel.a;
import java.lang.Object;
import io.netty.channel.r;
import java.lang.Throwable;
import io.netty.channel.g0;
import io.netty.util.concurrent.l;
import io.netty.util.concurrent.e;
import java.util.Arrays;
import java.nio.channels.ClosedChannelException;
import lqd.m;
import io.netty.channel.d;
import io.netty.channel.m$c;
import java.lang.Runnable;
import java.util.concurrent.ScheduledExecutorService;
import io.netty.channel.m$d;
import wqd.m;
import java.lang.IllegalStateException;
import lqd.b;
import lqd.i;
import io.netty.channel.m$b;
import io.netty.channel.q;
import io.netty.util.concurrent.k;

public final class m	// class@0010a9
{
    public final d a;
    public m$d b;
    public m$d c;
    public m$d d;
    public int e;
    public int f;
    public long g;
    public boolean h;
    public long i;
    public int j;
    public Runnable k;
    public static final b l;
    public static final e m;
    public static final AtomicLongFieldUpdater n;
    public static final AtomicIntegerFieldUpdater o;
    public static final boolean p;

    static {
       m.l = c.a(m.class);
       m.m = new m$a();
       AtomicIntegerFieldUpdater uAtomicInteg = PlatformDependent.v(m.class, "unwritable");
       if (uAtomicInteg == null) {
          uAtomicInteg = AtomicIntegerFieldUpdater.newUpdater(m.class, "j");
       }
       m.o = uAtomicInteg;
       String str = "totalPendingSize";
       h oh = (PlatformDependent.q())? new h(f.b, m.class, str): null;
       if (oh == null) {
          oh = AtomicLongFieldUpdater.newUpdater(m.class, "i");
       }
       m.n = oh;
    }
    public void m(a p0){
       super();
       this.a = p0;
    }
    public static void m(r p0,Throwable p1){
       if (!p0 instanceof g0 && !p0.y(p1)) {
          m.l.warn("Failed to mark a promise as failure because it\'s done already: {}", p0, p1);
       }
       return;
    }
    public final void a(){
       m tf = this.f;
       if (tf > null) {
          this.f = 0;
          Arrays.fill(m.m.b(), 0, tf, null);
       }
       return;
    }
    public void b(ClosedChannelException p0){
       if (this.h != null) {
          this.a.F3().execute(new m$c(this, p0));
          return;
       }else {
          this.h = true;
          if (this.a.isOpen()) {
             throw new IllegalStateException("close\(\) must be invoked after the channel is closed.");
          }
          if (!this.h()) {
             throw new IllegalStateException("close\(\) must be invoked after all flushed writes are handled.");
          }
          for (m tc = this.c; tc != null; tc = tc.b) {
             int i = - tc.i;
             m.n.addAndGet(this, (long)i);
             if (tc.k == null) {
                m.b(tc.c);
                m.m(tc.f, p0);
             }
             tc.a();
          }
          this.h = false;
          this.a();
          return;
       }
    }
    public Object c(){
       m tb = this.b;
       if (tb == null) {
          return null;
       }
       return tb.c;
    }
    public final void d(long p0,boolean p1,boolean p2){
       m tj;
       int i;
       long l = 0;
       if (!p0 - l) {
          return;
       }
       p0 = - p0;
       p0 = m.n.addAndGet(this, p0);
       if (p2 && (!p0 - l || p0 - (long)this.a.N().b0() <= 0)) {
          do {
             tj = this.j;
             i = tj & 0xfe;
          } while (m.o.compareAndSet(this, tj, i));
          if (tj != null && !i) {
             this.f(p1);
          }
       }
       return;
    }
    public void e(Throwable p0,boolean p1){
       m tb;
       if (this.h != null) {
          return;
       }
       this.h = true;
       do {
          tb = this.b;
          if (tb == null) {
             this.a();
             tb = null;
          }else {
             m$d c = tb.c;
             m$d f = tb.f;
             m$d i = tb.i;
             this.l(tb);
             if (tb.k == null) {
                m.b(c);
                m.m(f, p0);
                this.d((long)i, false, p1);
             }
             tb.a();
             tb = 1;
          }
       } while (!tb);
       this.h = false;
       return;
    }
    public final void f(boolean p0){
       i oi = this.a.d0();
       if (p0) {
          m tk = this.k;
          if (tk == null) {
             tk = new m$b(this, oi);
             this.k = tk;
          }
          this.a.F3().execute(tk);
       }else {
          oi.l0();
       }
       return;
    }
    public final void g(long p0,boolean p1){
       m tj;
       int i;
       if (!p0 - null) {
          return;
       }
       if (m.n.addAndGet(this, p0) - (long)this.a.N().m0() >= 0) {
          do {
             tj = this.j;
             i = tj | 0x01;
          } while (m.o.compareAndSet(this, tj, i));
          if (tj == null && i) {
             this.f(p1);
          }
       }
       return;
    }
    public boolean h(){
       boolean b = (this.e == null)? true: false;
       return b;
    }
    public boolean i(){
       boolean b = (this.j == null)? true: false;
       return b;
    }
    public void j(long p0){
       m tb = this.b;
       m$d f = tb.f;
       if (f instanceof q) {
          long l = tb.g + p0;
          tb.g = l;
          f.C(l, tb.h);
       }
       return;
    }
    public boolean k(){
       m tb = this.b;
       if (tb == null) {
          this.a();
          return false;
       }else {
          m$d c = tb.c;
          m$d f = tb.f;
          m$d i = tb.i;
          this.l(tb);
          if (tb.k == null) {
             m.b(c);
             if (!f instanceof g0 && !f.i0()) {
                m.l.warn("Failed to mark a promise as success because it is done already: {}", f);
             }
             this.d((long)i, false, true);
          }
          tb.a();
          return true;
       }
    }
    public final void l(m$d p0){
       int i = this.e - 1;
       this.e = i;
       if (!i) {
          this.b = null;
          if (p0 == this.d) {
             this.d = null;
             this.c = null;
          }
       }else {
          this.b = p0.b;
       }
       return;
    }
}
