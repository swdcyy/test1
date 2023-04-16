package io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver$a;
import brd.p;
import io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;

public final class MaybeFlatten$FlatMapMaybeObserver$a implements p	// class@0012a0
{
    public final MaybeFlatten$FlatMapMaybeObserver b;

    public void MaybeFlatten$FlatMapMaybeObserver$a(MaybeFlatten$FlatMapMaybeObserver p0){
       this.b = p0;
       super();
    }
    public void onComplete(){
       this.b.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.b.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.b, p0);
    }
    public void onSuccess(Object p0){
       this.b.actual.onSuccess(p0);
    }
}
