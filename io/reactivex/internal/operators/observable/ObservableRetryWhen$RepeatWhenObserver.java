package io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import mrd.c;
import brd.w;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.operators.observable.ObservableRetryWhen$RepeatWhenObserver$InnerRepeatObserver;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.g;
import java.lang.Throwable;
import java.lang.Object;

public final class ObservableRetryWhen$RepeatWhenObserver extends AtomicInteger implements y, b	// class@001355
{
    public boolean active;
    public final y actual;
    public final AtomicReference d;
    public final AtomicThrowable error;
    public final ObservableRetryWhen$RepeatWhenObserver$InnerRepeatObserver inner;
    public final c signaller;
    public final w source;
    public final AtomicInteger wip;
    public static final long serialVersionUID = 0xb23eb3635d55cf6;

    public void ObservableRetryWhen$RepeatWhenObserver(y p0,c p1,w p2){
       super();
       this.actual = p0;
       this.signaller = p1;
       this.source = p2;
       this.wip = new AtomicInteger();
       this.error = new AtomicThrowable();
       this.inner = new ObservableRetryWhen$RepeatWhenObserver$InnerRepeatObserver(this);
       this.d = new AtomicReference();
    }
    public void dispose(){
       DisposableHelper.dispose(this.d);
       DisposableHelper.dispose(this.inner);
    }
    public void innerComplete(){
       DisposableHelper.dispose(this.d);
       g.a(this.actual, this, this.error);
    }
    public void innerError(Throwable p0){
       DisposableHelper.dispose(this.d);
       g.c(this.actual, p0, this, this.error);
    }
    public void innerNext(){
       this.subscribeNext();
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.d.get());
    }
    public void onComplete(){
       DisposableHelper.dispose(this.inner);
       g.a(this.actual, this, this.error);
    }
    public void onError(Throwable p0){
       this.active = false;
       this.signaller.onNext(p0);
    }
    public void onNext(Object p0){
       g.e(this.actual, p0, this, this.error);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this.d, p0);
    }
    public void subscribeNext(){
       if (!this.wip.getAndIncrement()) {
          while (true) {
             if (this.isDisposed()) {
                return;
             }
             if (this.active == null) {
                this.active = true;
                this.source.subscribe(this);
             }
             if (this.wip.decrementAndGet()) {
             }
          }
       }
       return;
    }
}