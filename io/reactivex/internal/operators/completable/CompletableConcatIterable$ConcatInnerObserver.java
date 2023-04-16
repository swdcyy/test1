package io.reactivex.internal.operators.completable.CompletableConcatIterable$ConcatInnerObserver;
import brd.d;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e;
import java.lang.Throwable;
import drd.a;
import crd.b;

public final class CompletableConcatIterable$ConcatInnerObserver extends AtomicInteger implements d	// class@0011f1
{
    public final d actual;
    public final SequentialDisposable sd;
    public final Iterator sources;
    public static final long serialVersionUID = 0x9175369ad52832b0;

    public void CompletableConcatIterable$ConcatInnerObserver(d p0,Iterator p1){
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
       CompletableConcatIterable$ConcatInnerObserver tsources = this.sources;
       while (true) {
          if (this.sd.isDisposed()) {
             return;
          }
          if (!tsources.hasNext()) {
             this.actual.onComplete();
             return;
          }else {
             Object obj = tsources.next();
             a.c(obj, "The CompletableSource returned is null");
             obj.a(this);
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
