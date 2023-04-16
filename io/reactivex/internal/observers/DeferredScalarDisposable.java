package io.reactivex.internal.observers.DeferredScalarDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;

public class DeferredScalarDisposable extends BasicIntQueueDisposable	// class@001857
{
    public final y actual;
    public Object value;
    public static final long serialVersionUID = 0xb3a36f07f1262b8f;

    public void DeferredScalarDisposable(y p0){
       super();
       this.actual = p0;
    }
    public final void clear(){
       this.lazySet(32);
       this.value = null;
    }
    public final void complete(){
       if (this.get() & 0x36) {
          return;
       }
       this.lazySet(2);
       this.actual.onComplete();
       return;
    }
    public final void complete(Object p0){
       int i = this.get();
       if (i & 0x36) {
          return;
       }
       DeferredScalarDisposable tactual = this.actual;
       if (i == 8) {
          this.value = p0;
          this.lazySet(16);
          tactual.onNext(null);
       }else {
          this.lazySet(2);
          tactual.onNext(p0);
       }
       if (this.get() != 4) {
          tactual.onComplete();
       }
       return;
    }
    public void dispose(){
       this.set(4);
       this.value = null;
    }
    public final void error(Throwable p0){
       if (this.get() & 0x36) {
          a.l(p0);
          return;
       }else {
          this.lazySet(2);
          this.actual.onError(p0);
          return;
       }
    }
    public final boolean isDisposed(){
       boolean b = (this.get() == 4)? true: false;
       return b;
    }
    public final boolean isEmpty(){
       boolean b = (this.get() != 16)? true: false;
       return b;
    }
    public final Object poll(){
       Object obj = null;
       if (this.get() != 16) {
          return obj;
       }
       DeferredScalarDisposable tvalue = this.value;
       this.value = obj;
       this.lazySet(32);
       return tvalue;
    }
    public final int requestFusion(int p0){
       if (!(p0 & 2)) {
          return 0;
       }
       this.lazySet(8);
       return 2;
    }
    public final boolean tryDispose(){
       boolean i = 4;
       i = (this.getAndSet(i) != i)? true: false;
       return i;
    }
}
