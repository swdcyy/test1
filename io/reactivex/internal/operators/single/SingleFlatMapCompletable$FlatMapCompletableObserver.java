package io.reactivex.internal.operators.single.SingleFlatMapCompletable$FlatMapCompletableObserver;
import brd.d0;
import brd.d;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e;
import drd.a;

public final class SingleFlatMapCompletable$FlatMapCompletableObserver extends AtomicReference implements d0, d, b	// class@001466
{
    public final d actual;
    public final o mapper;
    public static final long serialVersionUID = 0xe1c948c7933b35bb;

    public void SingleFlatMapCompletable$FlatMapCompletableObserver(d p0,o p1){
       super();
       this.actual = p0;
       this.mapper = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       this.actual.onComplete();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this, p0);
    }
    public void onSuccess(Object p0){
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null CompletableSource");
       if (!this.isDisposed()) {
          p0.a(this);
       }
       return;
    }
}
