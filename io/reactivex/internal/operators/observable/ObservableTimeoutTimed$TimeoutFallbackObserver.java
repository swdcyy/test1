package io.reactivex.internal.operators.observable.ObservableTimeoutTimed$TimeoutFallbackObserver;
import brd.y;
import crd.b;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.TimeUnit;
import brd.z$c;
import brd.w;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicLong;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$a;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed$c;
import java.lang.Runnable;

public final class ObservableTimeoutTimed$TimeoutFallbackObserver extends AtomicReference implements y, b, ObservableTimeoutTimed$b	// class@00137e
{
    public final y actual;
    public w fallback;
    public final AtomicLong index;
    public final SequentialDisposable task;
    public final long timeout;
    public final TimeUnit unit;
    public final AtomicReference upstream;
    public final z$c worker;
    public static final long serialVersionUID = 0x343e2a2afd6bc01e;

    public void ObservableTimeoutTimed$TimeoutFallbackObserver(y p0,long p1,TimeUnit p2,z$c p3,w p4){
       super();
       this.actual = p0;
       this.timeout = p1;
       this.unit = p2;
       this.worker = p3;
       this.fallback = p4;
       this.task = new SequentialDisposable();
       this.index = new AtomicLong();
       this.upstream = new AtomicReference();
    }
    public void dispose(){
       DisposableHelper.dispose(this.upstream);
       DisposableHelper.dispose(this);
       this.worker.dispose();
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       if (this.index.getAndSet(Long.MAX_VALUE) - Long.MAX_VALUE) {
          this.task.dispose();
          this.actual.onComplete();
          this.worker.dispose();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.index.getAndSet(Long.MAX_VALUE) - Long.MAX_VALUE) {
          this.task.dispose();
          this.actual.onError(p0);
          this.worker.dispose();
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
             this.task.get().dispose();
             this.actual.onNext(p0);
             this.startTimeout(l1);
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
          ObservableTimeoutTimed$TimeoutFallbackObserver tTimeoutFall = this.fallback;
          this.fallback = null;
          tTimeoutFall.subscribe(new ObservableTimeoutTimed$a(this.actual, this));
          this.worker.dispose();
       }
       return;
    }
    public void startTimeout(long p0){
       this.task.replace(this.worker.c(new ObservableTimeoutTimed$c(p0, this), this.timeout, this.unit));
    }
}
