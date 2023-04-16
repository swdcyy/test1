package kotlinx.coroutines.scheduling.CoroutineScheduler;
import java.util.concurrent.Executor;
import java.io.Closeable;
import kotlinx.coroutines.scheduling.CoroutineScheduler$a;
import nsd.u;
import ltd.e0;
import java.lang.String;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Object;
import ntd.e;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import ntd.l;
import java.lang.Runnable;
import ntd.j;
import ntd.h;
import kotlinx.coroutines.scheduling.CoroutineScheduler$b;
import ntd.i;
import ftd.j3;
import ftd.k3;
import java.lang.Thread;
import java.lang.Thread$UncaughtExceptionHandler;
import java.lang.Throwable;
import kotlin.jvm.internal.a;
import java.util.concurrent.locks.LockSupport;
import ntd.n;
import ltd.q;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import usd.q;
import ntd.m;
import ntd.k;
import java.util.concurrent.RejectedExecutionException;
import java.util.ArrayList;
import ntd.a;
import java.lang.Enum;
import java.util.Collection;
import ftd.o0;

public final class CoroutineScheduler implements Executor, Closeable	// class@001cf3
{
    public int _isTerminated;
    public final e b;
    public final e c;
    public long controlState;
    public final AtomicReferenceArray d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public long parkedWorkersStack;
    public static final AtomicLongFieldUpdater i;
    public static final AtomicLongFieldUpdater j;
    public static final AtomicIntegerFieldUpdater k;
    public static final e0 l;
    public static final CoroutineScheduler$a m;

    static {
       CoroutineScheduler.m = new CoroutineScheduler$a(null);
       CoroutineScheduler.l = new e0("NOT_IN_STACK");
       CoroutineScheduler.i = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
       CoroutineScheduler.j = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
       CoroutineScheduler.k = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    }
    public void CoroutineScheduler(int p0,int p1,long p2,String p3){
       super();
       this.e = p0;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       int i = (p0 >= 1)? 1: 0;
       if (i) {
          i = (p1 >= p0)? 1: 0;
          if (i) {
             i = (p1 <= 0x1ffffe)? 1: 0;
             if (i) {
                int i1 = (p2 > 0)? 1: 0;
                if (i1) {
                   this.b = new e();
                   this.c = new e();
                   this.parkedWorkersStack = 0;
                   this.d = new AtomicReferenceArray((p1 + 1));
                   this.controlState = (long)p0 << 42;
                   this._isTerminated = 0;
                   return;
                }else {
                   throw new IllegalArgumentException("Idle worker keep alive time "+p2+" must be positive".toString());
                }
             }else {
                throw new IllegalArgumentException("Max pool size "+p1+" should not exceed maximal supported number of threads 2097150".toString());
             }
          }else {
             throw new IllegalArgumentException("Max pool size "+p1+" should be greater than or equals to core pool size "+p0.toString());
          }
       }else {
          throw new IllegalArgumentException("Core pool size "+p0+" should be at least 1".toString());
       }
    }
    public void CoroutineScheduler(int p0,int p1,long p2,String p3,int p4,u p5){
       long l;
       if (p4 & 0x04) {
          p2 = l.e;
       }
       l = p2;
       if (p4 & 0x08) {
          p3 = "DefaultDispatcher";
       }
       super(p0, p1, l, p3);
       return;
    }
    public static boolean S(CoroutineScheduler p0,long p1,int p2,Object p3){
       CoroutineScheduler controlState;
       if (p2 & 0x01) {
          controlState = p0.controlState;
       }
       return p0.R(controlState);
    }
    public static void r(CoroutineScheduler p0,Runnable p1,j p2,boolean p3,int p4,Object p5){
       h c;
       if (p4 & 0x02) {
          c = h.c;
       }
       if (p4 & 0x04) {
          p3 = false;
       }
       p0.p(p1, c, p3);
       return;
    }
    public final CoroutineScheduler$b A(){
       Object obj;
       while (true) {
          CoroutineScheduler tparkedWorke = this.parkedWorkersStack;
          long l = 0x1fffff & tparkedWorke;
          int i = (int)l;
          obj = this.d.get(i);
          if (obj == null) {
             return null;
          }
          l = 0x200000 + tparkedWorke;
          l = l & -2097152;
          int i1 = this.z(obj);
          if (i1 < 0) {
             continue ;
          }else {
             long l1 = (long)i1 | l;
             if (CoroutineScheduler.i.compareAndSet(this, tparkedWorke, l1)) {
                break ;
             }
          }
       }
       obj.p(CoroutineScheduler.l);
       return obj;
    }
    public final boolean C(CoroutineScheduler$b p0){
       CoroutineScheduler tparkedWorke;
       long l1;
       if (p0.g() != CoroutineScheduler.l) {
          return false;
       }
       do {
          tparkedWorke = this.parkedWorkersStack;
          long l = 0x1fffff & tparkedWorke;
          int i = (int)l;
          l1 = 0x200000 + tparkedWorke;
          l1 = l1 & -2097152;
          p0.p(this.d.get(i));
          l1 = l1 | (long)p0.f();
       } while (CoroutineScheduler.i.compareAndSet(this, tparkedWorke, l1));
       return true;
    }
    public final void E(CoroutineScheduler$b p0,int p1,int p2){
       CoroutineScheduler tparkedWorke;
       long l1;
       do {
          tparkedWorke = this.parkedWorkersStack;
          long l = 0x1fffff & tparkedWorke;
          int i = (int)l;
          l1 = 0x200000 + tparkedWorke;
          l1 = l1 & -2097152;
          if (i == p1) {
             i = (!p2)? this.z(p0): p2;
          }
       label_0019 :
          if (i < 0) {
             continue ;
          }
          l1 = l1 | (long)i;
       } while (CoroutineScheduler.i.compareAndSet(this, tparkedWorke, l1));
       return;
    }
    public final long I(){
       return CoroutineScheduler.j.addAndGet(this, 0x40000000000);
    }
    public final void K(i p0){
       p0.run();
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.b();
       }
       return;
    }
    public final void L(long p0){
       i oi;
       if (!CoroutineScheduler.k.compareAndSet(this, 0, 1)) {
          return;
       }
       CoroutineScheduler$b uob = this.j();
       CoroutineScheduler td = this.d;
       _monitor_enter(td);
       int i = (int)(this.controlState & 0x1fffff);
       _monitor_exit(td);
       if (1 <= i) {
          int i1 = 1;
          Object obj = this.d.get(i1);
          while (obj == null) {
             a.L();
             break ;
             i1 = i1 + 1;
          }
          if (obj != uob) {
             while (obj.isAlive()) {
                LockSupport.unpark(obj);
                obj.join(p0);
             }
             obj.b.g(this.c);
          }
          if (i1 != i) {
             goto label_0042 ;
          }
       }
       this.c.b();
       this.b.b();
       while (true) {
          if (uob != null) {
             oi = uob.e(1);
             if (oi != null) {
                break ;
             }else {
             label_0058 :
                oi = this.b.g();
                break ;
             }
          }else {
             goto label_0058 ;
          }
       }
       if (oi == null) {
          oi = this.c.g();
       }
       if (oi != null) {
          this.K(oi);
       }else if(uob != null){
          uob.s(CoroutineScheduler$WorkerState.TERMINATED);
       }
       this.parkedWorkersStack = 0;
       this.controlState = 0;
       return;
    }
    public final void M(boolean p0){
       long l = CoroutineScheduler.j.addAndGet(this, 0x200000);
       if (p0) {
          return;
       }
       if (this.T()) {
          return;
       }
       if (this.R(l)) {
          return;
       }
       this.T();
       return;
    }
    public final void O(){
       if (this.T()) {
          return;
       }
       if (CoroutineScheduler.S(this, 0, 1, null)) {
          return;
       }
       this.T();
       return;
    }
    public final i P(CoroutineScheduler$b p0,i p1,boolean p2){
       if (p0 == null) {
          return p1;
       }
       if (p0.c == CoroutineScheduler$WorkerState.TERMINATED) {
          return p1;
       }
       if (!p1.c.r() && p0.c == CoroutineScheduler$WorkerState.BLOCKING) {
          return p1;
       }
       p0.g = true;
       return p0.b.a(p1, p2);
    }
    public final boolean Q(){
       while (true) {
          CoroutineScheduler tcontrolStat = this.controlState;
          long l = 0x7ffffc0000000000 & tcontrolStat;
          l = l >> 42;
          if (!(int)l) {
             return false;
          }
          long l1 = tcontrolStat - 0x40000000000;
          if (CoroutineScheduler.j.compareAndSet(this, tcontrolStat, l1)) {
             break ;
          }
       }
       return true;
    }
    public final boolean R(long p0){
       if (q.n(((int)(0x1fffff & p0) - (int)((p0 & 0x3ffffe00000) >> 21)), 0) < this.e) {
          int i = this.e();
          if (i == 1 && this.e > true) {
             this.e();
          }
          if (i > 0) {
             return true;
          }
       }
       return 0;
    }
    public final boolean T(){
       CoroutineScheduler$b uob;
       while (true) {
          uob = this.A();
          int i = 0;
          if (uob == null) {
             return i;
          }
          if (CoroutineScheduler$b.i.compareAndSet(uob, -1, i)) {
             break ;
          }
       }
       LockSupport.unpark(uob);
       return true;
    }
    public final boolean a(i p0){
       int i = 1;
       if (p0.c.r() == i) {
       }else {
          i = 0;
       }
       boolean b = (i)? this.c.a(p0): this.b.a(p0);
       return b;
    }
    public final int b(long p0){
       return (int)((p0 & 0x7ffffc0000000000) >> 42);
    }
    public final int c(long p0){
       return (int)((p0 & 0x3ffffe00000) >> 21);
    }
    public void close(){
       this.L(0x2710);
    }
    public final int e(){
       CoroutineScheduler td = this.d;
       _monitor_enter(td);
       if (this.isTerminated()) {
          _monitor_exit(td);
          return -1;
       }else {
          CoroutineScheduler tcontrolStat = this.controlState;
          long l = 0x1fffff;
          int i = (int)(tcontrolStat & l);
          int i1 = 0;
          int i2 = q.n((i - (int)((tcontrolStat & 0x3ffffe00000) >> 21)), i1);
          if (i2 >= this.e) {
             _monitor_exit(td);
             return i1;
          }else if(i >= this.f){
             _monitor_exit(td);
             return i1;
          }else {
             i = (int)(this.controlState & l) + 1;
             CoroutineScheduler$b uob = (i > 0 && this.d.get(i) == null)? 1: null;
             if (uob) {
                uob = new CoroutineScheduler$b(this, i);
                this.d.set(i, uob);
                if (i == (int)(l & CoroutineScheduler.j.incrementAndGet(this))) {
                   i1 = 1;
                }
                if (i1) {
                   uob.start();
                   _monitor_exit(td);
                   return (i2 + 1);
                }else {
                   throw new IllegalArgumentException("Failed requirement.".toString());
                }
             }else {
                throw new IllegalArgumentException("Failed requirement.".toString());
             }
          }
       }
    }
    public void execute(Runnable p0){
       CoroutineScheduler.r(this, p0, null, false, 6, null);
    }
    public final i f(Runnable p0,j p1){
       long l = l.f.a();
       if (!p0 instanceof i) {
          return new k(p0, l, p1);
       }
       p0.b = l;
       p0.c = p1;
       return p0;
    }
    public final int g(long p0){
       return (int)(p0 & 0x1fffff);
    }
    public final boolean isTerminated(){
       return this._isTerminated;
    }
    public final CoroutineScheduler$b j(){
       Thread thread = Thread.currentThread();
       Thread thread1 = null;
       if (!thread instanceof CoroutineScheduler$b) {
          thread = thread1;
       }
       if (thread != null && a.g(thread.h, this)) {
          thread1 = thread;
       }
       return thread1;
    }
    public final void k(){
       CoroutineScheduler.j.addAndGet(this, -2097152);
    }
    public final int o(){
       return (int)(CoroutineScheduler.j.getAndDecrement(this) & 0x1fffff);
    }
    public final void p(Runnable p0,j p1,boolean p2){
       j3 oj3 = k3.b();
       if (oj3 != null) {
          oj3.g();
       }
       i oi = this.f(p0, p1);
       CoroutineScheduler$b uob = this.j();
       i oi1 = this.P(uob, oi, p2);
       if (oi1 == null || this.a(oi1)) {
          boolean b = (p2 && uob != null)? true: false;
          if (!oi.c.r()) {
             if (b) {
                return;
             }else {
                this.O();
             }
          }else {
             this.M(b);
          }
          return;
       }else {
          throw new RejectedExecutionException(this.h+" was terminated");
       }
    }
    public String toString(){
       ArrayList uArrayList = new ArrayList();
       int i = this.d.length();
       int i1 = 0;
       CoroutineScheduler uCoroutineSc = 1;
       int i2 = 0;
       int i3 = 0;
       int i4 = 0;
       int i5 = 0;
       int i6 = 1;
       while (i6 < i) {
          CoroutineScheduler$b uob = this.d.get(i6);
          if (uob != null) {
             int i7 = uob.b.f();
             int i8 = a.a[uob.c.ordinal()];
             if (i8 != uCoroutineSc) {
                if (i8 != 2) {
                   if (i8 != 3) {
                      if (i8 != 4) {
                         if (i8 == 5) {
                            i5 = i5 + 1;
                         }
                      }else {
                         i4 = i4 + 1;
                         if (i7 > 0) {
                            uArrayList.add(String.valueOf(i7)+"d");
                         }
                      }
                   }else {
                      i1 = i1 + 1;
                      uArrayList.add(String.valueOf(i7)+"c");
                   }
                }else {
                   i2 = i2 + 1;
                   uArrayList.add(String.valueOf(i7)+"b");
                }
             }else {
                i3 = i3 + 1;
             }
          }
          i6 = i6 + 1;
       }
       CoroutineScheduler tcontrolStat = this.controlState;
       return this.h+'@'+o0.b(this)+'['+"Pool Size {"+"core = "+this.e+", "+"max = "+this.f+"}, "+"Worker States {"+"CPU = "+i1+", "+"blocking = "+i2+", "+"parked = "+i3+", "+"dormant = "+i4+", "+"terminated = "+i5+"}, "+"running workers queues = "+uArrayList+", "+"global CPU queue size = "+this.b.c()+", "+"global blocking queue size = "+this.c.c()+", "+"Control State {"+"created workers= "+(int)(0x1fffff & tcontrolStat)+", "+"blocking tasks = "+(int)((0x3ffffe00000 & tcontrolStat) >> 21)+", "+"CPUs acquired = "+(this.e - (int)((0x7ffffc0000000000 & tcontrolStat) >> 42))+"}]";
    }
    public final int u(){
       return (int)((this.controlState & 0x7ffffc0000000000) >> 42);
    }
    public final int v(){
       return (int)(this.controlState & 0x1fffff);
    }
    public final long x(){
       return CoroutineScheduler.j.addAndGet(this, 0x200000);
    }
    public final int y(){
       return (int)(CoroutineScheduler.j.incrementAndGet(this) & 0x1fffff);
    }
    public final int z(CoroutineScheduler$b p0){
       int i;
       p0 = p0.g();
       while (true) {
          if (p0 == CoroutineScheduler.l) {
             return -1;
          }
          if (p0 == null) {
             return 0;
          }
          i = p0.f();
          if (i) {
             break ;
          }else {
             p0 = p0.g();
          }
       }
       return i;
    }
}
