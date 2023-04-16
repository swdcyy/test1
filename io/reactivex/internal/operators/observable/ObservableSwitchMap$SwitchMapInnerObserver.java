package io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver;
import brd.y;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.fuseable.o;
import crd.b;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.a;

public final class ObservableSwitchMap$SwitchMapInnerObserver extends AtomicReference implements y	// class@00136d
{
    public final int bufferSize;
    public boolean done;
    public final long index;
    public final ObservableSwitchMap$SwitchMapObserver parent;
    public o queue;
    public static final long serialVersionUID = 0x3540c639803a63b9;

    public void ObservableSwitchMap$SwitchMapInnerObserver(ObservableSwitchMap$SwitchMapObserver p0,long p1,int p2){
       super();
       this.parent = p0;
       this.index = p1;
       this.bufferSize = p2;
    }
    public void cancel(){
       DisposableHelper.dispose(this);
    }
    public void onComplete(){
       if (!this.index - this.parent.unique) {
          this.done = true;
          this.parent.drain();
       }
       return;
    }
    public void onError(Throwable p0){
       this.parent.innerError(this, p0);
    }
    public void onNext(Object p0){
       if (!this.index - this.parent.unique) {
          if (p0 != null) {
             this.queue.offer(p0);
          }
          this.parent.drain();
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          if (p0 instanceof j) {
             int i = p0.requestFusion(7);
             boolean b = true;
             if (i == b) {
                this.queue = p0;
                this.done = b;
                this.parent.drain();
                return;
             }else if(i == 2){
                this.queue = p0;
                return;
             }
          }
          this.queue = new a(this.bufferSize);
       }
       return;
    }
}
