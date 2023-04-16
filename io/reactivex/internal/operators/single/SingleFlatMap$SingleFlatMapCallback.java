package io.reactivex.internal.operators.single.SingleFlatMap$SingleFlatMapCallback;
import brd.d0;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e0;
import io.reactivex.internal.operators.single.SingleFlatMap$SingleFlatMapCallback$a;
import drd.a;

public final class SingleFlatMap$SingleFlatMapCallback extends AtomicReference implements d0, b	// class@001464
{
    public final d0 actual;
    public final o mapper;
    public static final long serialVersionUID = 0x2d371b6f5a492ef4;

    public void SingleFlatMap$SingleFlatMapCallback(d0 p0,o p1){
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
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       p0 = this.mapper.apply(p0);
       a.c(p0, "The single returned by the mapper is null");
       if (!this.isDisposed()) {
          p0.b(new SingleFlatMap$SingleFlatMapCallback$a(this, this.actual));
       }
       return;
    }
}
