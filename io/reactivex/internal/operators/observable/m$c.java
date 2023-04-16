package io.reactivex.internal.operators.observable.m$c;
import java.lang.Runnable;
import crd.b;
import io.reactivex.internal.observers.k;
import brd.y;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.util.LinkedList;
import java.lang.Object;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.util.i;
import io.reactivex.internal.util.m;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.m$c$b;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.m$c$a;

public final class m$c extends k implements Runnable, b	// class@0013da
{
    public final Callable K;
    public final long L;
    public final long M;
    public final TimeUnit N;
    public final z$c O;
    public final List P;
    public b Q;

    public void m$c(y p0,Callable p1,long p2,long p3,TimeUnit p4,z$c p5){
       super(p0, new MpscLinkedQueue());
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = p4;
       this.O = p5;
       this.P = new LinkedList();
    }
    public void dispose(){
       if (this.H == null) {
          this.H = true;
          this.i();
          this.Q.dispose();
          this.O.dispose();
       }
       return;
    }
    public void e(y p0,Object p1){
       p0.onNext(p1);
    }
    public void i(){
       _monitor_enter(this);
       this.P.clear();
       _monitor_exit(this);
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void onComplete(){
       _monitor_enter(this);
       this.P.clear();
       _monitor_exit(this);
       Iterator iterator = new ArrayList(this.P).iterator();
       while (iterator.hasNext()) {
          this.G.offer(iterator.next());
       }
       this.I = true;
       if (this.a()) {
          m.c(this.G, this.actual, false, this.O, this);
       }
       return;
    }
    public void onError(Throwable p0){
       this.I = true;
       this.i();
       this.actual.onError(p0);
       this.O.dispose();
    }
    public void onNext(Object p0){
       _monitor_enter(this);
       Iterator iterator = this.P.iterator();
       while (iterator.hasNext()) {
          iterator.next().add(p0);
       }
       _monitor_exit(this);
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.Q, p0)) {
          this.Q = p0;
          Object obj = this.K.call();
          a.c(obj, "The buffer supplied is null");
          this.P.add(obj);
          this.actual.onSubscribe(this);
          m$c tM = this.M;
          this.O.d(this, tM, tM, this.N);
          m$c$b uoc$b = new m$c$b(this, obj);
          this.O.c(uoc$b, this.L, this.N);
       }
       return;
    }
    public void run(){
       if (this.H != null) {
          return;
       }
       Object obj = this.K.call();
       a.c(obj, "The bufferSupplier returned a null buffer");
       _monitor_enter(this);
       if (this.H != null) {
          _monitor_exit(this);
          return;
       }else {
          this.P.add(obj);
          _monitor_exit(this);
          this.O.c(new m$c$a(this, obj), this.L, this.N);
          return;
       }
    }
}
