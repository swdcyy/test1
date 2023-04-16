package io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver;
import erd.o;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import brd.q;
import brd.p;
import drd.a;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver extends AtomicInteger implements y, b	// class@0012d9
{
    public boolean cancelled;
    public final boolean delayErrors;
    public boolean done;
    public final y downstream;
    public final AtomicThrowable errors;
    public final AtomicReference inner;
    public final o mapper;
    public b upstream;
    public static final ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver INNER_DISPOSED;
    public static final long serialVersionUID;

    static {
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver.INNER_DISPOSED = new ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver(null);
    }
    public void ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver(y p0,o p1,boolean p2){
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
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver iNNER_DISPOS = ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver.INNER_DISPOSED;
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver andSet = this.inner.getAndSet(iNNER_DISPOS);
       if (andSet != null && andSet != iNNER_DISPOS) {
          andSet.dispose();
       }
       return;
    }
    public void drain(){
       if (this.getAndIncrement()) {
          return;
       }
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver tdownstream = this.downstream;
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver terrors = this.errors;
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver tinner = this.inner;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             return;
          }
          if (terrors.get() != null && this.delayErrors == null) {
             tdownstream.onError(terrors.terminate());
             return;
          }else {
             ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver tdone = this.done;
             ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver switchMapMay = tinner.get();
             int i1 = (switchMapMay == null)? 1: 0;
             if (tdone != null && i1) {
                Throwable throwable = terrors.terminate();
                if (throwable != null) {
                   tdownstream.onError(throwable);
                   break ;
                }else {
                   tdownstream.onComplete();
                   break ;
                }
             }else if(i1 || switchMapMay.item == null){
                i = - i;
                if (!this.addAndGet(i)) {
                   return;
                }
             }else {
                tinner.compareAndSet(switchMapMay, null);
                tdownstream.onNext(switchMapMay.item);
             }
          }
       }
       return;
    }
    public void innerComplete(ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver p0){
       if (this.inner.compareAndSet(p0, null)) {
          this.drain();
       }
       return;
    }
    public void innerError(ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver p0,Throwable p1){
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
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver switchMapMay = this.inner.get();
       if (switchMapMay != null) {
          switchMapMay.dispose();
       }
       p0 = this.mapper.apply(p0);
       a.c(p0, "The mapper returned a null MaybeSource");
       switchMapMay = new ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver(this);
       ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver$SwitchMapMaybeObserver switchMapMay1 = this.inner.get();
       while (switchMapMay1 != ObservableSwitchMapMaybe$SwitchMapMaybeMainObserver.INNER_DISPOSED) {
          if (this.inner.compareAndSet(switchMapMay1, switchMapMay)) {
             p0.b(switchMapMay);
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
