package io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import erd.o;
import io.reactivex.internal.operators.observable.ObservableConcatMap$SourceObserver$InnerObserver;
import io.reactivex.internal.fuseable.o;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import java.lang.Throwable;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.a;

public final class ObservableConcatMap$SourceObserver extends AtomicInteger implements y, b	// class@0012f4
{
    public boolean active;
    public final y actual;
    public final int bufferSize;
    public boolean disposed;
    public boolean done;
    public int fusionMode;
    public final ObservableConcatMap$SourceObserver$InnerObserver inner;
    public final o mapper;
    public o queue;
    public b s;
    public static final long serialVersionUID = 0x7a85719c209ca572;

    public void ObservableConcatMap$SourceObserver(y p0,o p1,int p2){
       super();
       this.actual = p0;
       this.mapper = p1;
       this.bufferSize = p2;
       this.inner = new ObservableConcatMap$SourceObserver$InnerObserver(p0, this);
    }
    public void dispose(){
       this.disposed = true;
       this.inner.dispose();
       this.s.dispose();
       if (!this.getAndIncrement()) {
          this.queue.clear();
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       while (true) {
          if (this.disposed != null) {
             this.queue.clear();
             return;
          }else if(this.active == null){
             ObservableConcatMap$SourceObserver tdone = this.done;
             Object obj = this.queue.poll();
             int i = (obj == null)? 1: 0;
             if (tdone != null && i) {
                this.disposed = true;
                this.actual.onComplete();
                return;
             }else if(!i){
                Object obj1 = this.mapper.apply(obj);
                a.c(obj1, "The mapper returned a null ObservableSource");
                this.active = true;
                obj1.subscribe(this.inner);
             }
          }
          if (!this.decrementAndGet()) {
             break ;
          }
       }
       return;
    }
    public void innerComplete(){
       this.active = false;
       this.drain();
    }
    public boolean isDisposed(){
       return this.disposed;
    }
    public void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.drain();
       return;
    }
    public void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else {
          this.done = true;
          this.dispose();
          this.actual.onError(p0);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       if (this.fusionMode == null) {
          this.queue.offer(p0);
       }
       this.drain();
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          if (p0 instanceof j) {
             int i = p0.requestFusion(3);
             boolean b = true;
             if (i == b) {
                this.fusionMode = i;
                this.queue = p0;
                this.done = b;
                this.actual.onSubscribe(this);
                this.drain();
                return;
             }else if(i == 2){
                this.fusionMode = i;
                this.queue = p0;
                this.actual.onSubscribe(this);
                return;
             }
          }
          this.queue = new a(this.bufferSize);
          this.actual.onSubscribe(this);
       }
       return;
    }
}
