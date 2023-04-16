package io.netty.util.concurrent.m;
import yqd.b;
import java.lang.Class;
import ard.b;
import ard.c;
import io.netty.util.concurrent.m$a;
import io.netty.util.concurrent.m$b;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.PlatformDependent;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import yqd.q;
import java.util.concurrent.TimeUnit;
import yqd.f;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.LinkedHashSet;
import io.netty.util.concurrent.DefaultPromise;
import yqd.j;
import yqd.e;
import java.lang.Object;
import java.util.Objects;
import java.util.Queue;
import java.lang.Runnable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import io.netty.util.concurrent.f;
import yqd.a;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import yqd.n;
import java.lang.Thread;
import java.lang.IllegalStateException;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import io.netty.util.concurrent.m$c;

public abstract class m extends b	// class@001114
{
    public final Queue f;
    public Thread g;
    public q h;
    public final Executor i;
    public boolean j;
    public final Semaphore k;
    public final Set l;
    public final boolean m;
    public long n;
    public int o;
    public long p;
    public long q;
    public long r;
    public final l s;
    public static final b t;
    public static final Runnable u;
    public static final Runnable v;
    public static final AtomicIntegerFieldUpdater w;
    public static final AtomicReferenceFieldUpdater x;
    public static final long y;
    public static final boolean z;

    static {
       m.t = c.a(m.class);
       m.u = new m$a();
       m.v = new m$b();
       AtomicIntegerFieldUpdater uAtomicInteg = PlatformDependent.v(m.class, "state");
       if (uAtomicInteg == null) {
          uAtomicInteg = AtomicIntegerFieldUpdater.newUpdater(m.class, "o");
       }
       m.w = uAtomicInteg;
       AtomicReferenceFieldUpdater uAtomicRefer = PlatformDependent.w(m.class, "threadProperties");
       if (uAtomicRefer == null) {
          uAtomicRefer = AtomicReferenceFieldUpdater.newUpdater(m.class, q.class, "h");
       }
       m.x = uAtomicRefer;
       m.y = TimeUnit.SECONDS.toNanos(1);
    }
    public void m(f p0,Executor p1,boolean p2){
       super(p0);
       this.k = new Semaphore(0);
       this.l = new LinkedHashSet();
       this.o = 1;
       this.s = new DefaultPromise(j.o);
       Objects.requireNonNull(p1, "executor");
       this.m = p2;
       this.i = p1;
       this.f = this.E();
    }
    private void B(){
       if (this.b()) {
          long l = b.d();
          Runnable runnable = this.n(l);
          while (runnable != null) {
             this.f.add(runnable);
          }
       }
       return;
    }
    public static void G(){
       throw new RejectedExecutionException("event executor terminated");
    }
    public boolean D(){
       return (this.f.isEmpty() ^ 0x01);
    }
    public Queue E(){
       return new LinkedBlockingQueue();
    }
    public Runnable F(){
       Runnable runnable;
       do {
          runnable = this.f.poll();
       } while (runnable == m.u);
       return runnable;
    }
    public abstract void H();
    public f H3(long p0,long p1,TimeUnit p2){
       int i2;
       if (p0 < 0) {
          throw new IllegalArgumentException("quietPeriod: "+p0+" \(expected >= 0\)");
       }
       if (p1 - p0 < 0) {
          throw new IllegalArgumentException("timeout: "+p1+" \(expected >= quietPeriod \("+p0+"\)\)");
       }
       Objects.requireNonNull(p2, "unit");
       if (this.Q2()) {
          return this.w2();
       }
       boolean b = this.q0();
       while (true) {
          if (this.Q2()) {
             return this.w2();
          }
          AtomicIntegerFieldUpdater w = m.w;
          int i = w.get(this);
          int i1 = 3;
          if (!b && (i != 1 && i != 2)) {
             i1 = i;
             i2 = 0;
          }else {
             i2 = 1;
          }
          if (w.compareAndSet(this, i, i1)) {
             this.p = p2.toNanos(p0);
             this.q = p2.toNanos(p1);
             if (i == 1) {
                this.w();
             }
             if (i2) {
                this.d0(b);
                break ;
             }
             break ;
          }
       }
       return this.w2();
    }
    public boolean N(){
       this.B();
       Runnable runnable = this.F();
       if (runnable == null) {
          return false;
       }
       do {
          runnable.run();
          runnable = this.F();
       } while (runnable == null);
       this.n = n.a1();
       return true;
    }
    public boolean Q2(){
       boolean b = (m.w.get(this) >= 3)? true: false;
       return b;
    }
    public boolean U3(Thread p0){
       boolean b = (p0 == this.g)? true: false;
       return b;
    }
    public boolean a0(long p0){
       long l2;
       this.B();
       Runnable runnable = this.F();
       if (runnable == null) {
          return false;
       }
       long l = n.a1() + p0;
       int i = 0;
       long l1 = i;
       while (true) {
          runnable.run();
          l1 = l1 + 1;
          l2 = 63 & l1;
          if (!l2 - i) {
             l2 = n.a1();
             if (l2 - l >= 0) {
                break ;
             }
          }
          runnable = this.F();
          if (runnable == null) {
             l2 = n.a1();
             break ;
          }
       }
       this.n = l2;
       return true;
    }
    public boolean awaitTermination(long p0,TimeUnit p1){
       Objects.requireNonNull(p1, "unit");
       if (this.q0()) {
          throw new IllegalStateException("cannot await termination of the current thread");
       }
       if (this.k.tryAcquire(p0, p1)) {
          this.k.release();
       }
       return this.isTerminated();
    }
    public boolean c0(Runnable p0){
       return true;
    }
    public void d0(boolean p0){
       if (!p0 || m.w.get(this) == 3) {
          this.f.add(m.u);
       }
       return;
    }
    public void execute(Runnable p0){
       Objects.requireNonNull(p0, "task");
       boolean b = this.q0();
       if (b) {
          this.t(p0);
       }else {
          AtomicIntegerFieldUpdater w = m.w;
          if (w.get(this) == 1 && w.compareAndSet(this, 1, 2)) {
             this.w();
          }
          this.t(p0);
          if (this.isShutdown() && this.f.remove(p0)) {
             m.G();
             throw null;
          }
       }
       if (this.m == null && this.c0(p0)) {
          this.d0(b);
       }
       return;
    }
    public boolean isShutdown(){
       boolean b = (m.w.get(this) >= 4)? true: false;
       return b;
    }
    public boolean isTerminated(){
       boolean b = (m.w.get(this) == 5)? true: false;
       return b;
    }
    public void shutdown(){
       int i2;
       if (this.isShutdown()) {
          return;
       }
       boolean b = this.q0();
       while (true) {
          if (this.Q2()) {
             return;
          }
          AtomicIntegerFieldUpdater w = m.w;
          int i = w.get(this);
          int i1 = 4;
          if (!b && (i != 1 && (i != 2 && i != 3))) {
             i1 = i;
             i2 = 0;
          }else {
             i2 = 1;
          }
          if (w.compareAndSet(this, i, i1)) {
             if (i == 1) {
                this.w();
             }
             if (i2) {
                this.d0(b);
                break ;
             }
             break ;
          }
       }
       return;
    }
    public void t(Runnable p0){
       if (!this.isShutdown()) {
          this.f.add(p0);
          return;
       }else {
          m.G();
          throw null;
       }
    }
    public void u(){
    }
    public boolean v(){
       boolean b = false;
       if (!this.Q2()) {
          return b;
       }
       if (!this.q0()) {
          throw new IllegalStateException("must be invoked from an event loop");
       }
       b td = this.d;
       boolean b1 = true;
       m om = (td == null || td.isEmpty())? 1: null;
       if (!om) {
          n[] onArray = new n[td.size()];
          onArray = td.toArray(onArray);
          int len = onArray.length;
          for (int i = 0; i < len; i = i + 1) {
             onArray[i].S0(b);
          }
          td.clear();
       }
       if (!this.r - null) {
          this.r = n.a1();
       }
       if (!this.N()) {
          Runnable runnable = null;
          while (!this.l.isEmpty()) {
             this.l.clear();
             Iterator iterator = new ArrayList(this.l).iterator();
             while (iterator.hasNext()) {
                iterator.next().run();
                runnable = 1;
             }
          }
          if (runnable != null) {
             this.n = n.a1();
          }
          if (runnable == null) {
             long l = n.a1();
             if (this.isShutdown() || ((l - this.r) - this.q <= 0 && (l - this.n) - this.p <= 0)) {
                this.d0(b1);
                try{
                   b1 = 100;
                   Thread.sleep(b1);
                   return b;
                }catch(java.lang.InterruptedException e0){
                }
             }else {
                return b1;
             }
          }
       }
       if (this.isShutdown()) {
          return b1;
       }else {
          this.d0(b1);
          return b;
       }
    }
    public final void w(){
       this.i.execute(new m$c(this));
    }
    public f w2(){
       return this.s;
    }
}
