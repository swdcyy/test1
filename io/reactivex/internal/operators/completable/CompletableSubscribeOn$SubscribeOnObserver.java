package io.reactivex.internal.operators.completable.CompletableSubscribeOn$SubscribeOnObserver;
import brd.d;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicReference;
import brd.e;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class CompletableSubscribeOn$SubscribeOnObserver extends AtomicReference implements d, b, Runnable	// class@0011fb
{
    public final d actual;
    public final e source;
    public final SequentialDisposable task;
    public static final long serialVersionUID = 0x61283b9e254a3eaf;

    public void CompletableSubscribeOn$SubscribeOnObserver(d p0,e p1){
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
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void run(){
       this.source.a(this);
    }
}
