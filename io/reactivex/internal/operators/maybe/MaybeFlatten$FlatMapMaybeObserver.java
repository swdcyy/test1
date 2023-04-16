package io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.q;
import io.reactivex.internal.operators.maybe.MaybeFlatten$FlatMapMaybeObserver$a;
import drd.a;

public final class MaybeFlatten$FlatMapMaybeObserver extends AtomicReference implements p, b	// class@0012a1
{
    public final p actual;
    public b d;
    public final o mapper;
    public static final long serialVersionUID = 0x3cb9c044fe24c252;

    public void MaybeFlatten$FlatMapMaybeObserver(p p0,o p1){
       super();
       this.actual = p0;
       this.mapper = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
       this.d.dispose();
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
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       try{
          p0 = this.mapper.apply(p0);
          a.c(p0, "The mapper returned a null MaybeSource");
          if (!this.isDisposed()) {
             p0.b(new MaybeFlatten$FlatMapMaybeObserver$a(this));
          }
          return;
       }catch(java.lang.Exception e2){
          a.b(e2);
          this.actual.onError(e2);
          return;
       }
    }
}
