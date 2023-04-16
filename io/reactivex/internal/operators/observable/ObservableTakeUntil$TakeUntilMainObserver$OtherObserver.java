package io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver$OtherObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import crd.b;

public final class ObservableTakeUntil$TakeUntilMainObserver$OtherObserver extends AtomicReference implements y	// class@001374
{
    public final ObservableTakeUntil$TakeUntilMainObserver this$0;
    public static final long serialVersionUID = 0x875ac1397ad30441;

    public void ObservableTakeUntil$TakeUntilMainObserver$OtherObserver(ObservableTakeUntil$TakeUntilMainObserver p0){
       this.this$0 = p0;
       super();
    }
    public void onComplete(){
       this.this$0.otherComplete();
    }
    public void onError(Throwable p0){
       this.this$0.otherError(p0);
    }
    public void onNext(Object p0){
       DisposableHelper.dispose(this);
       this.this$0.otherComplete();
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
