package io.reactivex.internal.operators.observable.k$b;
import crd.b;
import io.reactivex.internal.observers.k;
import brd.y;
import java.util.concurrent.Callable;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.util.Collection;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.operators.observable.k$a;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.util.i;
import io.reactivex.internal.util.m;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class k$b extends k implements b	// class@0013cc
{
    public final Callable K;
    public final Callable L;
    public b M;
    public final AtomicReference N;
    public Collection O;

    public void k$b(y p0,Callable p1,Callable p2){
       super(p0, new MpscLinkedQueue());
       this.N = new AtomicReference();
       this.K = p1;
       this.L = p2;
    }
    public void dispose(){
       if (this.H == null) {
          this.H = true;
          this.M.dispose();
          DisposableHelper.dispose(this.N);
          if (this.a()) {
             this.G.clear();
          }
       }
       return;
    }
    public void e(y p0,Object p1){
       this.actual.onNext(p1);
    }
    public void i(){
       Object obj = this.K.call();
       a.c(obj, "The buffer supplied is null");
       Object obj1 = this.L.call();
       a.c(obj1, "The boundary ObservableSource supplied is null");
       k$a uoa = new k$a(this);
       if (DisposableHelper.replace(this.N, uoa)) {
          _monitor_enter(this);
          k$b tO = this.O;
          if (tO == null) {
             _monitor_exit(this);
             return;
          }else {
             this.O = obj;
             _monitor_exit(this);
             obj1.subscribe(uoa);
             this.g(tO, false, this);
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void onComplete(){
       _monitor_enter(this);
       k$b tO = this.O;
       if (tO == null) {
          _monitor_exit(this);
          return;
       }else {
          this.O = null;
          _monitor_exit(this);
          this.G.offer(tO);
          this.I = true;
          if (this.a()) {
             m.c(this.G, this.actual, false, this, this);
          }
          return;
       }
    }
    public void onError(Throwable p0){
       this.dispose();
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       _monitor_enter(this);
       k$b tO = this.O;
       if (tO == null) {
          _monitor_exit(this);
          return;
       }else {
          tO.add(p0);
          _monitor_exit(this);
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.M, p0)) {
          this.M = p0;
          Object obj = this.K.call();
          a.c(obj, "The buffer supplied is null");
          this.O = obj;
          obj = this.L.call();
          a.c(obj, "The boundary ObservableSource supplied is null");
          k$a uoa = new k$a(this);
          this.N.set(uoa);
          this.actual.onSubscribe(this);
          if (this.H == null) {
             obj.subscribe(uoa);
          }
       }
       return;
    }
}
