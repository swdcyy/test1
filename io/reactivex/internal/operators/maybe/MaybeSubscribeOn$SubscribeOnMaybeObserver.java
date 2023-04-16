package io.reactivex.internal.operators.maybe.MaybeSubscribeOn$SubscribeOnMaybeObserver;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class MaybeSubscribeOn$SubscribeOnMaybeObserver extends AtomicReference implements p, b	// class@0012a8
{
    public final p actual;
    public final SequentialDisposable task;
    public static final long serialVersionUID = 0x76f356c87ebda749;

    public void MaybeSubscribeOn$SubscribeOnMaybeObserver(p p0){
       super();
       this.actual = p0;
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
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}
