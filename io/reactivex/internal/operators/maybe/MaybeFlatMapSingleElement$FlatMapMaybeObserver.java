package io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement$FlatMapMaybeObserver;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e0;
import io.reactivex.internal.operators.maybe.MaybeFlatMapSingleElement$a;
import brd.d0;
import drd.a;

public final class MaybeFlatMapSingleElement$FlatMapMaybeObserver extends AtomicReference implements p, b	// class@00129d
{
    public final p actual;
    public final o mapper;
    public static final long serialVersionUID = 0x42ff881892d3c404;

    public void MaybeFlatMapSingleElement$FlatMapMaybeObserver(p p0,o p1){
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
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null SingleSource");
       p0.b(new MaybeFlatMapSingleElement$a(this, this.actual));
    }
}
