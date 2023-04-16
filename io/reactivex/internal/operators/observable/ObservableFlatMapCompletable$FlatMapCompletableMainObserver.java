package io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver;
import brd.y;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import crd.a;
import java.util.concurrent.atomic.AtomicInteger;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e;
import brd.d;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableFlatMapCompletable$FlatMapCompletableMainObserver extends BasicIntQueueDisposable implements y	// class@001307
{
    public final y actual;
    public b d;
    public final boolean delayErrors;
    public boolean disposed;
    public final AtomicThrowable errors;
    public final o mapper;
    public final a set;
    public static final long serialVersionUID = 0x752c1ce874ed53bf;

    public void ObservableFlatMapCompletable$FlatMapCompletableMainObserver(y p0,o p1,boolean p2){
       super();
       this.actual = p0;
       this.mapper = p1;
       this.delayErrors = p2;
       this.errors = new AtomicThrowable();
       this.set = new a();
       this.lazySet(1);
    }
    public void clear(){
    }
    public void dispose(){
       this.disposed = true;
       this.d.dispose();
       this.set.dispose();
    }
    public void innerComplete(ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver p0){
       this.set.b(p0);
       this.onComplete();
    }
    public void innerError(ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver p0,Throwable p1){
       this.set.b(p0);
       this.onError(p1);
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public boolean isEmpty(){
       return true;
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
       ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver uFlatMapComp = new ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver(this);
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
    public Object poll(){
       return null;
    }
    public int requestFusion(int p0){
       return (p0 & 0x02);
    }
}
