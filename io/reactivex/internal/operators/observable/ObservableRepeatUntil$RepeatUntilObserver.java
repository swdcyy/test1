package io.reactivex.internal.operators.observable.ObservableRepeatUntil$RepeatUntilObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import erd.e;
import io.reactivex.internal.disposables.SequentialDisposable;
import brd.w;
import java.lang.Throwable;
import drd.a;
import java.lang.Object;
import crd.b;

public final class ObservableRepeatUntil$RepeatUntilObserver extends AtomicInteger implements y	// class@00133a
{
    public final y actual;
    public final SequentialDisposable sd;
    public final w source;
    public final e stop;
    public static final long serialVersionUID = 0x9d7d8e56979d0010;

    public void ObservableRepeatUntil$RepeatUntilObserver(y p0,e p1,SequentialDisposable p2,w p3){
       super();
       this.actual = p0;
       this.sd = p2;
       this.source = p3;
       this.stop = p1;
    }
    public void onComplete(){
       if (this.stop.a()) {
          this.actual.onComplete();
       }else {
          this.subscribeNext();
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
          do {
             this.source.subscribe(this);
             i = - i;
          } while (!this.addAndGet(i));
       }
       return;
    }
}
