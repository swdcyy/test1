package io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver$OtherObserver;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import io.reactivex.internal.util.g;
import java.lang.Throwable;

public final class ObservableTakeUntil$TakeUntilMainObserver extends AtomicInteger implements y, b	// class@001375
{
    public final y downstream;
    public final AtomicThrowable error;
    public final ObservableTakeUntil$TakeUntilMainObserver$OtherObserver otherObserver;
    public final AtomicReference upstream;
    public static final long serialVersionUID = 0x13afb1a8379f6a45;

    public void ObservableTakeUntil$TakeUntilMainObserver(y p0){
       super();
       this.downstream = p0;
       this.upstream = new AtomicReference();
       this.otherObserver = new ObservableTakeUntil$TakeUntilMainObserver$OtherObserver(this);
       this.error = new AtomicThrowable();
    }
    public void dispose(){
       DisposableHelper.dispose(this.upstream);
       DisposableHelper.dispose(this.otherObserver);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.upstream.get());
    }
    public void onComplete(){
       DisposableHelper.dispose(this.otherObserver);
       g.a(this.downstream, this, this.error);
    }
    public void onError(Throwable p0){
       DisposableHelper.dispose(this.otherObserver);
       g.c(this.downstream, p0, this, this.error);
    }
    public void onNext(Object p0){
       g.e(this.downstream, p0, this, this.error);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.upstream, p0);
    }
    public void otherComplete(){
       DisposableHelper.dispose(this.upstream);
       g.a(this.downstream, this, this.error);
    }
    public void otherError(Throwable p0){
       DisposableHelper.dispose(this.upstream);
       g.c(this.downstream, p0, this, this.error);
    }
}
