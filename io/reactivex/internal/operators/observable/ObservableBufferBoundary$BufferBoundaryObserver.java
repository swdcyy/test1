package io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.w;
import erd.o;
import java.util.concurrent.Callable;
import io.reactivex.internal.queue.a;
import brd.t;
import crd.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import io.reactivex.internal.util.AtomicThrowable;
import java.lang.Throwable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferCloseObserver;
import java.lang.Long;
import java.lang.Object;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import ird.a;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;

public final class ObservableBufferBoundary$BufferBoundaryObserver extends AtomicInteger implements y, b	// class@0012ea
{
    public final y actual;
    public final o bufferClose;
    public final w bufferOpen;
    public final Callable bufferSupplier;
    public Map buffers;
    public boolean cancelled;
    public boolean done;
    public final AtomicThrowable errors;
    public long index;
    public final a observers;
    public final a queue;
    public final AtomicReference upstream;
    public static final long serialVersionUID = 0x8a813d2e91500bfc;

    public void ObservableBufferBoundary$BufferBoundaryObserver(y p0,w p1,o p2,Callable p3){
       super();
       this.actual = p0;
       this.bufferSupplier = p3;
       this.bufferOpen = p1;
       this.bufferClose = p2;
       this.queue = new a(t.bufferSize());
       this.observers = new a();
       this.upstream = new AtomicReference();
       this.buffers = new LinkedHashMap();
       this.errors = new AtomicThrowable();
    }
    public void boundaryError(b p0,Throwable p1){
       DisposableHelper.dispose(this.upstream);
       this.observers.b(p0);
       this.onError(p1);
    }
    public void close(ObservableBufferBoundary$BufferCloseObserver p0,long p1){
       int i;
       this.observers.b(p0);
       if (!this.observers.f()) {
          DisposableHelper.dispose(this.upstream);
          i = 1;
       }else {
          i = 0;
       }
       _monitor_enter(this);
       ObservableBufferBoundary$BufferBoundaryObserver tbuffers = this.buffers;
       if (tbuffers == null) {
          _monitor_exit(this);
          return;
       }else {
          this.queue.offer(tbuffers.remove(Long.valueOf(p1)));
          _monitor_exit(this);
          if (i) {
             this.done = true;
          }
          this.drain();
          return;
       }
    }
    public void dispose(){
       if (DisposableHelper.dispose(this.upstream)) {
          this.cancelled = true;
          this.observers.dispose();
          _monitor_enter(this);
          this.buffers = null;
          _monitor_exit(this);
          if (this.getAndIncrement()) {
             this.queue.clear();
          }
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableBufferBoundary$BufferBoundaryObserver tactual = this.actual;
       ObservableBufferBoundary$BufferBoundaryObserver tqueue = this.queue;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             tqueue.clear();
             return;
          }else {
             ObservableBufferBoundary$BufferBoundaryObserver tdone = this.done;
             if (tdone != null && this.errors.get() != null) {
                tqueue.clear();
                tactual.onError(this.errors.terminate());
                return;
             }else {
                Collection uCollection = tqueue.poll();
                int i1 = (uCollection == null)? 1: 0;
                if (tdone != null && i1) {
                   tactual.onComplete();
                   return;
                }else if(i1){
                   i = - i;
                   if (!this.addAndGet(i)) {
                      break ;
                   }
                }else {
                   tactual.onNext(uCollection);
                }
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.upstream.get());
    }
    public void onComplete(){
       this.observers.dispose();
       _monitor_enter(this);
       ObservableBufferBoundary$BufferBoundaryObserver tbuffers = this.buffers;
       if (tbuffers == null) {
          _monitor_exit(this);
          return;
       }else {
          Iterator iterator = tbuffers.values().iterator();
          while (iterator.hasNext()) {
             this.queue.offer(iterator.next());
          }
          this.buffers = null;
          _monitor_exit(this);
          this.done = true;
          this.drain();
          return;
       }
    }
    public void onError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
          this.observers.dispose();
          _monitor_enter(this);
          this.buffers = null;
          _monitor_exit(this);
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       _monitor_enter(this);
       ObservableBufferBoundary$BufferBoundaryObserver tbuffers = this.buffers;
       if (tbuffers == null) {
          _monitor_exit(this);
          return;
       }else {
          Iterator iterator = tbuffers.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().add(p0);
          }
          _monitor_exit(this);
          return;
       }
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this.upstream, p0)) {
          ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver uBufferBound = new ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver(this);
          this.observers.c(uBufferBound);
          this.bufferOpen.subscribe(uBufferBound);
       }
       return;
    }
    public void open(Object p0){
       ObservableBufferBoundary$BufferCloseObserver obj = this.bufferSupplier.call();
       a.c(obj, "The bufferSupplier returned a null Collection");
       p0 = this.bufferClose.apply(p0);
       a.c(p0, "The bufferClose returned a null ObservableSource");
       ObservableBufferBoundary$BufferBoundaryObserver tindex = this.index;
       this.index = 1 + tindex;
       _monitor_enter(this);
       ObservableBufferBoundary$BufferBoundaryObserver tbuffers = this.buffers;
       if (tbuffers == null) {
          _monitor_exit(this);
          return;
       }else {
          tbuffers.put(Long.valueOf(tindex), obj);
          _monitor_exit(this);
          obj = new ObservableBufferBoundary$BufferCloseObserver(this, tindex);
          this.observers.c(obj);
          p0.subscribe(obj);
          return;
       }
    }
    public void openComplete(ObservableBufferBoundary$BufferBoundaryObserver$BufferOpenObserver p0){
       this.observers.b(p0);
       if (!this.observers.f()) {
          DisposableHelper.dispose(this.upstream);
          this.done = true;
          this.drain();
       }
       return;
    }
}
