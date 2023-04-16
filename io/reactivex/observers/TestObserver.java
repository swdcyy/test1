package io.reactivex.observers.TestObserver;
import brd.y;
import brd.p;
import brd.d0;
import brd.d;
import grd.a;
import io.reactivex.observers.TestObserver$EmptyObserver;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.AssertionError;
import io.reactivex.internal.disposables.DisposableHelper;
import crd.b;
import java.lang.IllegalStateException;
import java.lang.Thread;
import java.util.concurrent.CountDownLatch;
import java.lang.Throwable;
import java.lang.NullPointerException;
import io.reactivex.internal.fuseable.o;
import java.lang.StringBuilder;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;

public class TestObserver extends a implements y, p, d0, d	// class@0014e2
{
    public final y actual;
    public final AtomicReference l;
    public j m;

    public void TestObserver(){
       super(TestObserver$EmptyObserver.INSTANCE);
    }
    public void TestObserver(y p0){
       super();
       this.l = new AtomicReference();
       this.actual = p0;
    }
    public a a(){
       if (this.l.get() != null) {
          throw this.c("Subscribed!");
       }
       if (this.d.isEmpty()) {
          return this;
       }
       throw this.c("Not subscribed but errors found");
    }
    public a b(){
       if (this.l.get() != null) {
          return this;
       }
       throw this.c("Not subscribed!");
    }
    public final void dispose(){
       DisposableHelper.dispose(this.l);
    }
    public final boolean isDisposed(){
       return DisposableHelper.isDisposed(this.l.get());
    }
    public void onComplete(){
       if (this.g == null) {
          this.g = true;
          if (this.l.get() == null) {
             this.d.add(new IllegalStateException("onSubscribe not called in proper order"));
          }
       }
       this.f = Thread.currentThread();
       this.e = this.e + 1;
       this.actual.onComplete();
       this.b.countDown();
       return;
    }
    public void onError(Throwable p0){
       if (this.g == null) {
          this.g = true;
          if (this.l.get() == null) {
             this.d.add(new IllegalStateException("onSubscribe not called in proper order"));
          }
       }
       this.f = Thread.currentThread();
       if (p0 == null) {
          this.d.add(new NullPointerException("onError received a null Throwable"));
       }else {
          this.d.add(p0);
       }
       this.actual.onError(p0);
       this.b.countDown();
       return;
    }
    public void onNext(Object p0){
       if (this.g == null) {
          this.g = true;
          if (this.l.get() == null) {
             this.d.add(new IllegalStateException("onSubscribe not called in proper order"));
          }
       }
       this.f = Thread.currentThread();
       if (this.i == 2) {
          p0 = this.m.poll();
          while (p0 != null) {
             this.c.add(p0);
          }
          return;
       }else {
          this.c.add(p0);
          if (p0 == null) {
             this.d.add(new NullPointerException("onNext received a null value"));
          }
          this.actual.onNext(p0);
          return;
       }
    }
    public void onSubscribe(b p0){
       this.f = Thread.currentThread();
       if (p0 == null) {
          this.d.add(new NullPointerException("onSubscribe received a null Subscription"));
          return;
       }else if(!this.l.compareAndSet(null, p0)){
          p0.dispose();
          if (this.l.get() != DisposableHelper.DISPOSED) {
             this.d.add(new IllegalStateException("onSubscribe received multiple subscriptions: "+p0));
          }
          return;
       }else {
          a th = this.h;
          if (th != null && p0 instanceof j) {
             j oj = p0;
             this.m = oj;
             int i = oj.requestFusion(th);
             this.i = i;
             if (i == 1) {
                this.g = true;
                this.f = Thread.currentThread();
                p0 = this.m.poll();
                while (p0 != null) {
                   this.c.add(p0);
                }
                this.e = this.e + 1;
                this.l.lazySet(DisposableHelper.DISPOSED);
                return;
             }
          }
          this.actual.onSubscribe(p0);
          return;
       }
    }
    public void onSuccess(Object p0){
       this.onNext(p0);
       this.onComplete();
    }
}
