package io.reactivex.internal.operators.observable.ObservableScalarXMap$ScalarDisposable;
import io.reactivex.internal.fuseable.j;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import java.lang.Object;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class ObservableScalarXMap$ScalarDisposable extends AtomicInteger implements j, Runnable	// class@001360
{
    public final y observer;
    public final Object value;
    public static final long serialVersionUID = 0x35dc0e519322c4a3;

    public void ObservableScalarXMap$ScalarDisposable(y p0,Object p1){
       super();
       this.observer = p0;
       this.value = p1;
    }
    public void clear(){
       this.lazySet(3);
    }
    public void dispose(){
       this.set(3);
    }
    public boolean isDisposed(){
       boolean b = (this.get() == 3)? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = true;
       if (this.get() != b) {
       }else {
          b = false;
       }
       return b;
    }
    public boolean offer(Object p0){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public boolean offer(Object p0,Object p1){
       throw new UnsupportedOperationException("Should not be called!");
    }
    public Object poll(){
       if (this.get() != 1) {
          return null;
       }
       this.lazySet(3);
       return this.value;
    }
    public int requestFusion(int p0){
       if (!(p0 & 1)) {
          return 0;
       }
       this.lazySet(1);
       return 1;
    }
    public void run(){
       if (!this.get() && this.compareAndSet(0, 2)) {
          this.observer.onNext(this.value);
          if (this.get() == 2) {
             this.lazySet(3);
             this.observer.onComplete();
          }
       }
       return;
    }
}
