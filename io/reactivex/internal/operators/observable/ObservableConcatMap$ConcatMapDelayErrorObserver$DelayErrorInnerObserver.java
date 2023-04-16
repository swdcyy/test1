package io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableConcatMap$ConcatMapDelayErrorObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import io.reactivex.internal.util.AtomicThrowable;
import crd.b;
import ird.a;
import java.lang.Object;

public final class ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver extends AtomicReference implements y	// class@001887
{
    public final y actual;
    public final ObservableConcatMap$ConcatMapDelayErrorObserver parent;
    public static final long serialVersionUID = 0x245ca3bdfb16b82c;

    public void ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver(y p0,ObservableConcatMap$ConcatMapDelayErrorObserver p1){
       super();
       this.actual = p0;
       this.parent = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver tparent = this.parent;
       tparent.active = false;
       tparent.drain();
    }
    public void onError(Throwable p0){
       ObservableConcatMap$ConcatMapDelayErrorObserver$DelayErrorInnerObserver tparent = this.parent;
       if (tparent.error.addThrowable(p0)) {
          if (tparent.tillTheEnd == null) {
             tparent.d.dispose();
          }
          tparent.active = false;
          tparent.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       DisposableHelper.replace(this, p0);
    }
}
