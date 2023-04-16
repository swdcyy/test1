package kotlinx.coroutines.scheduling.CoroutineScheduler$b;
import java.lang.Thread;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.scheduling.CoroutineScheduler;
import ntd.n;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;
import ssd.e;
import ssd.e$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import ntd.i;
import ntd.j;
import ltd.q;
import java.lang.System;
import java.util.concurrent.locks.LockSupport;
import java.lang.StringBuilder;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.lang.Math;
import kotlin.jvm.internal.a;
import qrd.l1;

public final class CoroutineScheduler$b extends Thread	// class@001b41
{
    public final n b;
    public CoroutineScheduler$WorkerState c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final CoroutineScheduler h;
    public int indexInArray;
    public Object nextParkedWorker;
    public int workerCtl;
    public static final AtomicIntegerFieldUpdater i;

    static {
       CoroutineScheduler$b.i = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler$b.class, "workerCtl");
    }
    public void CoroutineScheduler$b(CoroutineScheduler p0){
       this.h = p0;
       super();
       this.setDaemon(true);
       this.b = new n();
       this.c = CoroutineScheduler$WorkerState.DORMANT;
       this.workerCtl = 0;
       this.nextParkedWorker = CoroutineScheduler.l;
       this.f = e.b.k();
    }
    public void CoroutineScheduler$b(CoroutineScheduler p0,int p1){
       super(p0);
       this.o(p1);
    }
    public final void a(int p0){
       if (!p0) {
          return;
       }
       CoroutineScheduler.j.addAndGet(this.h, -2097152);
       if (this.c != CoroutineScheduler$WorkerState.TERMINATED) {
          this.c = CoroutineScheduler$WorkerState.DORMANT;
       }
       return;
    }
    public final void b(int p0){
       if (!p0) {
          return;
       }
       if (this.s(CoroutineScheduler$WorkerState.BLOCKING)) {
          this.h.O();
       }
       return;
    }
    public final void c(i p0){
       int i = p0.c.r();
       this.i(i);
       this.b(i);
       this.h.K(p0);
       this.a(i);
    }
    public final i d(boolean p0){
       i oi;
       i oi1;
       if (p0) {
          oi = (!this.k((this.h.e * 2)))? 1: null;
          if (oi) {
             oi1 = this.m();
             if (oi1 != null) {
                return oi1;
             }
          }
          oi1 = this.b.h();
          if (oi1 != null) {
             return oi1;
          }else if(!oi){
             oi = this.m();
             if (oi != null) {
                return oi;
             }
          }
       }else {
          oi = this.m();
          if (oi != null) {
             return oi;
          }
       }
       return this.t(false);
    }
    public final i e(boolean p0){
       i oi;
       if (this.q()) {
          return this.d(p0);
       }
       if (p0) {
          oi = this.b.h();
          if (oi == null) {
             oi = this.h.c.g();
          }
       }else {
          oi = this.h.c.g();
       }
       if (oi == null) {
          oi = this.t(true);
       }
       return oi;
    }
    public final int f(){
       return this.indexInArray;
    }
    public final Object g(){
       return this.nextParkedWorker;
    }
    public final CoroutineScheduler h(){
       return this.h;
    }
    public final void i(int p0){
       this.d = 0;
       if (this.c == CoroutineScheduler$WorkerState.PARKING) {
          this.c = CoroutineScheduler$WorkerState.BLOCKING;
       }
       return;
    }
    public final boolean j(){
       boolean b = (this.nextParkedWorker != CoroutineScheduler.l)? true: false;
       return b;
    }
    public final int k(int p0){
       CoroutineScheduler$b tf = this.f;
       int i = tf ^ (tf << 13);
       i = i ^ (i >> 17);
       i = i ^ (i << 5);
       this.f = i;
       int i1 = p0 - 1;
       if (!(i1 & p0)) {
          return (i & i1);
       }
       return ((i & Integer.MAX_VALUE) % p0);
    }
    public final void l(){
       if (!this.d) {
          this.d = System.nanoTime() + this.h.g;
       }
       LockSupport.parkNanos(this.h.g);
       if ((System.nanoTime() - this.d) >= 0) {
          this.d = 0;
          this.u();
       }
       return;
    }
    public final i m(){
       i oi;
       if (!this.k(2)) {
          oi = this.h.b.g();
          if (oi != null) {
             return oi;
          }
          return this.h.c.g();
       }else {
          oi = this.h.c.g();
          if (oi != null) {
             return oi;
          }
          return this.h.b.g();
       }
    }
    public final void n(){
       CoroutineScheduler$WorkerState workerState;
       boolean b = false;
       while (true) {
          workerState = null;
          break ;
       }
       while (!this.h.isTerminated() && this.c != CoroutineScheduler$WorkerState.TERMINATED) {
          i oi = this.e(this.g);
          long l = 0;
          if (oi != null) {
             this.e = l;
             this.c(oi);
          }else {
             this.g = b;
             if (this.e - l) {
                if (workerState == null) {
                   workerState = 1;
                }else {
                   this.s(CoroutineScheduler$WorkerState.PARKING);
                   Thread.interrupted();
                   LockSupport.parkNanos(this.e);
                   this.e = l;
                   continue ;
                }
             }else {
                this.r();
             }
          }
       }
       this.s(CoroutineScheduler$WorkerState.TERMINATED);
       return;
    }
    public final void o(int p0){
       StringBuilder str = this.h.h+"-worker-";
       String str1 = (!p0)? "TERMINATED": String.valueOf(p0);
       this.setName(str+str1);
       this.indexInArray = p0;
       return;
    }
    public final void p(Object p0){
       this.nextParkedWorker = p0;
    }
    public final boolean q(){
       CoroutineScheduler$WorkerState workerState;
       boolean b = false;
       if (this.c != CoroutineScheduler$WorkerState.CPU_ACQUIRED) {
          CoroutineScheduler$b th = this.h;
          while (true) {
             CoroutineScheduler controlState = th.controlState;
             long l = 0x7ffffc0000000000 & controlState;
             l = l >> 42;
             if (!(int)l) {
                workerState = null;
             }else {
                long l1 = controlState - 0x40000000000;
                if (CoroutineScheduler.j.compareAndSet(th, controlState, l1)) {
                   workerState = 1;
                }
             }
             if (workerState) {
                this.c = CoroutineScheduler$WorkerState.CPU_ACQUIRED;
             }else {
                break ;
             }
          }
          return b;
       }
       b = true;
       goto label_0034 ;
    }
    public final void r(){
       if (!this.j()) {
          this.h.C(this);
          return;
       }else {
          this.workerCtl = -1;
          while (!this.j() || (!this.h.isTerminated() && this.c != CoroutineScheduler$WorkerState.TERMINATED)) {
             this.s(CoroutineScheduler$WorkerState.PARKING);
             Thread.interrupted();
             this.l();
          }
          return;
       }
    }
    public void run(){
       this.n();
    }
    public final boolean s(CoroutineScheduler$WorkerState p0){
       CoroutineScheduler$b tc = this.c;
       boolean b = (tc == CoroutineScheduler$WorkerState.CPU_ACQUIRED)? true: false;
       if (b) {
          CoroutineScheduler.j.addAndGet(this.h, 0x40000000000);
       }
       if (tc != p0) {
          this.c = p0;
       }
       return b;
    }
    public final i t(boolean p0){
       CoroutineScheduler$b uob = this;
       int i = uob.h.v();
       if (i < 2) {
          return null;
       }
       int i1 = uob.k(i);
       int i2 = 0;
       long l = Long.MAX_VALUE;
       while (true) {
          if (i2 < i) {
             i1 = i1 + 1;
             if (i1 > i) {
                i1 = 1;
             }
             CoroutineScheduler$b uob1 = uob.h.d.get(i1);
             if (uob1 != null && uob1 != uob) {
                long l1 = (p0)? uob.b.k(uob1.b): uob.b.l(uob1.b);
                if (!l1 - -1) {
                   return uob.b.h();
                }else if(l1 > 0){
                   l = Math.min(l, l1);
                }
             }
          label_0057 :
             i2 = i2 + 1;
          }else if(l - Long.MAX_VALUE){
             l = 0;
             break ;
          }
          break ;
       }
       uob.e = l;
       return null;
    }
    public final void u(){
       CoroutineScheduler d = this.h.d;
       _monitor_enter(d);
       if (this.h.isTerminated()) {
          _monitor_exit(d);
          return;
       }else if(this.h.v() <= this.h.e){
          _monitor_exit(d);
          return;
       }else if(!CoroutineScheduler$b.i.compareAndSet(this, -1, 1)){
          _monitor_exit(d);
          return;
       }else {
          CoroutineScheduler$b tindexInArra = this.indexInArray;
          this.o(0);
          this.h.E(this, tindexInArra, 0);
          int i = (int)(CoroutineScheduler.j.getAndDecrement(this.h) & 0x1fffff);
          if (i != tindexInArra) {
             Object obj = this.h.d.get(i);
             if (obj == null) {
                a.L();
             }
             this.h.d.set(tindexInArra, obj);
             obj.o(tindexInArra);
             this.h.E(obj, i, tindexInArra);
          }
          this.h.d.set(i, null);
          _monitor_exit(d);
          this.c = CoroutineScheduler$WorkerState.TERMINATED;
          return;
       }
    }
}
