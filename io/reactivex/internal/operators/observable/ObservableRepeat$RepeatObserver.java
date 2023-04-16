package io.reactivex.internal.operators.observable.ObservableRepeat$RepeatObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.disposables.SequentialDisposable;
import brd.w;
import java.lang.Throwable;
import java.lang.Object;
import crd.b;

public final class ObservableRepeat$RepeatObserver extends AtomicInteger implements y	// class@001338
{
    public final y actual;
    public long remaining;
    public final SequentialDisposable sd;
    public final w source;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void ObservableRepeat$RepeatObserver(y p0,long p1,SequentialDisposable p2,w p3){
       super();
       this.actual = p0;
       this.sd = p2;
       this.source = p3;
       this.remaining = p1;
    }
    public void onComplete(){
       ObservableRepeat$RepeatObserver tremaining = this.remaining;
       if (tremaining - Long.MAX_VALUE) {
          this.remaining = tremaining - 1;
       }
       if (tremaining) {
          this.subscribeNext();
       }else {
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       this.sd.replace(p0);
    }
    public void subscribeNext(){
       if (!this.getAndIncrement()) {
          int i = 1;
          while (true) {
             if (this.sd.isDisposed()) {
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
