package io.reactivex.internal.operators.observable.m$b;
import java.lang.Runnable;
import crd.b;
import io.reactivex.internal.observers.k;
import brd.y;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import brd.z;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.util.Collection;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.util.i;
import io.reactivex.internal.util.m;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class m$b extends k implements Runnable, b	// class@0013d7
{
    public final Callable K;
    public final long L;
    public final TimeUnit M;
    public final z N;
    public b O;
    public Collection P;
    public final AtomicReference Q;

    public void m$b(y p0,Callable p1,long p2,TimeUnit p3,z p4){
       super(p0, new MpscLinkedQueue());
       this.Q = new AtomicReference();
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
    }
    public void dispose(){
       DisposableHelper.dispose(this.Q);
       this.O.dispose();
    }
    public void e(y p0,Object p1){
       this.actual.onNext(p1);
    }
    public boolean isDisposed(){
       boolean b = (this.Q.get() == DisposableHelper.DISPOSED)? true: false;
       return b;
    }
    public void onComplete(){
       _monitor_enter(this);
       m$b tP = this.P;
       this.P = null;
       _monitor_exit(this);
       if (tP != null) {
          this.G.offer(tP);
          this.I = true;
          if (this.a()) {
             m.c(this.G, this.actual, false, null, this);
          }
       }
       DisposableHelper.dispose(this.Q);
       return;
    }
    public void onError(Throwable p0){
       _monitor_enter(this);
       this.P = null;
       _monitor_exit(this);
       this.actual.onError(p0);
       DisposableHelper.dispose(this.Q);
    }
    public void onNext(Object p0){
       _monitor_enter(this);
       m$b tP = this.P;
       if (tP == null) {
          _monitor_exit(this);
          return;
       }else {
          tP.add(p0);
          _monitor_exit(this);
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.O, p0)) {
          this.O = p0;
          p0 = this.K.call();
          a.c(p0, "The buffer supplied is null");
          this.P = p0;
          this.actual.onSubscribe(this);
          if (this.H == null) {
             m$b tL = this.L;
             p0 = this.N.f(this, tL, tL, this.M);
             if (!this.Q.compareAndSet(null, p0)) {
                p0.dispose();
             }
          }
       }
       return;
    }
    public void run(){
       Object obj = this.K.call();
       a.c(obj, "The bufferSupplier returned a null buffer");
       _monitor_enter(this);
       m$b tP = this.P;
       if (tP != null) {
          this.P = obj;
       }
       _monitor_exit(this);
       if (tP == null) {
          DisposableHelper.dispose(this.Q);
          return;
       }else {
          this.g(tP, false, this);
          return;
       }
    }
}
