package io.reactivex.internal.operators.observable.ObservableRetryBiPredicate$RetryBiObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import erd.d;
import io.reactivex.internal.disposables.SequentialDisposable;
import brd.w;
import java.lang.Throwable;
import java.lang.Integer;
import java.lang.Object;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import crd.b;

public final class ObservableRetryBiPredicate$RetryBiObserver extends AtomicInteger implements y	// class@001350
{
    public final y actual;
    public final d predicate;
    public int retries;
    public final SequentialDisposable sa;
    public final w source;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void ObservableRetryBiPredicate$RetryBiObserver(y p0,d p1,SequentialDisposable p2,w p3){
       super();
       this.actual = p0;
       this.sa = p2;
       this.source = p3;
       this.predicate = p1;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       int i = this.retries + 1;
       this.retries = i;
       if (!this.predicate.a(Integer.valueOf(i), p0)) {
          this.actual.onError(p0);
          return;
       }else {
          this.subscribeNext();
          return;
       }
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       this.sa.update(p0);
    }
    public void subscribeNext(){
       if (!this.getAndIncrement()) {
          int i = 1;
          while (true) {
             if (this.sa.isDisposed()) {
                return;
             }
             this.source.subscribe(this);
             i = - i;
             if (this.addAndGet(i)) {
             }
          }
       }
       return;
    }
}
