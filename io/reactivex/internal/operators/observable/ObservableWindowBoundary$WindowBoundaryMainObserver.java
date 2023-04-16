package io.reactivex.internal.operators.observable.ObservableWindowBoundary$WindowBoundaryMainObserver;
import brd.y;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary$a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicBoolean;
import grd.c;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import io.reactivex.subjects.UnicastSubject;
import ird.a;

public final class ObservableWindowBoundary$WindowBoundaryMainObserver extends AtomicInteger implements y, b, Runnable	// class@00138c
{
    public final ObservableWindowBoundary$a boundaryObserver;
    public final int capacityHint;
    public boolean done;
    public final y downstream;
    public final AtomicThrowable errors;
    public final MpscLinkedQueue queue;
    public final AtomicBoolean stopWindows;
    public final AtomicReference upstream;
    public UnicastSubject window;
    public final AtomicInteger windows;
    public static final Object NEXT_WINDOW;
    public static final long serialVersionUID;

    static {
       ObservableWindowBoundary$WindowBoundaryMainObserver.NEXT_WINDOW = new Object();
    }
    public void ObservableWindowBoundary$WindowBoundaryMainObserver(y p0,int p1){
       super();
       this.downstream = p0;
       this.capacityHint = p1;
       this.boundaryObserver = new ObservableWindowBoundary$a(this);
       this.upstream = new AtomicReference();
       this.windows = new AtomicInteger(1);
       this.queue = new MpscLinkedQueue();
       this.errors = new AtomicThrowable();
       this.stopWindows = new AtomicBoolean();
    }
    public void dispose(){
       if (this.stopWindows.compareAndSet(false, true)) {
          this.boundaryObserver.dispose();
          if (!this.windows.decrementAndGet()) {
             DisposableHelper.dispose(this.upstream);
          }
       }
       return;
    }
    public void drain(){
       Throwable throwable;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableWindowBoundary$WindowBoundaryMainObserver tdownstream = this.downstream;
       ObservableWindowBoundary$WindowBoundaryMainObserver tqueue = this.queue;
       ObservableWindowBoundary$WindowBoundaryMainObserver terrors = this.errors;
       int i = 1;
       while (true) {
          UnicastSubject unicastSubje = null;
          if (!this.windows.get()) {
             tqueue.clear();
             this.window = unicastSubje;
             return;
          }else {
             ObservableWindowBoundary$WindowBoundaryMainObserver twindow = this.window;
             ObservableWindowBoundary$WindowBoundaryMainObserver tdone = this.done;
             if (tdone != null && terrors.get() != null) {
                tqueue.clear();
                throwable = terrors.terminate();
                if (twindow != null) {
                   this.window = unicastSubje;
                   twindow.onError(throwable);
                }
                tdownstream.onError(throwable);
                return;
             }else {
                Object obj = tqueue.poll();
                int i1 = (obj == null)? 1: 0;
                if (tdone != null && i1) {
                   throwable = terrors.terminate();
                   if (throwable == null) {
                      if (twindow != null) {
                         this.window = unicastSubje;
                         twindow.onComplete();
                      }
                      tdownstream.onComplete();
                      break ;
                   }else if(twindow != null){
                      this.window = unicastSubje;
                      twindow.onError(throwable);
                   }
                   tdownstream.onError(throwable);
                   break ;
                }else if(i1){
                   i = - i;
                   if (!this.addAndGet(i)) {
                      return;
                   }
                }else if(obj != ObservableWindowBoundary$WindowBoundaryMainObserver.NEXT_WINDOW){
                   twindow.onNext(obj);
                }else if(twindow != null){
                   this.window = unicastSubje;
                   twindow.onComplete();
                }
                if (!this.stopWindows.get()) {
                   UnicastSubject unicastSubje1 = UnicastSubject.h(this.capacityHint, this);
                   this.window = unicastSubje1;
                   this.windows.getAndIncrement();
                   tdownstream.onNext(unicastSubje1);
                }
             }
          }
       }
       return;
    }
    public void innerComplete(){
       DisposableHelper.dispose(this.upstream);
       this.done = true;
       this.drain();
    }
    public void innerError(Throwable p0){
       DisposableHelper.dispose(this.upstream);
       if (this.errors.addThrowable(p0)) {
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerNext(){
       this.queue.offer(ObservableWindowBoundary$WindowBoundaryMainObserver.NEXT_WINDOW);
       this.drain();
    }
    public boolean isDisposed(){
       return this.stopWindows.get();
    }
    public void onComplete(){
       this.boundaryObserver.dispose();
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       this.boundaryObserver.dispose();
       if (this.errors.addThrowable(p0)) {
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
       if (DisposableHelper.setOnce(this.upstream, p0)) {
          this.innerNext();
       }
       return;
    }
    public void run(){
       if (!this.windows.decrementAndGet()) {
          DisposableHelper.dispose(this.upstream);
       }
       return;
    }
}
