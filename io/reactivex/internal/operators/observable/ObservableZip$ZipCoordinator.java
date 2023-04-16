package io.reactivex.internal.operators.observable.ObservableZip$ZipCoordinator;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import erd.o;
import io.reactivex.internal.operators.observable.ObservableZip$a;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import io.reactivex.internal.queue.a;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Arrays;
import drd.a;
import brd.w;

public final class ObservableZip$ZipCoordinator extends AtomicInteger implements b	// class@001399
{
    public final y actual;
    public boolean cancelled;
    public final boolean delayError;
    public final ObservableZip$a[] observers;
    public final Object[] row;
    public final o zipper;
    public static final long serialVersionUID = 0x296842a962149c03;

    public void ObservableZip$ZipCoordinator(y p0,o p1,int p2,boolean p3){
       super();
       this.actual = p0;
       this.zipper = p1;
       ObservableZip$a[] uoaArray = new ObservableZip$a[p2];
       this.observers = uoaArray;
       Object[] objArray = new Object[p2];
       this.row = objArray;
       this.delayError = p3;
    }
    public void cancel(){
       this.clear();
       this.cancelSources();
    }
    public void cancelSources(){
       ObservableZip$ZipCoordinator tobservers = this.observers;
       int len = tobservers.length;
       for (int i = 0; i < len; i = i + 1) {
          DisposableHelper.dispose(tobservers[i].e);
       }
       return;
    }
    public boolean checkTerminated(boolean p0,boolean p1,y p2,boolean p3,ObservableZip$a p4){
       ObservableZip$a d;
       if (this.cancelled != null) {
          this.cancel();
          return true;
       }else if(p0){
          if (p3) {
             if (p1) {
                d = p4.d;
                this.cancel();
                if (d != null) {
                   p2.onError(d);
                }else {
                   p2.onComplete();
                }
                return true;
             }
          }else {
             d = p4.d;
             if (d != null) {
                this.cancel();
                p2.onError(d);
                return true;
             }else if(p1){
                this.cancel();
                p2.onComplete();
                return true;
             }
          }
       }
       return false;
    }
    public void clear(){
       ObservableZip$ZipCoordinator tobservers = this.observers;
       int len = tobservers.length;
       for (int i = 0; i < len; i = i + 1) {
          tobservers[i].b.clear();
       }
       return;
    }
    public void dispose(){
       if (this.cancelled == null) {
          this.cancelled = true;
          this.cancelSources();
          if (!this.getAndIncrement()) {
             this.clear();
          }
       }
       return;
    }
    public void drain(){
       ObservableZip$ZipCoordinator zipCoordinat = this;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableZip$ZipCoordinator observers = zipCoordinat.observers;
       ObservableZip$ZipCoordinator actual = zipCoordinat.actual;
       ObservableZip$ZipCoordinator row = zipCoordinat.row;
       ObservableZip$ZipCoordinator delayError = zipCoordinat.delayError;
       int i = 1;
    label_0013 :
       int len = observers.length;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (true) {
          if (i1 < len) {
             object oobject = observers[i1];
             if (row[i3] == null) {
                ObservableZip$a c = oobject.c;
                Object obj = oobject.b.poll();
                int i4 = (obj == null)? 1: 0;
                if (this.checkTerminated(c, i4, actual, delayError, oobject)) {
                   break ;
                }else if(!i4){
                   row[i3] = obj;
                }else {
                   i2 = i2 + 1;
                }
             }else if(oobject.c != null && delayError == null){
                ObservableZip$a d = oobject.d;
                if (d != null) {
                   this.cancel();
                   actual.onError(d);
                   return;
                }
             }
             i3 = i3 + 1;
             i1 = i1 + 1;
          }else if(i2){
             int i5 = - i;
             if (!zipCoordinat.addAndGet(i5)) {
                return;
             }
             goto label_0013 ;
          }else {
             Object obj1 = zipCoordinat.zipper.apply(row.clone());
             a.c(obj1, "The zipper returned a null value");
             actual.onNext(obj1);
             Arrays.fill(row, null);
             goto label_0013 ;
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public void subscribe(w[] p0,int p1){
       ObservableZip$ZipCoordinator tobservers = this.observers;
       int len = tobservers.length;
       int i = 0;
       for (int i1 = 0; i1 < len; i1 = i1 + 1) {
          tobservers[i1] = new ObservableZip$a(this, p1);
       }
       this.lazySet(i);
       this.actual.onSubscribe(this);
       while (true) {
          if (i >= len) {
             return;
          }
          if (this.cancelled != null) {
             break ;
          }else {
             p0[i].subscribe(tobservers[i]);
             i = i + 1;
          }
       }
       return;
    }
}
