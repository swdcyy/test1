package io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver;
import crd.b;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import brd.d;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import crd.a;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver$InnerObserver;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver extends AtomicInteger implements b, y	// class@00130a
{
    public final d actual;
    public b d;
    public final boolean delayErrors;
    public boolean disposed;
    public final AtomicThrowable errors;
    public final o mapper;
    public final a set;
    public static final long serialVersionUID = 0x752c1ce874ed53bf;

    public void ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver(d p0,o p1,boolean p2){
       super();
       this.actual = p0;
       this.mapper = p1;
       this.delayErrors = p2;
       this.errors = new AtomicThrowable();
       this.set = new a();
       this.lazySet(1);
    }
    public void dispose(){
       this.disposed = true;
       this.d.dispose();
       this.set.dispose();
    }
    public void innerComplete(ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver$InnerObserver p0){
       this.set.b(p0);
       this.onComplete();
    }
    public void innerError(ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver$InnerObserver p0,Throwable p1){
       this.set.b(p0);
       this.onError(p1);
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       if (!this.decrementAndGet()) {
          Throwable throwable = this.errors.terminate();
          if (throwable != null) {
             this.actual.onError(throwable);
          }else {
             this.actual.onComplete();
          }
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          if (this.delayErrors != null) {
             if (!this.decrementAndGet()) {
                this.actual.onError(this.errors.terminate());
             }
          }else {
             this.dispose();
             if (this.getAndSet(0) > 0) {
                this.actual.onError(this.errors.terminate());
             }
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null CompletableSource");
       this.getAndIncrement();
       ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver$InnerObserver uFlatMapComp = new ObservableFlatMapCompletableCompletable$FlatMapCompletableMainObserver$InnerObserver(this);
       if (this.disposed == null && this.set.c(uFlatMapComp)) {
          p0.a(uFlatMapComp);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
