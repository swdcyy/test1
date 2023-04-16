package io.reactivex.internal.operators.observable.BlockingObservableIterable$BlockingObservableIterator;
import brd.y;
import java.util.Iterator;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.queue.a;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.RuntimeException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.c;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class BlockingObservableIterable$BlockingObservableIterator extends AtomicReference implements y, Iterator, b	// class@0012e1
{
    public final Condition condition;
    public boolean done;
    public Throwable error;
    public final Lock lock;
    public final a queue;
    public static final long serialVersionUID = 0x5cea3901b29dcb72;

    public void BlockingObservableIterable$BlockingObservableIterator(int p0){
       super();
       this.queue = new a(p0);
       ReentrantLock reentrantLoc = new ReentrantLock();
       this.lock = reentrantLoc;
       this.condition = reentrantLoc.newCondition();
    }
    public void dispose(){
       DisposableHelper.dispose(this);
    }
    public boolean hasNext(){
       BlockingObservableIterable$BlockingObservableIterator terror;
       while (true) {
          boolean b = this.queue.isEmpty();
          if (this.done != null) {
             terror = this.error;
             if (terror == null) {
                if (b) {
                   return false;
                }
             label_0017 :
                if (!b) {
                   return true;
                }
                try{
                   c.a();
                   this.lock.lock();
                   while (this.done == null && this.queue.isEmpty()) {
                      this.condition.await();
                   }
                   this.lock.unlock();
                }catch(java.lang.InterruptedException e0){
                   DisposableHelper.dispose(this);
                   this.signalConsumer();
                   throw ExceptionHelper.d(e0);
                }
             }else {
                break ;
             }
          }else {
             goto label_0017 ;
          }
       }
       throw ExceptionHelper.d(terror);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.get());
    }
    public Object next(){
       if (this.hasNext()) {
          return this.queue.poll();
       }
       throw new NoSuchElementException();
    }
    public void onComplete(){
       this.done = true;
       this.signalConsumer();
    }
    public void onError(Throwable p0){
       this.error = p0;
       this.done = true;
       this.signalConsumer();
    }
    public void onNext(Object p0){
       this.queue.offer(p0);
       this.signalConsumer();
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this, p0);
    }
    public void remove(){
       throw new UnsupportedOperationException("remove");
    }
    public void signalConsumer(){
       this.lock.lock();
       this.condition.signalAll();
       this.lock.unlock();
    }
}
