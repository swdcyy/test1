package io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.d0;
import erd.o;
import io.reactivex.internal.operators.single.SingleZipArray$ZipSingleObserver;
import java.lang.Object;
import java.lang.Throwable;
import ird.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;

public final class SingleZipArray$ZipCoordinator extends AtomicInteger implements b	// class@00147e
{
    public final d0 actual;
    public final SingleZipArray$ZipSingleObserver[] observers;
    public final Object[] values;
    public final o zipper;
    public static final long serialVersionUID = 0xb2e1d6eac4fbd957;

    public void SingleZipArray$ZipCoordinator(d0 p0,int p1,o p2){
       super(p1);
       this.actual = p0;
       this.zipper = p2;
       SingleZipArray$ZipSingleObserver[] zipSingleObs = new SingleZipArray$ZipSingleObserver[p1];
       for (int i = 0; i < p1; i++) {
          zipSingleObs[i] = new SingleZipArray$ZipSingleObserver(this, i);
       }
       this.observers = zipSingleObs;
       Object[] objArray = new Object[p1];
       this.values = objArray;
       return;
    }
    public void dispose(){
       int i = 0;
       if (this.getAndSet(i) > 0) {
          SingleZipArray$ZipCoordinator tobservers = this.observers;
          int len = tobservers.length;
          for (; i < len; i = i + 1) {
             tobservers[i].dispose();
          }
       }
       return;
    }
    public void disposeExcept(int p0){
       SingleZipArray$ZipCoordinator tobservers = this.observers;
       int len = tobservers.length;
       for (int i = 0; i < p0; i = i + 1) {
          tobservers[i].dispose();
       }
       p0++;
       while (p0 < len) {
          tobservers[p0].dispose();
       }
       return;
    }
    public void innerError(Throwable p0,int p1){
       if (this.getAndSet(0) > 0) {
          this.disposeExcept(p1);
          this.actual.onError(p0);
       }else {
          a.l(p0);
       }
       return;
    }
    public void innerSuccess(Object p0,int p1){
       this.values[p1] = p0;
       if (!this.decrementAndGet()) {
          p0 = this.zipper.apply(this.values);
          a.c(p0, "The zipper returned a null value");
          this.actual.onSuccess(p0);
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.get() <= 0)? true: false;
       return b;
    }
}
