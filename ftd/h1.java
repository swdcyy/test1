package ftd.h1;
import ftd.s0;
import ftd.i1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ftd.h1$c;
import java.lang.IllegalStateException;
import ftd.h1$d;
import kotlin.jvm.internal.a;
import java.lang.Runnable;
import ftd.c1;
import ftd.k1;
import ftd.j3;
import ftd.k3;
import java.lang.System;
import ftd.h1$b;
import ftd.m2;
import ltd.n0;
import ltd.m0;
import ftd.g1;
import ltd.r;
import usd.q;
import ftd.k;
import ftd.h1$a;
import ftd.n;
import asd.c;
import ftd.s0$a;
import ftd.f3;
import kotlin.coroutines.CoroutineContext;
import ftd.p0;

public abstract class h1 extends i1 implements s0	// class@001649
{
    public Object _delayed;
    public int _isCompleted;
    public Object _queue;
    public static final AtomicReferenceFieldUpdater f;
    public static final AtomicReferenceFieldUpdater g;

    static {
       h1.f = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_queue");
       h1.g = AtomicReferenceFieldUpdater.newUpdater(h1.class, Object.class, "_delayed");
    }
    public void h1(){
       super();
       this._queue = null;
       this._delayed = null;
       this._isCompleted = 0;
    }
    public final void A0(){
       this._queue = null;
       this._delayed = null;
    }
    public final void B0(long p0,h1$c p1){
       int i = this.C0(p0, p1);
       if (i) {
          if (i != 1) {
             if (i != 2) {
                throw new IllegalStateException("unexpected result".toString());
             }
          }else {
             this.r0(p0, p1);
          }
       }else if(this.F0(p1)){
          this.s0();
       }
       return;
    }
    public final int C0(long p0,h1$c p1){
       if (this.c()) {
          return 1;
       }
       h1 t_delayed = this._delayed;
       if (t_delayed == null) {
          h1.g.compareAndSet(this, null, new h1$d(p0));
          t_delayed = this._delayed;
          if (t_delayed == null) {
             a.L();
          }
       }
       return p1.e(p0, t_delayed, this);
    }
    public final c1 D0(long p0,Runnable p1){
       h1$b uob;
       p0 = k1.d(p0);
       if (p0 - 0x3fffffffffffffff < 0) {
          j3 oj3 = k3.b();
          long l = (oj3 != null)? oj3.a(): System.nanoTime();
          uob = new h1$b((p0 + l), p1);
          this.B0(l, uob);
       }else {
          uob = m2.b;
       }
       return uob;
    }
    public final void E0(boolean p0){
       this._isCompleted = p0;
    }
    public final boolean F0(h1$c p0){
       h1 t_delayed = this._delayed;
       h1$c uoc = (t_delayed != null)? t_delayed.h(): null;
       boolean b = (uoc == p0)? true: false;
       return b;
    }
    public final boolean c(){
       return this._isCompleted;
    }
    public long f0(){
       if (!super.f0()) {
          return 0;
       }
       h1 t_queue = this._queue;
       j3 oj3 = Long.MAX_VALUE;
       if (t_queue != null) {
          if (t_queue instanceof r) {
             if (!t_queue.h()) {
                return 0;
             }
          }else if(t_queue == k1.b){
             return oj3;
          }else {
             return 0;
          }
       }
       t_queue = this._delayed;
       if (t_queue != null) {
          h1$c uoc = t_queue.h();
          if (uoc != null) {
             uoc = uoc.d;
             oj3 = k3.b();
             long l = (oj3 != null)? oj3.a(): System.nanoTime();
             return q.o((uoc - l), 0);
          }
       }
       return oj3;
    }
    public void g(long p0,k p1){
       p0 = k1.d(p0);
       if (p0 - 0x3fffffffffffffff < 0) {
          j3 oj3 = k3.b();
          long l = (oj3 != null)? oj3.a(): System.nanoTime();
          h1$a uoa = new h1$a(this, (p0 + l), p1);
          n.a(p1, uoa);
          this.B0(l, uoa);
       }
       return;
    }
    public Object h(long p0,c p1){
       return s0$a.a(this, p0, p1);
    }
    public boolean i0(){
       boolean b = false;
       if (!this.k0()) {
          return b;
       }
       h1 t_delayed = this._delayed;
       if (t_delayed != null && !t_delayed.g()) {
          return b;
       }
       t_delayed = this._queue;
       if (t_delayed == null) {
       label_001a :
          b = true;
       }else if(t_delayed instanceof r){
          b = t_delayed.h();
       }else if(t_delayed == k1.b){
          goto label_001a ;
       }
       return b;
    }
    public c1 k(long p0,Runnable p1){
       return s0$a.b(this, p0, p1);
    }
    public long l0(){
       Runnable runnable;
       if (this.n0()) {
          return 0;
       }
       h1 t_delayed = this._delayed;
       if (t_delayed != null && !t_delayed.g()) {
          j3 oj3 = k3.b();
          long l = (oj3 != null)? oj3.a(): System.nanoTime();
          while (true) {
             _monitor_enter(t_delayed);
             n0 on0 = t_delayed.e();
             int i = 0;
             if (on0 != null) {
                boolean b = (on0.f(l))? this.x0(on0): false;
                if (b) {
                   i = t_delayed.k(0);
                }
                _monitor_exit(t_delayed);
             }else {
                _monitor_exit(t_delayed);
             }
             if (i != null) {
                continue ;
             }
          }
          runnable.run();
          return 0;
       }
    label_004d :
       runnable = this.v0();
       if (runnable != null) {
          goto label_0053 ;
       }else {
          return this.f0();
       }
    }
    public void shutdown(){
       f3.b.c();
       this.E0(true);
       this.u0();
       do {
       } while (this.l0() <= 0);
       this.y0();
       return;
    }
    public final void u(CoroutineContext p0,Runnable p1){
       this.w0(p1);
    }
    public final void u0(){
       while (true) {
          h1 t_queue = this._queue;
          if (t_queue == null) {
             if (h1.f.compareAndSet(this, null, k1.b)) {
                return;
             }
             continue ;
          }else if(t_queue instanceof r){
             t_queue.d();
             return;
          }else if(t_queue == k1.b){
             return;
          }else {
             r or = new r(8, true);
             or.a(t_queue);
             if (h1.f.compareAndSet(this, t_queue, or)) {
                break ;
             }
          }
       }
       return;
    }
    public final Runnable v0(){
       h1 t_queue;
       while (true) {
          t_queue = this._queue;
          Runnable runnable = null;
          if (t_queue == null) {
             return runnable;
          }
          if (t_queue instanceof r) {
             h1 oh1 = t_queue;
             Object obj = oh1.l();
             if (obj != r.g) {
                return obj;
             }
             h1.f.compareAndSet(this, t_queue, oh1.k());
          }else if(t_queue == k1.b){
             return runnable;
          }else if(h1.f.compareAndSet(this, t_queue, runnable)){
             break ;
          }
       }
       return t_queue;
    }
    public final void w0(Runnable p0){
       if (this.x0(p0)) {
          this.s0();
       }else {
          p0.i.w0(p0);
       }
       return;
    }
    public final boolean x0(Runnable p0){
       boolean b1;
       while (true) {
          h1 t_queue = this._queue;
          boolean b = false;
          if (this.c()) {
             return b;
          }
          b1 = true;
          if (t_queue == null) {
             if (h1.f.compareAndSet(this, null, p0)) {
                return b1;
             }
             continue ;
          }else if(t_queue instanceof r){
             h1 oh1 = t_queue;
             int i = oh1.a(p0);
             if (!i) {
                return b1;
             }
             if (i != b1) {
                if (i == 2) {
                label_002a :
                   return b;
                }
                continue ;
             }else {
                h1.f.compareAndSet(this, t_queue, oh1.k());
             }
          }else if(t_queue == k1.b){
             return b;
          }else {
             r or = new r(8, b1);
             or.a(t_queue);
             or.a(p0);
             if (h1.f.compareAndSet(this, t_queue, or)) {
                break ;
             }
          }
       }
       return b1;
    }
    public final void y0(){
       j3 oj3 = k3.b();
       long l = (oj3 != null)? oj3.a(): System.nanoTime();
       h1 t_delayed = this._delayed;
       while (t_delayed != null) {
          h1$c uoc = t_delayed.m();
          if (uoc != null) {
             this.r0(l, uoc);
          }else {
             break ;
          }
       }
       return;
    }
}
