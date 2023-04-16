package io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$FlatMapMaybeObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import erd.o;
import crd.a;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import io.reactivex.internal.queue.a;
import java.lang.Throwable;
import brd.t;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.q;
import brd.p;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableFlatMapMaybe$FlatMapMaybeObserver extends AtomicInteger implements y, b	// class@00130d
{
    public final AtomicInteger active;
    public final y actual;
    public boolean cancelled;
    public b d;
    public final boolean delayErrors;
    public final AtomicThrowable errors;
    public final o mapper;
    public final AtomicReference queue;
    public final a set;
    public static final long serialVersionUID = 0x775a28d5b42d01b7;

    public void ObservableFlatMapMaybe$FlatMapMaybeObserver(y p0,o p1,boolean p2){
       super();
       this.actual = p0;
       this.mapper = p1;
       this.delayErrors = p2;
       this.set = new a();
       this.errors = new AtomicThrowable();
       this.active = new AtomicInteger(1);
       this.queue = new AtomicReference();
    }
    public void clear(){
       a uoa = this.queue.get();
       if (uoa != null) {
          uoa.clear();
       }
       return;
    }
    public void dispose(){
       this.cancelled = true;
       this.d.dispose();
       this.set.dispose();
    }
    public void drain(){
       if (!this.getAndIncrement()) {
          this.drainLoop();
       }
       return;
    }
    public void drainLoop(){
       ObservableFlatMapMaybe$FlatMapMaybeObserver tactual = this.actual;
       ObservableFlatMapMaybe$FlatMapMaybeObserver tactive = this.active;
       ObservableFlatMapMaybe$FlatMapMaybeObserver tqueue = this.queue;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             this.clear();
             return;
          }else if(this.delayErrors == null && this.errors.get() != null){
             this.clear();
             tactual.onError(this.errors.terminate());
             return;
          }else {
             int i1 = 0;
             ObservableFlatMapMaybe$FlatMapMaybeObserver uFlatMapMayb = (!tactive.get())? 1: null;
             a uoa = tqueue.get();
             Object obj = (uoa != null)? uoa.poll(): null;
             if (obj == null) {
                i1 = 1;
             }
             if (uFlatMapMayb && i1) {
                Throwable throwable = this.errors.terminate();
                if (throwable != null) {
                   tactual.onError(throwable);
                   break ;
                }else {
                   tactual.onComplete();
                   break ;
                }
             }else if(i1){
                i = - i;
                if (!this.addAndGet(i)) {
                   return;
                }
             }else {
                tactual.onNext(obj);
             }
          }
       }
       return;
    }
    public a getOrCreateQueue(){
       a uoa;
       while (true) {
          uoa = this.queue.get();
          if (uoa != null) {
             return uoa;
          }
          uoa = new a(t.bufferSize());
          if (this.queue.compareAndSet(null, uoa)) {
             break ;
          }
       }
       return uoa;
    }
    public void innerComplete(ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver p0){
       this.set.b(p0);
       if (!this.get()) {
          int i = 0;
          if (this.compareAndSet(i, 1)) {
             if (!this.active.decrementAndGet()) {
                i = 1;
             }
             a uoa = this.queue.get();
             if (i && (uoa == null || uoa.isEmpty())) {
                Throwable throwable = this.errors.terminate();
                if (throwable != null) {
                   this.actual.onError(throwable);
                }else {
                   this.actual.onComplete();
                }
                return;
             }else if(!this.decrementAndGet()){
                return;
             }else {
                this.drainLoop();
             label_0055 :
                return;
             }
          }
       }
       this.active.decrementAndGet();
       this.drain();
       goto label_0055 ;
    }
    public void innerError(ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver p0,Throwable p1){
       this.set.b(p0);
       if (this.errors.addThrowable(p1)) {
          if (this.delayErrors == null) {
             this.d.dispose();
             this.set.dispose();
          }
          this.active.decrementAndGet();
          this.drain();
       }else {
          a.l(p1);
       }
       return;
    }
    public void innerSuccess(ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver p0,Object p1){
       this.set.b(p0);
       if (!this.get()) {
          int i = 0;
          if (this.compareAndSet(i, 1)) {
             this.actual.onNext(p1);
             if (!this.active.decrementAndGet()) {
                i = 1;
             }
             p1 = this.queue.get();
             if (i && (p1 == null || p1.isEmpty())) {
                Throwable throwable = this.errors.terminate();
                if (throwable != null) {
                   this.actual.onError(throwable);
                }else {
                   this.actual.onComplete();
                }
                return;
             }else if(!this.decrementAndGet()){
                return;
             }else {
             label_0063 :
                this.drainLoop();
                return;
             }
          }
       }
       a orCreateQueu = this.getOrCreateQueue();
       _monitor_enter(orCreateQueu);
       orCreateQueu.offer(p1);
       _monitor_exit(orCreateQueu);
       this.active.decrementAndGet();
       if (this.getAndIncrement()) {
          return;
       }else {
          goto label_0063 ;
       }
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       this.active.decrementAndGet();
       this.drain();
    }
    public void onError(Throwable p0){
       this.active.decrementAndGet();
       if (this.errors.addThrowable(p0)) {
          if (this.delayErrors == null) {
             this.set.dispose();
          }
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null MaybeSource");
       this.active.getAndIncrement();
       ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver uFlatMapMayb = new ObservableFlatMapMaybe$FlatMapMaybeObserver$InnerObserver(this);
       if (this.cancelled == null && this.set.c(uFlatMapMayb)) {
          p0.b(uFlatMapMayb);
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
