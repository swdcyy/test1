package io.reactivex.internal.observers.InnerQueuedObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.observers.j;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.fuseable.o;
import io.reactivex.internal.util.m;

public final class InnerQueuedObserver extends AtomicReference implements y, b	// class@0011de
{
    public boolean done;
    public int fusionMode;
    public final j parent;
    public final int prefetch;
    public o queue;
    public static final long serialVersionUID = 0xb4d24c6f8c4d0573;

    public void InnerQueuedObserver(j p0,int p1){
       super();
       this.parent = p0;
       this.prefetch = p1;
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public int fusionMode(){
       return this.fusionMode;
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public boolean isDone(){
       return this.done;
    }
    public void onComplete(){
       this.parent.innerComplete(this);
    }
    public void onError(Throwable p0){
       this.parent.innerError(this, p0);
    }
    public void onNext(Object p0){
       if (this.fusionMode == null) {
          this.parent.innerNext(this, p0);
       }else {
          this.parent.drain();
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          if (p0 instanceof j) {
             int i = p0.requestFusion(3);
             boolean b = true;
             if (i == b) {
                this.fusionMode = i;
                this.queue = p0;
                this.done = b;
                this.parent.innerComplete(this);
                return;
             }else if(i == 2){
                this.fusionMode = i;
                this.queue = p0;
                return;
             }
          }
          this.queue = m.b((- this.prefetch));
       }
       return;
    }
    public o queue(){
       return this.queue;
    }
    public void setDone(){
       this.done = true;
    }
}
