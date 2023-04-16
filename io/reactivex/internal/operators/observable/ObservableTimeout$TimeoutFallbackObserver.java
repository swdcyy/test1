package io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutFallbackObserver;
import brd.y;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableTimeout$a;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import brd.w;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.ObservableTimeout$TimeoutConsumer;
import drd.a;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$a;

public final class ObservableTimeout$TimeoutFallbackObserver extends AtomicReference implements y, b, ObservableTimeout$a	// class@00137a
{
    public final y actual;
    public w fallback;
    public final AtomicLong index;
    public final o itemTimeoutIndicator;
    public final SequentialDisposable task;
    public final AtomicReference upstream;
    public static final long serialVersionUID = 0x97ccd7903b241ceb;

    public void ObservableTimeout$TimeoutFallbackObserver(y p0,o p1,w p2){
       super();
       this.actual = p0;
       this.itemTimeoutIndicator = p1;
       this.task = new SequentialDisposable();
       this.fallback = p2;
       this.index = new AtomicLong();
       this.upstream = new AtomicReference();
    }
    public void dispose(){
       DisposableHelper.dispose(this.upstream);
       DisposableHelper.dispose(this);
       this.task.dispose();
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       if (this.index.getAndSet(Long.MAX_VALUE) - Long.MAX_VALUE) {
          this.task.dispose();
          this.actual.onComplete();
          this.task.dispose();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.index.getAndSet(Long.MAX_VALUE) - Long.MAX_VALUE) {
          this.task.dispose();
          this.actual.onError(p0);
          this.task.dispose();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       long l = this.index.get();
       if (l - Long.MAX_VALUE) {
          long l1 = 1 + l;
          if (this.index.compareAndSet(l, l1)) {
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
       if (this.index.compareAndSet(p0, Long.MAX_VALUE)) {
          DisposableHelper.dispose(this.upstream);
          ObservableTimeout$TimeoutFallbackObserver tTimeoutFall = this.fallback;
          this.fallback = null;
          tTimeoutFall.subscribe(new ObservableTimeoutTimed$a(this.actual, this));
       }
       return;
    }
    public void onTimeoutError(long p0,Throwable p1){
       if (this.index.compareAndSet(p0, Long.MAX_VALUE)) {
          DisposableHelper.dispose(this);
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
