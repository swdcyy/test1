package io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver;
import brd.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import crd.b;

public final class ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver extends AtomicReference implements d	// class@0012cc
{
    public final ObservableConcatMapCompletable$ConcatMapCompletableObserver parent;
    public static final long serialVersionUID = 0x4e3f736d9160236f;

    public void ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver(ObservableConcatMapCompletable$ConcatMapCompletableObserver p0){
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
}
