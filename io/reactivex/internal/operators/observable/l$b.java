package io.reactivex.internal.operators.observable.l$b;
import crd.b;
import io.reactivex.internal.observers.k;
import brd.y;
import java.util.concurrent.Callable;
import brd.w;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.util.Collection;
import io.reactivex.internal.util.i;
import io.reactivex.internal.util.m;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.l$a;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class l$b extends k implements b	// class@0013d2
{
    public final Callable K;
    public final w L;
    public b M;
    public b N;
    public Collection O;

    public void l$b(y p0,Callable p1,w p2){
       super(p0, new MpscLinkedQueue());
       this.K = p1;
       this.L = p2;
    }
    public void dispose(){
       if (this.H == null) {
          this.H = true;
          this.N.dispose();
          this.M.dispose();
          if (this.a()) {
             this.G.clear();
          }
       }
       return;
    }
    public void e(y p0,Object p1){
       this.actual.onNext(p1);
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void onComplete(){
       _monitor_enter(this);
       l$b tO = this.O;
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
       l$b tO = this.O;
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
          l$a uoa = new l$a(this);
          this.N = uoa;
          this.actual.onSubscribe(this);
          if (this.H == null) {
             this.L.subscribe(uoa);
          }
       }
       return;
    }
}
