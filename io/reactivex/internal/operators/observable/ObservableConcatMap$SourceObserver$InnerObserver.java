package io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.Object;
import crd.b;

public final class ObservableConcatMap$SourceObserver$InnerObserver extends AtomicReference implements y	// class@0012f3
{
    public final y actual;
    public final ObservableConcatMap$SourceObserver parent;
    public static final long serialVersionUID = 0x989f8dabfe7ff127;

    public void ObservableConcatMap$SourceObserver$InnerObserver(y p0,ObservableConcatMap$SourceObserver p1){
       super();
       this.actual = p0;
       this.parent = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       this.parent.innerComplete();
    }
    public void onError(Throwable p0){
       this.parent.dispose();
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.set(this, p0);
    }
}
