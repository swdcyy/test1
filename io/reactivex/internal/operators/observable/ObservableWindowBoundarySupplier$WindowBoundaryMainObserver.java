package io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$WindowBoundaryMainObserver;
import brd.y;
import crd.b;
import java.lang.Runnable;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier$a;
import java.lang.Object;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Throwable;
import io.reactivex.subjects.UnicastSubject;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import drd.a;
import ird.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableWindowBoundarySupplier$WindowBoundaryMainObserver extends AtomicInteger implements y, b, Runnable	// class@00138f
{
    public final AtomicReference boundaryObserver;
    public final int capacityHint;
    public boolean done;
    public final y downstream;
    public final AtomicThrowable errors;
    public final Callable other;
    public final MpscLinkedQueue queue;
    public final AtomicBoolean stopWindows;
    public b upstream;
    public UnicastSubject window;
    public final AtomicInteger windows;
    public static final ObservableWindowBoundarySupplier$a BOUNDARY_DISPOSED;
    public static final Object NEXT_WINDOW;
    public static final long serialVersionUID;

    static {
       ObservableWindowBoundarySupplier$WindowBoundaryMainObserver.BOUNDARY_DISPOSED = new ObservableWindowBoundarySupplier$a(null);
       ObservableWindowBoundarySupplier$WindowBoundaryMainObserver.NEXT_WINDOW = new Object();
    }
    public void ObservableWindowBoundarySupplier$WindowBoundaryMainObserver(y p0,int p1,Callable p2){
       super();
       this.downstream = p0;
       this.capacityHint = p1;
       this.boundaryObserver = new AtomicReference();
       this.windows = new AtomicInteger(1);
       this.queue = new MpscLinkedQueue();
       this.errors = new AtomicThrowable();
       this.stopWindows = new AtomicBoolean();
       this.other = p2;
    }
    public void dispose(){
       if (this.stopWindows.compareAndSet(false, true)) {
          this.disposeBoundary();
          if (!this.windows.decrementAndGet()) {
             this.upstream.dispose();
          }
       }
       return;
    }
    public void disposeBoundary(){
       ObservableWindowBoundarySupplier$a bOUNDARY_DIS = ObservableWindowBoundarySupplier$WindowBoundaryMainObserver.BOUNDARY_DISPOSED;
       b andSet = this.boundaryObserver.getAndSet(bOUNDARY_DIS);
       if (andSet != null && andSet != bOUNDARY_DIS) {
          andSet.dispose();
       }
       return;
    }
    public void drain(){
       Throwable throwable;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableWindowBoundarySupplier$WindowBoundaryMainObserver tdownstream = this.downstream;
       ObservableWindowBoundarySupplier$WindowBoundaryMainObserver tqueue = this.queue;
       ObservableWindowBoundarySupplier$WindowBoundaryMainObserver terrors = this.errors;
       int i = 1;
       while (true) {
          UnicastSubject unicastSubje = null;
          if (!this.windows.get()) {
             tqueue.clear();
             this.window = unicastSubje;
             return;
          }else {
             ObservableWindowBoundarySupplier$WindowBoundaryMainObserver twindow = this.window;
             ObservableWindowBoundarySupplier$WindowBoundaryMainObserver tdone = this.done;
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
                ObservableWindowBoundarySupplier$a obj = tqueue.poll();
                ObservableWindowBoundarySupplier$WindowBoundaryMainObserver windowBounda = (obj == null)? 1: null;
                if (tdone != null && windowBounda) {
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
                }else if(windowBounda){
                   i = - i;
                   if (!this.addAndGet(i)) {
                      return;
                   }
                }else if(obj != ObservableWindowBoundarySupplier$WindowBoundaryMainObserver.NEXT_WINDOW){
                   twindow.onNext(obj);
                }else if(twindow != null){
                   this.window = unicastSubje;
                   twindow.onComplete();
                }
                if (!this.stopWindows.get()) {
                   UnicastSubject unicastSubje1 = UnicastSubject.h(this.capacityHint, this);
                   this.window = unicastSubje1;
                   this.windows.getAndIncrement();
                   Object obj1 = this.other.call();
                   a.c(obj1, "The other Callable returned a null ObservableSource");
                   obj = new ObservableWindowBoundarySupplier$a(this);
                   if (this.boundaryObserver.compareAndSet(unicastSubje, obj)) {
                      obj1.subscribe(obj);
                      tdownstream.onNext(unicastSubje1);
                   }
                }
             }
          }
       }
       return;
    }
    public void innerComplete(){
       this.upstream.dispose();
       this.done = true;
       this.drain();
    }
    public void innerError(Throwable p0){
       this.upstream.dispose();
       if (this.errors.addThrowable(p0)) {
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerNext(ObservableWindowBoundarySupplier$a p0){
       this.boundaryObserver.compareAndSet(p0, null);
       this.queue.offer(ObservableWindowBoundarySupplier$WindowBoundaryMainObserver.NEXT_WINDOW);
       this.drain();
    }
    public boolean isDisposed(){
       return this.stopWindows.get();
    }
    public void onComplete(){
       this.disposeBoundary();
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       this.disposeBoundary();
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
       if (DisposableHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          this.downstream.onSubscribe(this);
          this.queue.offer(ObservableWindowBoundarySupplier$WindowBoundaryMainObserver.NEXT_WINDOW);
          this.drain();
       }
       return;
    }
    public void run(){
       if (!this.windows.decrementAndGet()) {
          this.upstream.dispose();
       }
       return;
    }
}
