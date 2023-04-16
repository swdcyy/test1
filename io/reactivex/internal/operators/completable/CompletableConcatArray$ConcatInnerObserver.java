package io.reactivex.internal.operators.completable.CompletableConcatArray$ConcatInnerObserver;
import brd.d;
import java.util.concurrent.atomic.AtomicInteger;
import brd.e;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Throwable;
import crd.b;

public final class CompletableConcatArray$ConcatInnerObserver extends AtomicInteger implements d	// class@0011ef
{
    public final d actual;
    public int index;
    public final SequentialDisposable sd;
    public final e[] sources;
    public static final long serialVersionUID = 0x9175369ad52832b0;

    public void CompletableConcatArray$ConcatInnerObserver(d p0,e[] p1){
       super();
       this.actual = p0;
       this.sources = p1;
       this.sd = new SequentialDisposable();
    }
    public void next(){
       if (this.sd.isDisposed()) {
          return;
       }
       if (this.getAndIncrement()) {
          return;
       }
       CompletableConcatArray$ConcatInnerObserver tsources = this.sources;
       while (true) {
          if (this.sd.isDisposed()) {
             return;
          }
          CompletableConcatArray$ConcatInnerObserver tindex = this.index;
          int i = tindex + 1;
          this.index = i;
          if (tindex == tsources.length) {
             this.actual.onComplete();
             return;
          }else {
             tsources[tindex].a(this);
             if (!this.decrementAndGet()) {
                break ;
             }
          }
       }
       return;
    }
    public void onComplete(){
       this.next();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       this.sd.replace(p0);
    }
}
