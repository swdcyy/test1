package io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver$InnerObserver;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle$FlatMapSingleObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableFlatMapSingle$FlatMapSingleObserver$InnerObserver extends AtomicReference implements d0, b	// class@00130f
{
    public final ObservableFlatMapSingle$FlatMapSingleObserver this$0;
    public static final long serialVersionUID = 0xf90689ef97a3c632;

    public void ObservableFlatMapSingle$FlatMapSingleObserver$InnerObserver(ObservableFlatMapSingle$FlatMapSingleObserver p0){
       this.this$0 = p0;
       super();
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onError(Throwable p0){
       this.this$0.innerError(this, p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void onSuccess(Object p0){
       this.this$0.innerSuccess(this, p0);
    }
}
