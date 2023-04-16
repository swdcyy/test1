package io.reactivex.internal.operators.mixed.CompletableAndThenObservable$AndThenObservableObserver;
import brd.y;
import brd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import brd.w;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class CompletableAndThenObservable$AndThenObservableObserver extends AtomicReference implements y, d, b	// class@0012c8
{
    public final y downstream;
    public w other;
    public static final long serialVersionUID = 0x83d160f5b9057b50;

    public void CompletableAndThenObservable$AndThenObservableObserver(y p0,w p1){
       super();
       this.other = p1;
       this.downstream = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       CompletableAndThenObservable$AndThenObservableObserver tother = this.other;
       if (tother == null) {
          this.downstream.onComplete();
       }else {
          this.other = null;
          tother.subscribe(this);
       }
       return;
    }
    public void onError(Throwable p0){
       this.downstream.onError(p0);
    }
    public void onNext(Object p0){
       this.downstream.onNext(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this, p0);
    }
}
