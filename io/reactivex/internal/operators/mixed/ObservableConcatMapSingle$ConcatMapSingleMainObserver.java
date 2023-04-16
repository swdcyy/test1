package io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver;
import io.reactivex.internal.queue.a;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.n;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e0;
import brd.d0;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableConcatMapSingle$ConcatMapSingleMainObserver extends AtomicInteger implements y, b	// class@0012d3
{
    public boolean cancelled;
    public boolean done;
    public final y downstream;
    public final ErrorMode errorMode;
    public final AtomicThrowable errors;
    public final ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver inner;
    public Object item;
    public final o mapper;
    public final n queue;
    public int state;
    public b upstream;
    public static final long serialVersionUID = 0x8127c25b98b2725b;

    public void ObservableConcatMapSingle$ConcatMapSingleMainObserver(y p0,o p1,int p2,ErrorMode p3){
       super();
       this.downstream = p0;
       this.mapper = p1;
       this.errorMode = p3;
       this.errors = new AtomicThrowable();
       this.inner = new ObservableConcatMapSingle$ConcatMapSingleMainObserver$ConcatMapSingleObserver(this);
       this.queue = new a(p2);
    }
    public void dispose(){
       this.cancelled = true;
       this.upstream.dispose();
       this.inner.dispose();
       if (!this.getAndIncrement()) {
          this.queue.clear();
          this.item = null;
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableConcatMapSingle$ConcatMapSingleMainObserver tdownstream = this.downstream;
       ObservableConcatMapSingle$ConcatMapSingleMainObserver terrorMode = this.errorMode;
       ObservableConcatMapSingle$ConcatMapSingleMainObserver tqueue = this.queue;
       ObservableConcatMapSingle$ConcatMapSingleMainObserver terrors = this.errors;
       int i = 1;
       while (true) {
          Object obj = null;
          if (this.cancelled != null) {
             tqueue.clear();
             this.item = obj;
          }else {
             ObservableConcatMapSingle$ConcatMapSingleMainObserver tstate = this.state;
             if (terrors.get() != null && (terrorMode == ErrorMode.IMMEDIATE || (terrorMode == ErrorMode.BOUNDARY && tstate == null))) {
                tqueue.clear();
                this.item = obj;
                tdownstream.onError(terrors.terminate());
                return;
             }else {
                Object obj1 = null;
                if (tstate == null) {
                   tstate = this.done;
                   obj = tqueue.poll();
                   if (obj == null) {
                      obj1 = 1;
                   }
                   if (tstate != null && obj1) {
                      Throwable throwable = terrors.terminate();
                      if (throwable == null) {
                         tdownstream.onComplete();
                         break ;
                      }else {
                         tdownstream.onError(throwable);
                         break ;
                      }
                   }else if(obj1){
                      Object obj2 = this.mapper.apply(obj);
                      a.c(obj2, "The mapper returned a null SingleSource");
                      this.state = 1;
                      obj2.b(this.inner);
                   }
                }else if(tstate == 2){
                   tstate = this.item;
                   this.item = obj;
                   tdownstream.onNext(tstate);
                   this.state = obj1;
                }
             }
          }
          i = - i;
          if (!this.addAndGet(i)) {
             return;
          }
          continue ;
       }
       return;
    }
    public void innerError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          if (this.errorMode != ErrorMode.END) {
             this.upstream.dispose();
          }
          this.state = 0;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerSuccess(Object p0){
       this.item = p0;
       this.state = 2;
       this.drain();
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          if (this.errorMode == ErrorMode.IMMEDIATE) {
             this.inner.dispose();
          }
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       this.queue.offer(p0);
       this.drain();
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          this.downstream.onSubscribe(this);
       }
       return;
    }
}
