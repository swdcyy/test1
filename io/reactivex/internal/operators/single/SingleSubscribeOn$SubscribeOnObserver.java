package io.reactivex.internal.operators.single.SingleSubscribeOn$SubscribeOnObserver;
import brd.d0;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.e0;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class SingleSubscribeOn$SubscribeOnObserver extends AtomicReference implements d0, b, Runnable	// class@001470
{
    public final d0 actual;
    public final e0 source;
    public final SequentialDisposable task;
    public static final long serialVersionUID = 0x61283b9e254a3eaf;

    public void SingleSubscribeOn$SubscribeOnObserver(d0 p0,e0 p1){
       super();
       this.actual = p0;
       this.source = p1;
       this.task = new SequentialDisposable();
    }
    public void dispose(){
       DisposableHelper.dispose(this);
       this.task.dispose();
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
    public void run(){
       this.source.b(this);
    }
}
