package io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.o;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Exception;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.q;
import io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver$a;
import drd.a;
import io.reactivex.exceptions.CompositeException;

public final class MaybeOnErrorNext$OnErrorNextMaybeObserver extends AtomicReference implements p, b	// class@0012a6
{
    public final p actual;
    public final boolean allowFatal;
    public final o resumeFunction;
    public static final long serialVersionUID = 0x1c20005a00f70a2c;

    public void MaybeOnErrorNext$OnErrorNextMaybeObserver(p p0,o p1,boolean p2){
       super();
       this.actual = p0;
       this.resumeFunction = p1;
       this.allowFatal = p2;
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
       if (this.allowFatal == null && !p0 instanceof Exception) {
          this.actual.onError(p0);
          return;
       }else {
          Object obj = this.resumeFunction.apply(p0);
          a.c(obj, "The resumeFunction returned a null MaybeSource");
          DisposableHelper.replace(this, null);
          obj.b(new MaybeOnErrorNext$OnErrorNextMaybeObserver$a(this.actual, this));
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
    }
}
