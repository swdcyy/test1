package io.reactivex.internal.operators.observable.ObservableCombineLatest$CombinerObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableCombineLatest$LatestCoordinator;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.Object;
import crd.b;

public final class ObservableCombineLatest$CombinerObserver extends AtomicReference implements y	// class@0012f0
{
    public final int index;
    public final ObservableCombineLatest$LatestCoordinator parent;
    public static final long serialVersionUID = 0xbd0eb6f2c0fa37ab;

    public void ObservableCombineLatest$CombinerObserver(ObservableCombineLatest$LatestCoordinator p0,int p1){
       super();
       this.parent = p0;
       this.index = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       this.parent.innerComplete(this.index);
    }
    public void onError(Throwable p0){
       this.parent.innerError(this.index, p0);
    }
    public void onNext(Object p0){
       this.parent.innerNext(this.index, p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
