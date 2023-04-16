package io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.e0;
import brd.d0;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSwitchMapSingle$SwitchMapSingleMainObserver extends AtomicInteger implements y, b	// class@0012dc
{
    public boolean cancelled;
    public final boolean delayErrors;
    public boolean done;
    public final y downstream;
    public final AtomicThrowable errors;
    public final AtomicReference inner;
    public final o mapper;
    public b upstream;
    public static final ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver INNER_DISPOSED;
    public static final long serialVersionUID;

    static {
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver.INNER_DISPOSED = new ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver(null);
    }
    public void ObservableSwitchMapSingle$SwitchMapSingleMainObserver(y p0,o p1,boolean p2){
       super();
       this.downstream = p0;
       this.mapper = p1;
       this.delayErrors = p2;
       this.errors = new AtomicThrowable();
       this.inner = new AtomicReference();
    }
    public void dispose(){
       this.cancelled = true;
       this.upstream.dispose();
       this.disposeInner();
    }
    public void disposeInner(){
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver iNNER_DISPOS = ObservableSwitchMapSingle$SwitchMapSingleMainObserver.INNER_DISPOSED;
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver andSet = this.inner.getAndSet(iNNER_DISPOS);
       if (andSet != null && andSet != iNNER_DISPOS) {
          andSet.dispose();
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver tdownstream = this.downstream;
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver terrors = this.errors;
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver tinner = this.inner;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             return;
          }
          if (terrors.get() != null && this.delayErrors == null) {
             tdownstream.onError(terrors.terminate());
             return;
          }else {
             ObservableSwitchMapSingle$SwitchMapSingleMainObserver tdone = this.done;
             ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver switchMapSin = tinner.get();
             int i1 = (switchMapSin == null)? 1: 0;
             if (tdone != null && i1) {
                Throwable throwable = terrors.terminate();
                if (throwable != null) {
                   tdownstream.onError(throwable);
                   break ;
                }else {
                   tdownstream.onComplete();
                   break ;
                }
             }else if(i1 || switchMapSin.item == null){
                i = - i;
                if (!this.addAndGet(i)) {
                   return;
                }
             }else {
                tinner.compareAndSet(switchMapSin, null);
                tdownstream.onNext(switchMapSin.item);
             }
          }
       }
       return;
    }
    public void innerError(ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver p0,Throwable p1){
       if (this.inner.compareAndSet(p0, null) && this.errors.addThrowable(p1)) {
          if (this.delayErrors == null) {
             this.upstream.dispose();
             this.disposeInner();
          }
          this.drain();
          return;
       }else {
          a.l(p1);
          return;
       }
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void onComplete(){
       this.done = true;
       this.drain();
    }
    public void onError(Throwable p0){
       if (this.errors.addThrowable(p0)) {
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
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver switchMapSin = this.inner.get();
       if (switchMapSin != null) {
          switchMapSin.dispose();
       }
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null SingleSource");
       switchMapSin = new ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver(this);
       ObservableSwitchMapSingle$SwitchMapSingleMainObserver$SwitchMapSingleObserver switchMapSin1 = this.inner.get();
       while (switchMapSin1 != ObservableSwitchMapSingle$SwitchMapSingleMainObserver.INNER_DISPOSED) {
          if (this.inner.compareAndSet(switchMapSin1, switchMapSin)) {
             p0.b(switchMapSin);
             break ;
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.upstream, p0)) {
          this.upstream = p0;
          this.downstream.onSubscribe(this);
       }
       return;
    }
}
