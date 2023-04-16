package io.reactivex.internal.operators.observable.ObservableReplay$ReplayObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservableReplay$InnerDisposable;
import io.reactivex.internal.operators.observable.ObservableReplay$e;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.System;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import ird.a;

public final class ObservableReplay$ReplayObserver extends AtomicReference implements y, b	// class@001342
{
    public final ObservableReplay$e buffer;
    public boolean done;
    public final AtomicReference observers;
    public final AtomicBoolean shouldConnect;
    public static final ObservableReplay$InnerDisposable[] EMPTY;
    public static final ObservableReplay$InnerDisposable[] TERMINATED;
    public static final long serialVersionUID;

    static {
       ObservableReplay$InnerDisposable[] innerDisposa = new ObservableReplay$InnerDisposable[0];
       ObservableReplay$ReplayObserver.EMPTY = innerDisposa;
       ObservableReplay$InnerDisposable[] innerDisposa1 = new ObservableReplay$InnerDisposable[0];
       ObservableReplay$ReplayObserver.TERMINATED = innerDisposa1;
    }
    public void ObservableReplay$ReplayObserver(ObservableReplay$e p0){
       super();
       this.buffer = p0;
       this.observers = new AtomicReference(ObservableReplay$ReplayObserver.EMPTY);
       this.shouldConnect = new AtomicBoolean();
    }
    public boolean add(ObservableReplay$InnerDisposable p0){
       while (true) {
          ObservableReplay$InnerDisposable[] innerDisposa = this.observers.get();
          if (innerDisposa == ObservableReplay$ReplayObserver.TERMINATED) {
             return false;
          }
          int len = innerDisposa.length;
          int i = len + 1;
          ObservableReplay$InnerDisposable[] innerDisposa1 = new ObservableReplay$InnerDisposable[i];
          System.arraycopy(innerDisposa, false, innerDisposa1, false, len);
          innerDisposa1[len] = p0;
          if (this.observers.compareAndSet(innerDisposa, innerDisposa1)) {
             break ;
          }
       }
       return true;
    }
    public void dispose(){
       this.observers.set(ObservableReplay$ReplayObserver.TERMINATED);
       DisposableHelper.dispose(this);
    }
    public boolean isDisposed(){
       boolean b = (this.observers.get() == ObservableReplay$ReplayObserver.TERMINATED)? true: false;
       return b;
    }
    public void onComplete(){
       if (this.done == null) {
          this.done = true;
          this.buffer.complete();
          this.replayFinal();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.done == null) {
          this.done = true;
          this.buffer.error(p0);
          this.replayFinal();
       }else {
          a.l(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.done == null) {
          this.buffer.next(p0);
          this.replay();
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.setOnce(this, p0)) {
          this.replay();
       }
       return;
    }
    public void remove(ObservableReplay$InnerDisposable p0){
       ObservableReplay$InnerDisposable[] eMPTY;
       while (true) {
          ObservableReplay$InnerDisposable[] innerDisposa = this.observers.get();
          int len = innerDisposa.length;
          if (!len) {
             return;
          }
          ObservableReplay$ReplayObserver replayObserv = -1;
          int i = 0;
          int i1 = 0;
          while (i1 < len) {
             if (innerDisposa[i1].equals(p0)) {
                replayObserv = i1;
                break ;
             }else {
                i1 = i1 + 1;
             }
          }
          if (replayObserv < 0) {
             return;
          }
          i1 = 1;
          if (len == i1) {
             eMPTY = ObservableReplay$ReplayObserver.EMPTY;
          }else {
             int i2 = len - 1;
             ObservableReplay$InnerDisposable[] innerDisposa1 = new ObservableReplay$InnerDisposable[i2];
             System.arraycopy(innerDisposa, i, innerDisposa1, i, replayObserv);
             i = replayObserv + 1;
             len = len - replayObserv;
             len = len - i1;
             System.arraycopy(innerDisposa, i, innerDisposa1, replayObserv, len);
             eMPTY = innerDisposa1;
          }
          if (this.observers.compareAndSet(innerDisposa, eMPTY)) {
          }
       }
       return;
    }
    public void replay(){
       ObservableReplay$InnerDisposable[] innerDisposa = this.observers.get();
       int len = innerDisposa.length;
       for (int i = 0; i < len; i = i + 1) {
          this.buffer.replay(innerDisposa[i]);
       }
       return;
    }
    public void replayFinal(){
       ObservableReplay$InnerDisposable[] andSet = this.observers.getAndSet(ObservableReplay$ReplayObserver.TERMINATED);
       int len = andSet.length;
       for (int i = 0; i < len; i = i + 1) {
          this.buffer.replay(andSet[i]);
       }
       return;
    }
}
