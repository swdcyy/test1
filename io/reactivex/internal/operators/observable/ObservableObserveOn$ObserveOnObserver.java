package io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver;
import brd.y;
import java.lang.Runnable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import brd.z$c;
import io.reactivex.internal.fuseable.o;
import java.lang.Throwable;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import io.reactivex.internal.queue.a;

public final class ObservableObserveOn$ObserveOnObserver extends BasicIntQueueDisposable implements y, Runnable	// class@0018a0
{
    public final y actual;
    public final int bufferSize;
    public boolean cancelled;
    public final boolean delayError;
    public boolean done;
    public Throwable error;
    public boolean outputFused;
    public o queue;
    public b s;
    public int sourceMode;
    public final z$c worker;
    public static final long serialVersionUID = 0x5b45d4a143741ca0;

    public void ObservableObserveOn$ObserveOnObserver(y p0,z$c p1,boolean p2,int p3){
       super();
       this.actual = p0;
       this.worker = p1;
       this.delayError = p2;
       this.bufferSize = p3;
    }
    public boolean checkTerminated(boolean p0,boolean p1,y p2){
       if (this.cancelled != null) {
          this.queue.clear();
          return true;
       }else if(p0){
          ObservableObserveOn$ObserveOnObserver terror = this.error;
          if (this.delayError != null) {
             if (p1) {
                if (terror != null) {
                   p2.onError(terror);
                }else {
                   p2.onComplete();
                }
                this.worker.dispose();
                return true;
             }
          }else if(terror != null){
             this.queue.clear();
             p2.onError(terror);
             this.worker.dispose();
             return true;
          }else if(p1){
             p2.onComplete();
             this.worker.dispose();
             return true;
          }
       }
       return false;
    }
    public void clear(){
       this.queue.clear();
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.dispose();
          this.worker.dispose();
          if (!this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public void drainFused(){
       ObservableObserveOn$ObserveOnObserver observeOnObs = 1;
       while (true) {
          if (this.cancelled != null) {
             return;
          }
          ObservableObserveOn$ObserveOnObserver tdone = this.done;
          ObservableObserveOn$ObserveOnObserver terror = this.error;
          if (this.delayError == null && (tdone != null && terror != null)) {
             this.actual.onError(terror);
             this.worker.dispose();
             return;
          }else {
             this.actual.onNext(null);
             if (tdone != null) {
                observeOnObs = this.error;
                if (observeOnObs != null) {
                   this.actual.onError(observeOnObs);
                   break ;
                }else {
                   this.actual.onComplete();
                   break ;
                }
             }else {
                int i = - observeOnObs;
                if (!this.addAndGet(i)) {
                   return;
                }
                continue ;
             }
          }
       }
       this.worker.dispose();
       return;
    }
    public void drainNormal(){
       boolean b;
       ObservableObserveOn$ObserveOnObserver tqueue = this.queue;
       ObservableObserveOn$ObserveOnObserver tactual = this.actual;
       int i = 1;
       while (true) {
          if (this.checkTerminated(this.done, tqueue.isEmpty(), tactual)) {
          }else {
             while (true) {
                ObservableObserveOn$ObserveOnObserver tdone = this.done;
                Object obj = tqueue.poll();
                if (obj == null) {
                   b = true;
                label_001e :
                   if (this.checkTerminated(tdone, b, tactual)) {
                      return;
                   }
                   if (b) {
                      i = - i;
                      if (!this.addAndGet(i)) {
                         return;
                      }
                      continue ;
                   }else {
                      tactual.onNext(obj);
                   }
                }else {
                   b = false;
                   goto label_001e ;
                }
             }
             return;
          }
       }
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public boolean isEmpty(){
       return this.queue.isEmpty();
    }
    public void onComplete(){
       if (this.done != null) {
          return;
       }
       this.done = true;
       this.schedule();
       return;
    }
    public void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else {
          this.error = p0;
          this.done = true;
          this.schedule();
          return;
       }
    }
    public void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       if (this.sourceMode != 2) {
          this.queue.offer(p0);
       }
       this.schedule();
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          if (p0 instanceof j) {
             int i = p0.requestFusion(7);
             boolean b = true;
             if (i == b) {
                this.sourceMode = i;
                this.queue = p0;
                this.done = b;
                this.actual.onSubscribe(this);
                this.schedule();
                return;
             }else if(i == 2){
                this.sourceMode = i;
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
    public Object poll(){
       return this.queue.poll();
    }
    public int requestFusion(int p0){
       if (!(p0 & 2)) {
          return 0;
       }
       this.outputFused = true;
       return 2;
    }
    public void run(){
       if (this.outputFused != null) {
          this.drainFused();
       }else {
          this.drainNormal();
       }
       return;
    }
    public void schedule(){
       if (!this.getAndIncrement()) {
          this.worker.b(this);
       }
       return;
    }
}
