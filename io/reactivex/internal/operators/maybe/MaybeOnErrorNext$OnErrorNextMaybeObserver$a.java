package io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver$a;
import brd.p;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class MaybeOnErrorNext$OnErrorNextMaybeObserver$a implements p	// class@0012a5
{
    public final p actual;
    public final AtomicReference b;

    public void MaybeOnErrorNext$OnErrorNextMaybeObserver$a(p p0,AtomicReference p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.b, p0);
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}
