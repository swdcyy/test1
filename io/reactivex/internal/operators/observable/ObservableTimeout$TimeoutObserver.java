package io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutObserver;
import brd.y;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableTimeout$a;
import java.util.concurrent.atomic.AtomicLong;
import erd.o;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer;
import drd.a;
import java.util.concurrent.TimeoutException;

public final class ObservableTimeout$TimeoutObserver extends AtomicLong implements y, b, ObservableTimeout$a	// class@00137b
{
    public final y actual;
    public final o itemTimeoutIndicator;
    public final SequentialDisposable task;
    public final AtomicReference upstream;
    public static final long serialVersionUID = 0x343e2a2afd6bc01e;

    public void ObservableTimeout$TimeoutObserver(y p0,o p1){
       super();
       this.actual = p0;
       this.itemTimeoutIndicator = p1;
       this.task = new SequentialDisposable();
       this.upstream = new AtomicReference();
    }
    public void dispose(){
       DisposableHelper.dispose(this.upstream);
       this.task.dispose();
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.upstream.get());
    }
    public void onComplete(){
       long l = Long.MAX_VALUE;
       if (this.getAndSet(l) - l) {
          this.task.dispose();
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       long l = Long.MAX_VALUE;
       if (this.getAndSet(l) - l) {
          this.task.dispose();
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       long l = this.get();
       if (l - Long.MAX_VALUE) {
          long l1 = 1 + l;
          if (this.compareAndSet(l, l1)) {
             b uob = this.task.get();
             if (uob != null) {
                uob.dispose();
             }
             this.actual.onNext(p0);
             p0 = this.itemTimeoutIndicator.apply(p0);
             a.c(p0, "The itemTimeoutIndicator returned a null ObservableSource.");
             ObservableTimeout$TimeoutConsumer timeoutConsu = new ObservableTimeout$TimeoutConsumer(l1, this);
             if (this.task.replace(timeoutConsu)) {
                p0.subscribe(timeoutConsu);
             }
             return;
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.upstream, p0);
    }
    public void onTimeout(long p0){
       if (this.compareAndSet(p0, Long.MAX_VALUE)) {
          DisposableHelper.dispose(this.upstream);
          this.actual.onError(new TimeoutException());
       }
       return;
    }
    public void onTimeoutError(long p0,Throwable p1){
       if (this.compareAndSet(p0, Long.MAX_VALUE)) {
          DisposableHelper.dispose(this.upstream);
          this.actual.onError(p1);
       }else {
          a.l(p1);
       }
       return;
    }
    public void startFirstTimeout(w p0){
       if (p0 != null) {
          ObservableTimeout$TimeoutConsumer timeoutConsu = new ObservableTimeout$TimeoutConsumer(0, this);
          if (this.task.replace(timeoutConsu)) {
             p0.subscribe(timeoutConsu);
          }
       }
       return;
    }
}
