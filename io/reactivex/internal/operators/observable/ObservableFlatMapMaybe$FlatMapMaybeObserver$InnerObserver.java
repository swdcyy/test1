package io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$FlatMapMaybeObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver extends AtomicReference implements p, b	// class@00130c
{
    public final ObservableFlatMapMaybe$FlatMapMaybeObserver this$0;
    public static final long serialVersionUID = 0xf90689ef97a3c632;

    public void ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver(ObservableFlatMapMaybe$FlatMapMaybeObserver p0){
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
    public void onSuccess(Object p0){
       this.this$0.innerSuccess(this, p0);
    }
}