package io.reactivex.internal.operators.observable.ObservableSubscribeOn$SubscribeOnObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableSubscribeOn$SubscribeOnObserver extends AtomicReference implements y, b	// class@0018b8
{
    public final y actual;
    public final AtomicReference s;
    public static final long serialVersionUID = 0x70559c6a66be0138;

    public void ObservableSubscribeOn$SubscribeOnObserver(y p0){
       super();
       this.actual = p0;
       this.s = new AtomicReference();
    }
    public void dispose(){
       DisposableHelper.dispose(this.s);
       DisposableHelper.dispose(this);
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
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.s, p0);
    }
    public void setDisposable(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
