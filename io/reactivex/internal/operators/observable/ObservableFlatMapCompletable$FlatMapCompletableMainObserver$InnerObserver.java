package io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver;
import brd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$FlatMapCompletableMainObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver extends AtomicReference implements d, b	// class@001306
{
    public final ObservableFlatMapCompletable$FlatMapCompletableMainObserver this$0;
    public static final long serialVersionUID = 0x77710b9f43210614;

    public void ObservableFlatMapCompletable$FlatMapCompletableMainObserver$InnerObserver(ObservableFlatMapCompletable$FlatMapCompletableMainObserver p0){
       this.this$0 = p0;
       super();
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.this$0.innerComplete(this);
    }
    public void onError(Throwable p0){
       this.this$0.innerError(this, p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
