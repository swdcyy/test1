package io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableGroupJoin$LeftRightObserver extends AtomicReference implements y, b	// class@001318
{
    public final boolean isLeft;
    public final ObservableGroupJoin$a parent;
    public static final long serialVersionUID = 0x1a24ec53e2780a15;

    public void ObservableGroupJoin$LeftRightObserver(ObservableGroupJoin$a p0,boolean p1){
       super();
       this.parent = p0;
       this.isLeft = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.parent.innerComplete(this);
    }
    public void onError(Throwable p0){
       this.parent.innerError(p0);
    }
    public void onNext(Object p0){
       this.parent.innerValue(this.isLeft, p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
