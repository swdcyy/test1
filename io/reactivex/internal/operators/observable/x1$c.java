package io.reactivex.internal.operators.observable.x1$c;
import crd.b;
import io.reactivex.internal.observers.k;
import brd.y;
import brd.w;
import erd.o;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.fuseable.n;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicLong;
import crd.a;
import java.util.ArrayList;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.Iterator;
import java.util.List;
import io.reactivex.subjects.UnicastSubject;
import java.lang.Throwable;
import io.reactivex.internal.operators.observable.x1$d;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.x1$a;
import drd.a;
import io.reactivex.internal.util.NotificationLite;
import ird.a;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.operators.observable.x1$b;

public final class x1$c extends k implements b	// class@001431
{
    public final w K;
    public final o L;
    public final int M;
    public final a N;
    public b O;
    public final AtomicReference P;
    public final List Q;
    public final AtomicLong R;

    public void x1$c(y p0,w p1,o p2,int p3){
       super(p0, new MpscLinkedQueue());
       this.P = new AtomicReference();
       AtomicLong uAtomicLong = new AtomicLong();
       this.R = uAtomicLong;
       this.K = p1;
       this.L = p2;
       this.M = p3;
       this.N = new a();
       this.Q = new ArrayList();
       uAtomicLong.lazySet(1);
    }
    public void dispose(){
       this.H = true;
    }
    public void e(y p0,Object p1){
    }
    public void i(){
       this.N.dispose();
       DisposableHelper.dispose(this.P);
    }
    public boolean isDisposed(){
       return this.H;
    }
    public void j(){
       k tG = this.G;
       k tactual = this.actual;
       x1$c tQ = this.Q;
       int i = 1;
       while (true) {
          k tI = this.I;
          Object obj = tG.poll();
          x1$c uoc = (obj == null)? 1: null;
          if (tI != null && uoc) {
             this.i();
             tG = this.J;
             if (tG != null) {
                Iterator iterator = tQ.iterator();
                while (iterator.hasNext()) {
                   iterator.next().onError(tG);
                }
             }else {
                Iterator iterator1 = tQ.iterator();
                while (iterator1.hasNext()) {
                   iterator1.next().onComplete();
                }
             }
             break ;
          }else if(uoc){
             i = - i;
             if (!this.d(i)) {
                return;
             }
             continue ;
          }else if(obj instanceof x1$d){
             x1$d a = obj.a;
             if (a != null) {
                if (tQ.remove(a)) {
                   obj.a.onComplete();
                   if (!this.R.decrementAndGet() - null) {
                      this.i();
                      return;
                   }
                }
             }else if(this.H != null){
                continue ;
             }else {
                UnicastSubject unicastSubje = UnicastSubject.g(this.M);
                tQ.add(unicastSubje);
                tactual.onNext(unicastSubje);
                obj = this.L.apply(obj.b);
                a.c(obj, "The ObservableSource supplied is null");
                x1$a uoa = new x1$a(this, unicastSubje);
                if (this.N.c(uoa)) {
                   this.R.getAndIncrement();
                   obj.subscribe(uoa);
                }
             }
          }else {
             Iterator iterator2 = tQ.iterator();
             while (iterator2.hasNext()) {
                iterator2.next().onNext(NotificationLite.getValue(obj));
             }
          }
       }
       tQ.clear();
       return;
    }
    public void k(Throwable p0){
       this.O.dispose();
       this.N.dispose();
       this.onError(p0);
    }
    public void onComplete(){
       if (this.I != null) {
          return;
       }
       this.I = true;
       if (this.a()) {
          this.j();
       }
       if (!this.R.decrementAndGet()) {
          this.N.dispose();
       }
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       if (this.I != null) {
          a.l(p0);
          return;
       }else {
          this.J = p0;
          this.I = true;
          if (this.a()) {
             this.j();
          }
          if (!this.R.decrementAndGet()) {
             this.N.dispose();
          }
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.f()) {
          Iterator iterator = this.Q.iterator();
          while (iterator.hasNext()) {
             iterator.next().onNext(p0);
          }
          if (!this.d(-1)) {
             return;
          }
       }else {
          this.G.offer(NotificationLite.next(p0));
          if (!this.a()) {
             return;
          }
       }
       this.j();
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.O, p0)) {
          this.O = p0;
          this.actual.onSubscribe(this);
          if (this.H != null) {
             return;
          }else {
             x1$b uob = new x1$b(this);
             if (this.P.compareAndSet(null, uob)) {
                this.R.getAndIncrement();
                this.K.subscribe(uob);
             }
          }
       }
       return;
    }
}
