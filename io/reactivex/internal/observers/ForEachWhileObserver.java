package io.reactivex.internal.observers.ForEachWhileObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import erd.r;
import erd.g;
import erd.a;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.exceptions.CompositeException;

public final class ForEachWhileObserver extends AtomicReference implements y, b	// class@0011dd
{
    public boolean done;
    public final a onComplete;
    public final g onError;
    public final r onNext;
    public static final long serialVersionUID = 0xc2e4c3150d5fa078;

    public void ForEachWhileObserver(r p0,g p1,a p2){
       super();
       this.onNext = p0;
       this.onError = p1;
       this.onComplete = p2;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.onComplete.run();
       return;
    }
    public void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else {
          this.done = true;
          this.onError.accept(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       if (!this.onNext.test(p0)) {
          this.dispose();
          this.onComplete();
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
}
