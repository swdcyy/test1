package io.reactivex.internal.operators.observable.ObservableRetryPredicate$RepeatObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import erd.r;
import io.reactivex.internal.disposables.SequentialDisposable;
import brd.w;
import java.lang.Throwable;
import java.lang.Object;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import crd.b;

public final class ObservableRetryPredicate$RepeatObserver extends AtomicInteger implements y	// class@001352
{
    public final y actual;
    public final r predicate;
    public long remaining;
    public final SequentialDisposable sa;
    public final w source;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void ObservableRetryPredicate$RepeatObserver(y p0,long p1,r p2,SequentialDisposable p3,w p4){
       super();
       this.actual = p0;
       this.sa = p3;
       this.source = p4;
       this.predicate = p2;
       this.remaining = p1;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       ObservableRetryPredicate$RepeatObserver tremaining = this.remaining;
       if (tremaining - Long.MAX_VALUE) {
          this.remaining = tremaining - 1;
       }
       if (!tremaining) {
          this.actual.onError(p0);
       }else if(!this.predicate.test(p0)){
          this.actual.onError(p0);
          return;
       }else {
          this.subscribeNext();
       }
       return;
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
