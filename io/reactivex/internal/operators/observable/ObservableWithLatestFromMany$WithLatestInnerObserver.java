package io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.Object;
import crd.b;

public final class ObservableWithLatestFromMany$WithLatestInnerObserver extends AtomicReference implements y	// class@001396
{
    public boolean hasValue;
    public final int index;
    public final ObservableWithLatestFromMany$WithLatestFromObserver parent;
    public static final long serialVersionUID = 0x2d3210de62c61a18;

    public void ObservableWithLatestFromMany$WithLatestInnerObserver(ObservableWithLatestFromMany$WithLatestFromObserver p0,int p1){
       super();
       this.parent = p0;
       this.index = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       this.parent.innerComplete(this.index, this.hasValue);
    }
    public void onError(Throwable p0){
       this.parent.innerError(this.index, p0);
    }
    public void onNext(Object p0){
       if (this.hasValue == null) {
          this.hasValue = true;
       }
       this.parent.innerNext(this.index, p0);
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
