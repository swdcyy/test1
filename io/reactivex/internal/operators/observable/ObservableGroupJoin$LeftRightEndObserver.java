package io.reactivex.internal.operators.observable.ObservableGroupJoin$LeftRightEndObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableGroupJoin$a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;

public final class ObservableGroupJoin$LeftRightEndObserver extends AtomicReference implements y, b	// class@001317
{
    public final int index;
    public final boolean isLeft;
    public final ObservableGroupJoin$a parent;
    public static final long serialVersionUID = 0x1a24ec53e2780a15;

    public void ObservableGroupJoin$LeftRightEndObserver(ObservableGroupJoin$a p0,boolean p1,int p2){
       super();
       this.parent = p0;
       this.isLeft = p1;
       this.index = p2;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.parent.innerClose(this.isLeft, this);
    }
    public void onError(Throwable p0){
       this.parent.innerCloseError(p0);
    }
    public void onNext(Object p0){
       if (DisposableHelper.dispose(this)) {
          this.parent.innerClose(this.isLeft, this);
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
