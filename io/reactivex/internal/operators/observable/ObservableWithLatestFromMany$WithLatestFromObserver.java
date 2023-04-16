package io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestFromObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import erd.o;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany$WithLatestInnerObserver;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.g;
import java.lang.Throwable;
import java.lang.Object;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;
import brd.w;

public final class ObservableWithLatestFromMany$WithLatestFromObserver extends AtomicInteger implements y, b	// class@001395
{
    public final y actual;
    public final o combiner;
    public final AtomicReference d;
    public boolean done;
    public final AtomicThrowable error;
    public final ObservableWithLatestFromMany$WithLatestInnerObserver[] observers;
    public final AtomicReferenceArray values;
    public static final long serialVersionUID = 0x15e3c5e57e438349;

    public void ObservableWithLatestFromMany$WithLatestFromObserver(y p0,o p1,int p2){
       super();
       this.actual = p0;
       this.combiner = p1;
       ObservableWithLatestFromMany$WithLatestInnerObserver[] withLatestIn = new ObservableWithLatestFromMany$WithLatestInnerObserver[p2];
       for (int i = 0; i < p2; i++) {
          withLatestIn[i] = new ObservableWithLatestFromMany$WithLatestInnerObserver(this, i);
       }
       this.observers = withLatestIn;
       this.values = new AtomicReferenceArray(p2);
       this.d = new AtomicReference();
       this.error = new AtomicThrowable();
       return;
    }
    public void cancelAllBut(int p0){
       ObservableWithLatestFromMany$WithLatestFromObserver tobservers = this.observers;
       int i = 0;
       while (i < tobservers.length) {
          if (i != p0) {
             tobservers[i].dispose();
          }
          i = i + 1;
       }
       return;
    }
    public void dispose(){
       DisposableHelper.dispose(this.d);
       ObservableWithLatestFromMany$WithLatestFromObserver tobservers = this.observers;
       int len = tobservers.length;
       for (int i = 0; i < len; i = i + 1) {
          tobservers[i].dispose();
       }
       return;
    }
    public void innerComplete(int p0,boolean p1){
       if (!p1) {
          this.done = true;
          this.cancelAllBut(p0);
          g.a(this.actual, this, this.error);
       }
       return;
    }
    public void innerError(int p0,Throwable p1){
       this.done = true;
       DisposableHelper.dispose(this.d);
       this.cancelAllBut(p0);
       g.c(this.actual, p1, this, this.error);
    }
    public void innerNext(int p0,Object p1){
       this.values.set(p0, p1);
    }
    public boolean isDisposed(){
       return DisposableHelper.isDisposed(this.d.get());
    }
    public void onComplete(){
       if (this.done == null) {
          this.done = true;
          this.cancelAllBut(-1);
          g.a(this.actual, this, this.error);
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.done != null) {
          a.l(p0);
          return;
       }else {
          this.done = true;
          this.cancelAllBut(-1);
          g.c(this.actual, p0, this, this.error);
          return;
       }
    }
    public void onNext(Object p0){
       if (this.done != null) {
          return;
       }
       ObservableWithLatestFromMany$WithLatestFromObserver tvalues = this.values;
       int i = tvalues.length();
       Object[] objArray = new Object[(i + 1)];
       int i1 = 0;
       objArray[i1] = p0;
       while (true) {
          if (i1 < i) {
             p0 = tvalues.get(i1);
             if (p0 == null) {
                break ;
             }else {
                i1 = i1 + 1;
                objArray[i1] = p0;
             }
          }else {
             p0 = this.combiner.apply(objArray);
             a.c(p0, "combiner returned a null value");
             g.e(this.actual, p0, this, this.error);
             return;
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       DisposableHelper.setOnce(this.d, p0);
    }
    public void subscribe(w[] p0,int p1){
       ObservableWithLatestFromMany$WithLatestFromObserver tobservers = this.observers;
       ObservableWithLatestFromMany$WithLatestFromObserver td = this.d;
       for (int i = 0; i >= p1 || (!DisposableHelper.isDisposed(td.get()) && this.done == null); i = i + 1) {
          p0[i].subscribe(tobservers[i]);
       }
       return;
    }
}
