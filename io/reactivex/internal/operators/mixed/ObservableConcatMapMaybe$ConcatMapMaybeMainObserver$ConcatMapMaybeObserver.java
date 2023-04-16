package io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver;
import brd.p;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe$ConcatMapMaybeMainObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import crd.b;
import java.lang.Object;

public final class ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver extends AtomicReference implements p	// class@0012cf
{
    public final ObservableConcatMapMaybe$ConcatMapMaybeMainObserver parent;
    public static final long serialVersionUID = 0xd5a700f5220ae8bc;

    public void ObservableConcatMapMaybe$ConcatMapMaybeMainObserver$ConcatMapMaybeObserver(ObservableConcatMapMaybe$ConcatMapMaybeMainObserver p0){
       super();
       this.parent = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       this.parent.innerComplete();
    }
    public void onError(Throwable p0){
       this.parent.innerError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this, p0);
    }
    public void onSuccess(Object p0){
       this.parent.innerSuccess(p0);
    }
}
