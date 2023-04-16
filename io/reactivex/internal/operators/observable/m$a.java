package io.reactivex.internal.operators.observable.m$a;
import java.lang.Runnable;
import crd.b;
import io.reactivex.internal.observers.k;
import brd.y;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.lang.Object;
import java.util.Collection;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.util.i;
import io.reactivex.internal.util.m;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class m$a extends k implements Runnable, b	// class@0013d6
{
    public final Callable K;
    public final long L;
    public final TimeUnit M;
    public final int N;
    public final boolean O;
    public final z$c P;
    public Collection Q;
    public b R;
    public b S;
    public long T;
    public long U;

    public void m$a(y p0,Callable p1,long p2,TimeUnit p3,int p4,boolean p5,z$c p6){
       super(p0, new MpscLinkedQueue());
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
       this.O = p5;
       this.P = p6;
    }
    public void dispose(){
       if (this.H == null) {
          this.H = true;
          this.S.dispose();
          this.P.dispose();
          _monitor_enter(this);
          this.Q = null;
          _monitor_exit(this);
       }
       return;
    }
    public void e(y p0,Object p1){
       p0.onNext(p1);
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void onComplete(){
       this.P.dispose();
       _monitor_enter(this);
       m$a tQ = this.Q;
       this.Q = null;
       _monitor_exit(this);
       this.G.offer(tQ);
       this.I = true;
       if (this.a()) {
          m.c(this.G, this.actual, false, this, this);
       }
       return;
    }
    public void onError(Throwable p0){
       _monitor_enter(this);
       this.Q = null;
       _monitor_exit(this);
       this.actual.onError(p0);
       this.P.dispose();
    }
    public void onNext(Object p0){
       _monitor_enter(this);
       m$a tQ = this.Q;
       if (tQ == null) {
          _monitor_exit(this);
          return;
       }else {
          tQ.add(p0);
          if (tQ.size() < this.N) {
             _monitor_exit(this);
             return;
          }else {
             this.Q = null;
             this.T = this.T + 1;
             _monitor_exit(this);
             if (this.O != null) {
                this.R.dispose();
             }
             this.h(tQ, false, this);
             p0 = this.K.call();
             a.c(p0, "The buffer supplied is null");
             _monitor_enter(this);
             this.Q = p0;
             this.U = this.U + 1;
             _monitor_exit(this);
             if (this.O != null) {
                m$a tL = this.L;
                this.R = this.P.d(this, tL, tL, this.M);
             }
             return;
          }
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.S, p0)) {
          this.S = p0;
          Object obj = this.K.call();
          a.c(obj, "The buffer supplied is null");
          this.Q = obj;
          this.actual.onSubscribe(this);
          m$a tL = this.L;
          this.R = this.P.d(this, tL, tL, this.M);
       }
       return;
    }
    public void run(){
       Object obj = this.K.call();
       a.c(obj, "The bufferSupplier returned a null buffer");
       _monitor_enter(this);
       m$a tQ = this.Q;
       if (tQ == null || this.T - this.U) {
          _monitor_exit(this);
          return;
       }else {
          this.Q = obj;
          _monitor_exit(this);
          this.h(tQ, false, this);
          return;
       }
    }
}
