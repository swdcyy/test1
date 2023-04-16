package io.reactivex.internal.operators.observable.ObservableDoFinally$DoFinallyObserver;
import brd.y;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import erd.a;
import io.reactivex.internal.fuseable.o;
import crd.b;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.j;
import io.reactivex.internal.fuseable.k;
import java.util.concurrent.atomic.AtomicInteger;
import drd.a;
import ird.a;

public final class ObservableDoFinally$DoFinallyObserver extends BasicIntQueueDisposable implements y	// class@001304
{
    public final y actual;
    public b d;
    public final a onFinally;
    public j qd;
    public boolean syncFused;
    public static final long serialVersionUID = 0x3907ba0b13897e3d;

    public void ObservableDoFinally$DoFinallyObserver(y p0,a p1){
       super();
       this.actual = p0;
       this.onFinally = p1;
    }
    public void clear(){
       this.qd.clear();
    }
    public void dispose(){
       this.d.dispose();
       this.runFinally();
    }
    public boolean isDisposed(){
       return this.d.isDisposed();
    }
    public boolean isEmpty(){
       return this.qd.isEmpty();
    }
    public void onComplete(){
       this.actual.onComplete();
       this.runFinally();
    }
    public void onError(Throwable p0){
       this.actual.onError(p0);
       this.runFinally();
    }
    public void onNext(Object p0){
       this.actual.onNext(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          if (p0 instanceof j) {
             this.qd = p0;
          }
          this.actual.onSubscribe(this);
       }
       return;
    }
    public Object poll(){
       Object obj = this.qd.poll();
       if (obj == null && this.syncFused != null) {
          this.runFinally();
       }
       return obj;
    }
    public int requestFusion(int p0){
       ObservableDoFinally$DoFinallyObserver tqd = this.qd;
       boolean b = false;
       if (tqd == null || (p0 & 0x04)) {
          return b;
       }
       p0 = tqd.requestFusion(p0);
       if (p0) {
          if (p0 == 1) {
             b = true;
          }
          this.syncFused = b;
       }
       return p0;
    }
    public void runFinally(){
       if (this.compareAndSet(0, 1)) {
          this.onFinally.run();
       }
       return;
    }
}
