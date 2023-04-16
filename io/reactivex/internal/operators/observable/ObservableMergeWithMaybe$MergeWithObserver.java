package io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe$MergeWithObserver$OtherObserver;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.n;
import io.reactivex.internal.queue.a;
import brd.t;
import ird.a;
import io.reactivex.internal.fuseable.o;

public final class ObservableMergeWithMaybe$MergeWithObserver extends AtomicInteger implements y, b	// class@001325
{
    public final y actual;
    public boolean disposed;
    public final AtomicThrowable error;
    public final AtomicReference mainDisposable;
    public boolean mainDone;
    public final ObservableMergeWithMaybe$MergeWithObserver$OtherObserver otherObserver;
    public int otherState;
    public n queue;
    public Object singleItem;
    public static final long serialVersionUID = 0xc042756724718909;

    public void ObservableMergeWithMaybe$MergeWithObserver(y p0){
       super();
       this.actual = p0;
       this.mainDisposable = new AtomicReference();
       this.otherObserver = new ObservableMergeWithMaybe$MergeWithObserver$OtherObserver(this);
       this.error = new AtomicThrowable();
    }
    public void dispose(){
       this.disposed = true;
       DisposableHelper.dispose(this.mainDisposable);
       DisposableHelper.dispose(this.otherObserver);
       if (!this.getAndIncrement()) {
          this.queue = null;
          this.singleItem = null;
       }
       return;
    }
    public void drain(){
       if (!this.getAndIncrement()) {
          this.drainLoop();
       }
       return;
    }
    public void drainLoop(){
       ObservableMergeWithMaybe$MergeWithObserver tactual = this.actual;
       ObservableMergeWithMaybe$MergeWithObserver mergeWithObs = 1;
       int i = 1;
       while (true) {
          if (this.disposed != null) {
             this.singleItem = null;
             this.queue = null;
             return;
          }else if(this.error.get() != null){
             this.singleItem = null;
             this.queue = null;
             tactual.onError(this.error.terminate());
             return;
          }else {
             ObservableMergeWithMaybe$MergeWithObserver totherState = this.otherState;
             if (totherState == mergeWithObs) {
                totherState = this.singleItem;
                this.singleItem = null;
                this.otherState = 2;
                tactual.onNext(totherState);
                totherState = 2;
             }
             ObservableMergeWithMaybe$MergeWithObserver tmainDone = this.mainDone;
             ObservableMergeWithMaybe$MergeWithObserver tqueue = this.queue;
             Object obj = (tqueue != null)? tqueue.poll(): null;
             int i1 = (obj == null)? 1: 0;
             if (tmainDone != null && (i1 && totherState == 2)) {
                this.queue = null;
                tactual.onComplete();
                return;
             }else if(i1){
                i = - i;
                if (!this.addAndGet(i)) {
                   break ;
                }
             }else {
                tactual.onNext(obj);
             }
          }
       }
       return;
    }
    public n getOrCreateQueue(){
       ObservableMergeWithMaybe$MergeWithObserver tqueue = this.queue;
       if (tqueue == null) {
          tqueue = new a(t.bufferSize());
          this.queue = tqueue;
       }
       return tqueue;
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.mainDisposable.get());
    }
    public void onComplete(){
       this.mainDone = true;
       this.drain();
    }
    public void onError(Throwable p0){
       if (this.error.addThrowable(p0)) {
          DisposableHelper.dispose(this.mainDisposable);
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.compareAndSet(0, 1)) {
          this.actual.onNext(p0);
          if (!this.decrementAndGet()) {
             return;
          }
       }else {
          this.getOrCreateQueue().offer(p0);
          if (this.getAndIncrement()) {
             return;
          }
       }
       this.drainLoop();
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.mainDisposable, p0);
    }
    public void otherComplete(){
       this.otherState = 2;
       this.drain();
    }
    public void otherError(Throwable p0){
       if (this.error.addThrowable(p0)) {
          DisposableHelper.dispose(this.mainDisposable);
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void otherSuccess(Object p0){
       if (this.compareAndSet(0, 1)) {
          this.actual.onNext(p0);
          this.otherState = 2;
       }else {
          this.singleItem = p0;
          this.otherState = 1;
          if (this.getAndIncrement()) {
             return;
          }
       }
       this.drainLoop();
       return;
    }
}
