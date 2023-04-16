package io.reactivex.internal.operators.observable.ObservableGroupBy$State;
import crd.b;
import brd.w;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.queue.a;
import brd.y;
import java.lang.Throwable;
import java.lang.IllegalStateException;
import java.lang.String;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservableGroupBy$State extends AtomicInteger implements b, w	// class@001313
{
    public final AtomicReference actual;
    public final AtomicBoolean cancelled;
    public final boolean delayError;
    public boolean done;
    public Throwable error;
    public final Object key;
    public final AtomicBoolean once;
    public final ObservableGroupBy$GroupByObserver parent;
    public final a queue;
    public static final long serialVersionUID = 0xca89d5b4454ceac8;

    public void ObservableGroupBy$State(int p0,ObservableGroupBy$GroupByObserver p1,Object p2,boolean p3){
       super();
       this.cancelled = new AtomicBoolean();
       this.once = new AtomicBoolean();
       this.actual = new AtomicReference();
       this.queue = new a(p0);
       this.parent = p1;
       this.key = p2;
       this.delayError = p3;
    }
    public boolean checkTerminated(boolean p0,boolean p1,y p2,boolean p3){
       ObservableGroupBy$State terror;
       if (this.cancelled.get()) {
          this.queue.clear();
          this.parent.cancel(this.key);
          this.actual.lazySet(null);
          return true;
       }else if(p0){
          if (p3) {
             if (p1) {
                terror = this.error;
                this.actual.lazySet(null);
                if (terror != null) {
                   p2.onError(terror);
                }else {
                   p2.onComplete();
                }
                return true;
             }
          }else {
             terror = this.error;
             if (terror != null) {
                this.queue.clear();
                this.actual.lazySet(null);
                p2.onError(terror);
                return true;
             }else if(p1){
                this.actual.lazySet(null);
                p2.onComplete();
                return true;
             }
          }
       }
       return false;
    }
    public void dispose(){
       if (this.cancelled.compareAndSet(false, true) && !this.getAndIncrement()) {
          this.actual.lazySet(null);
          this.parent.cancel(this.key);
       }
       return;
    }
    public void drain(){
       boolean b;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableGroupBy$State tqueue = this.queue;
       ObservableGroupBy$State tdelayError = this.delayError;
       y oy = this.actual.get();
       int i = 1;
    label_0015 :
       if (oy != null) {
          while (true) {
             ObservableGroupBy$State tdone = this.done;
             Object obj = tqueue.poll();
             if (obj == null) {
                b = true;
             label_0022 :
                if (this.checkTerminated(tdone, b, oy, tdelayError)) {
                   break ;
                }else if(b){
                   oy.onNext(obj);
                }
             }else {
                b = false;
                goto label_0022 ;
             }
          }
          return;
       }
       i = - i;
       if (!this.addAndGet(i)) {
          return;
       }else if(oy == null){
          oy = this.actual.get();
          goto label_0015 ;
       }else {
          goto label_0015 ;
       }
    }
    public boolean isDisposed(){
       return this.cancelled.get();
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       this.error = p0;
       this.done = true;
       this.drain();
    }
    public void onNext(Object p0){
       this.queue.offer(p0);
       this.drain();
    }
    public void subscribe(y p0){
       if (this.once.compareAndSet(false, true)) {
          p0.onSubscribe(this);
          this.actual.lazySet(p0);
          if (this.cancelled.get()) {
             this.actual.lazySet(null);
          }else {
             this.drain();
          }
       }else {
          EmptyDisposable.error(new IllegalStateException("Only one Observer allowed!"), p0);
       }
       return;
    }
}
