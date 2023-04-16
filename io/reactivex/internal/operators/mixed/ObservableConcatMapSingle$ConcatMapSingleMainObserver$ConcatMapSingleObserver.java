package io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver;
import brd.d0;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import crd.b;
import java.lang.Object;

public final class ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver extends AtomicReference implements d0	// class@0012d2
{
    public final ObservableConcatMapSingle$ConcatMapSingleMainObserver parent;
    public static final long serialVersionUID = 0xd5a700f5220ae8bc;

    public void ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver(ObservableConcatMapSingle$ConcatMapSingleMainObserver p0){
       super();
       this.parent = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
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
