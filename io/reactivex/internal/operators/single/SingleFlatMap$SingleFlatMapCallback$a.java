package io.reactivex.internal.operators.single.SingleFlatMap$SingleFlatMapCallback$a;
import brd.d0;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;

public final class SingleFlatMap$SingleFlatMapCallback$a implements d0	// class@001463
{
    public final d0 actual;
    public final AtomicReference parent;

    public void SingleFlatMap$SingleFlatMapCallback$a(AtomicReference p0,d0 p1){
       super();
       this.parent = p0;
       this.actual = p1;
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
