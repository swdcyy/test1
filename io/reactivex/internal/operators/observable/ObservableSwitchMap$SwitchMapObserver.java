package io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.observable.ObservableSwitchMap$SwitchMapInnerObserver;
import erd.o;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.o;
import drd.a;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.w;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSwitchMap$SwitchMapObserver extends AtomicInteger implements y, b	// class@00136e
{
    public final AtomicReference active;
    public final y actual;
    public final int bufferSize;
    public boolean cancelled;
    public final boolean delayErrors;
    public boolean done;
    public final AtomicThrowable errors;
    public final o mapper;
    public b s;
    public long unique;
    public static final ObservableSwitchMap$SwitchMapInnerObserver CANCELLED;
    public static final long serialVersionUID;

    static {
       ObservableSwitchMap$SwitchMapInnerObserver switchMapInn = new ObservableSwitchMap$SwitchMapInnerObserver(null, -1, 1);
       ObservableSwitchMap$SwitchMapObserver.CANCELLED = switchMapInn;
       switchMapInn.cancel();
    }
    public void ObservableSwitchMap$SwitchMapObserver(y p0,o p1,int p2,boolean p3){
       super();
       this.active = new AtomicReference();
       this.actual = p0;
       this.mapper = p1;
       this.bufferSize = p2;
       this.delayErrors = p3;
       this.errors = new AtomicThrowable();
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.s.dispose();
          this.disposeInner();
       }
       return;
    }
    public void disposeInner(){
       ObservableSwitchMap$SwitchMapInnerObserver cANCELLED = ObservableSwitchMap$SwitchMapObserver.CANCELLED;
       if (this.active.get() != cANCELLED) {
          ObservableSwitchMap$SwitchMapInnerObserver andSet = this.active.getAndSet(cANCELLED);
          if (andSet != cANCELLED && andSet != null) {
             andSet.cancel();
          }
       }
       return;
    }
    public void drain(){
       ObservableSwitchMap$SwitchMapInnerObserver switchMapInn;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableSwitchMap$SwitchMapObserver tactual = this.actual;
       ObservableSwitchMap$SwitchMapObserver tactive = this.active;
       ObservableSwitchMap$SwitchMapObserver tdelayErrors = this.delayErrors;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             return;
          }
          if (this.done != null) {
             switchMapInn = (tactive.get() == null)? 1: null;
             if (tdelayErrors != null) {
                if (switchMapInn) {
                   Throwable throwable = this.errors.get();
                   if (throwable != null) {
                      tactual.onError(throwable);
                      break ;
                   }else {
                      tactual.onComplete();
                      break ;
                   }
                   break ;
                }
             }else if(this.errors.get() != null){
                tactual.onError(this.errors.terminate());
                return;
             }else if(switchMapInn != null){
                tactual.onComplete();
                return;
             }
          }
       label_0052 :
          switchMapInn = tactive.get();
          if (switchMapInn != null) {
             ObservableSwitchMap$SwitchMapInnerObserver queue = switchMapInn.queue;
             if (queue != null) {
                if (switchMapInn.done != null) {
                   boolean b = queue.isEmpty();
                   if (tdelayErrors != null) {
                      if (b) {
                         tactive.compareAndSet(switchMapInn, null);
                      }
                   }else if(this.errors.get() != null){
                      tactual.onError(this.errors.terminate());
                      return;
                   }else if(b){
                      tactive.compareAndSet(switchMapInn, null);
                   }
                }
                ObservableSwitchMap$SwitchMapInnerObserver switchMapInn1 = null;
                while (true) {
                   if (this.cancelled != null) {
                      return;
                   }
                   if (switchMapInn == tactive.get()) {
                      if (tdelayErrors == null && this.errors.get() != null) {
                         tactual.onError(this.errors.terminate());
                         return;
                      }else {
                         ObservableSwitchMap$SwitchMapInnerObserver done = switchMapInn.done;
                         Object obj = queue.poll();
                         int i1 = (obj == null)? 1: 0;
                         if (done != null && i1) {
                            tactive.compareAndSet(switchMapInn, null);
                         }else if(i1){
                         label_00e1 :
                            if (switchMapInn1 != null) {
                               continue ;
                            }
                         }else {
                            tactual.onNext(obj);
                         }
                      }
                   }
                   switchMapInn1 = 1;
                   goto label_00e1 ;
                }
                return;
             }
          }
          i = - i;
          if (!this.addAndGet(i)) {
             return;
          }
       }
    }
    public void innerError(ObservableSwitchMap$SwitchMapInnerObserver p0,Throwable p1){
       if (!p0.index - this.unique && this.errors.addThrowable(p1)) {
          if (this.delayErrors == null) {
             this.s.dispose();
          }
          p0.done = true;
          this.drain();
       }else {
          a.l(p1);
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       if (this.done == null) {
          this.done = true;
          this.drain();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.done == null && this.errors.addThrowable(p0)) {
          if (this.delayErrors == null) {
             this.disposeInner();
          }
          this.done = true;
          this.drain();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       long l = this.unique + 1;
       this.unique = l;
       ObservableSwitchMap$SwitchMapInnerObserver switchMapInn = this.active.get();
       if (switchMapInn != null) {
          switchMapInn.cancel();
       }
       p0 = this.mapper.apply(p0);
       a.c(p0, "The ObservableSource returned is null");
       switchMapInn = new ObservableSwitchMap$SwitchMapInnerObserver(this, l, this.bufferSize);
       ObservableSwitchMap$SwitchMapInnerObserver switchMapInn1 = this.active.get();
       while (switchMapInn1 != ObservableSwitchMap$SwitchMapObserver.CANCELLED) {
          if (this.active.compareAndSet(switchMapInn1, switchMapInn)) {
             p0.subscribe(switchMapInn);
             break ;
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
