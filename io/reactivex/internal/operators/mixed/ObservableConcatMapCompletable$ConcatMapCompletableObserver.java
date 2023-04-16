package io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.d;
import erd.o;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e;
import drd.a;
import io.reactivex.internal.util.ExceptionHelper;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.a;

public final class ObservableConcatMapCompletable$ConcatMapCompletableObserver extends AtomicInteger implements y, b	// class@0012cd
{
    public boolean active;
    public boolean disposed;
    public boolean done;
    public final d downstream;
    public final ErrorMode errorMode;
    public final AtomicThrowable errors;
    public final ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver inner;
    public final o mapper;
    public final int prefetch;
    public o queue;
    public b upstream;
    public static final long serialVersionUID = 0x321c7f6dd838d46a;

    public void ObservableConcatMapCompletable$ConcatMapCompletableObserver(d p0,o p1,ErrorMode p2,int p3){
       super();
       this.downstream = p0;
       this.mapper = p1;
       this.errorMode = p2;
       this.prefetch = p3;
       this.errors = new AtomicThrowable();
       this.inner = new ObservableConcatMapCompletable$ConcatMapCompletableObserver$ConcatMapInnerObserver(this);
    }
    public void dispose(){
       this.disposed = true;
       this.upstream.dispose();
       this.inner.dispose();
       if (!this.getAndIncrement()) {
          this.queue.clear();
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableConcatMapCompletable$ConcatMapCompletableObserver terrors = this.errors;
       ObservableConcatMapCompletable$ConcatMapCompletableObserver terrorMode = this.errorMode;
       while (true) {
          if (this.disposed != null) {
             this.queue.clear();
             return;
          }else if(this.active == null){
             if (terrorMode == ErrorMode.BOUNDARY && terrors.get() != null) {
                this.disposed = true;
                this.queue.clear();
                this.downstream.onError(terrors.terminate());
                return;
             }else {
                ObservableConcatMapCompletable$ConcatMapCompletableObserver tdone = this.done;
                ObservableConcatMapCompletable$ConcatMapCompletableObserver uConcatMapCo = null;
                ObservableConcatMapCompletable$ConcatMapCompletableObserver obj = this.queue.poll();
                if (obj != null) {
                   uConcatMapCo = this.mapper.apply(obj);
                   a.c(uConcatMapCo, "The mapper returned a null CompletableSource");
                   obj = null;
                }else {
                   obj = 1;
                }
                if (tdone != null && obj) {
                   this.disposed = true;
                   Throwable throwable = terrors.terminate();
                   if (throwable != null) {
                      this.downstream.onError(throwable);
                      break ;
                   }else {
                      this.downstream.onComplete();
                      break ;
                   }
                }else if(!obj){
                   this.active = true;
                   uConcatMapCo.a(this.inner);
                }
             }
          }
          if (!this.decrementAndGet()) {
             return;
          }
       }
       return;
    }
    public void innerComplete(){
       this.active = false;
       this.drain();
    }
    public void innerError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          if (this.errorMode == ErrorMode.IMMEDIATE) {
             this.disposed = true;
             this.upstream.dispose();
             p0 = this.errors.terminate();
             if (p0 != ExceptionHelper.a) {
                this.downstream.onError(p0);
             }
             if (!this.getAndIncrement()) {
                this.queue.clear();
             }
          }else {
             this.active = false;
             this.drain();
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public boolean isDisposed(){
       return this.disposed;
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          if (this.errorMode == ErrorMode.IMMEDIATE) {
             this.disposed = true;
             this.inner.dispose();
             p0 = this.errors.terminate();
             if (p0 != ExceptionHelper.a) {
                this.downstream.onError(p0);
             }
             if (!this.getAndIncrement()) {
                this.queue.clear();
             }
          }else {
             this.done = true;
             this.drain();
          }
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (p0 != null) {
          this.queue.offer(p0);
       }
       this.drain();
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          if (p0 instanceof j) {
             int i = p0.requestFusion(3);
             boolean b = true;
             if (i == b) {
                this.queue = p0;
                this.done = b;
                this.downstream.onSubscribe(this);
                this.drain();
                return;
             }else if(i == 2){
                this.queue = p0;
                this.downstream.onSubscribe(this);
                return;
             }
          }
          this.queue = new a(this.prefetch);
          this.downstream.onSubscribe(this);
       }
       return;
    }
}
