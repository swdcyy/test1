package io.reactivex.internal.operators.maybe.MaybeDelayWithCompletable$a;
import brd.p;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class MaybeDelayWithCompletable$a implements p	// class@001296
{
    public final p actual;
    public final AtomicReference parent;

    public void MaybeDelayWithCompletable$a(AtomicReference p0,p p1){
       super();
       this.parent = p0;
       this.actual = p1;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this.parent, p0);
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}
