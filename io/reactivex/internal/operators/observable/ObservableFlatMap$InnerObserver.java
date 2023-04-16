package io.reactivex.internal.operators.observable.ObservableFlatMap$InnerObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableFlatMap$MergeObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import io.reactivex.internal.util.AtomicThrowable;
import ird.a;
import java.lang.Object;
import crd.b;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;

public final class ObservableFlatMap$InnerObserver extends AtomicReference implements y	// class@001892
{
    public boolean done;
    public int fusionMode;
    public final long id;
    public final ObservableFlatMap$MergeObserver parent;
    public o queue;
    public static final long serialVersionUID = 0xc01393a8d0182fd9;

    public void ObservableFlatMap$InnerObserver(ObservableFlatMap$MergeObserver p0,long p1){
       super();
       this.id = p1;
       this.parent = p0;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       this.done = true;
       this.parent.drain();
    }
    public void onError(Throwable p0){
       if (this.parent.errors.addThrowable(p0)) {
          ObservableFlatMap$InnerObserver tparent = this.parent;
          if (tparent.delayErrors == null) {
             tparent.disposeAll();
          }
          this.done = true;
          this.parent.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.fusionMode == null) {
          this.parent.tryEmit(p0, this);
       }else {
          this.parent.drain();
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0) && p0 instanceof j) {
          int i = p0.requestFusion(7);
          boolean b = true;
          if (i == b) {
             this.fusionMode = i;
             this.queue = p0;
             this.done = b;
             this.parent.drain();
             return;
          }else if(i == 2){
             this.fusionMode = i;
             this.queue = p0;
          }
       }
       return;
    }
}
