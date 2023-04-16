package io.reactivex.internal.operators.maybe.MaybeDoFinally$DoFinallyObserver;
import brd.p;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import erd.a;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import drd.a;
import ird.a;

public final class MaybeDoFinally$DoFinallyObserver extends AtomicInteger implements p, b	// class@001298
{
    public final p actual;
    public b d;
    public final a onFinally;
    public static final long serialVersionUID = 0x3907ba0b13897e3d;

    public void MaybeDoFinally$DoFinallyObserver(p p0,a p1){
       super();
       this.actual = p0;
       this.onFinally = p1;
    }
    public void dispose(){
       this.d.dispose();
       this.runFinally();
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public void onComplete(){
       this.actual.onComplete();
       this.runFinally();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
       this.runFinally();
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       this.actual.onSuccess(p0);
       this.runFinally();
    }
    public void runFinally(){
       if (this.compareAndSet(0, 1)) {
          this.onFinally.run();
       }
       return;
    }
}
