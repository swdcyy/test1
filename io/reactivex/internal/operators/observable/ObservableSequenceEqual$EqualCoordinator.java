package io.reactivex.internal.operators.observable.ObservableSequenceEqual$EqualCoordinator;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.y;
import brd.w;
import erd.d;
import io.reactivex.internal.operators.observable.ObservableSequenceEqual$a;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.a;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Boolean;
import drd.a;

public final class ObservableSequenceEqual$EqualCoordinator extends AtomicInteger implements b	// class@001363
{
    public final y actual;
    public boolean cancelled;
    public final d comparer;
    public final w first;
    public final ObservableSequenceEqual$a[] observers;
    public final ArrayCompositeDisposable resources;
    public final w second;
    public Object v1;
    public Object v2;
    public static final long serialVersionUID = 0xaa434c55575f9e08;

    public void ObservableSequenceEqual$EqualCoordinator(y p0,int p1,w p2,w p3,d p4){
       super();
       this.actual = p0;
       this.first = p2;
       this.second = p3;
       this.comparer = p4;
       ObservableSequenceEqual$a[] uoaArray = new ObservableSequenceEqual$a[]{new ObservableSequenceEqual$a(this, 0, p1),new ObservableSequenceEqual$a(this, 1, p1)};
       this.observers = uoaArray;
       this.resources = new ArrayCompositeDisposable(2);
    }
    public void cancel(a p0,a p1){
       this.cancelled = true;
       p0.clear();
       p1.clear();
    }
    public void dispose(){
       if (this.cancelled == null) {
          boolean b = true;
          this.cancelled = b;
          this.resources.dispose();
          if (!this.getAndIncrement()) {
             ObservableSequenceEqual$EqualCoordinator tobservers = this.observers;
             tobservers[0].b.clear();
             tobservers[b].b.clear();
          }
       }
       return;
    }
    public void drain(){
       ObservableSequenceEqual$a e;
       ObservableSequenceEqual$a e1;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableSequenceEqual$EqualCoordinator tobservers = this.observers;
       object oobject = tobservers[0];
       ObservableSequenceEqual$a b = oobject.b;
       object oobject1 = tobservers[1];
       ObservableSequenceEqual$a b1 = oobject1.b;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             b.clear();
             b1.clear();
             return;
          }else {
             ObservableSequenceEqual$a d = oobject.d;
             if (d != null) {
                e = oobject.e;
                if (e != null) {
                   this.cancel(b, b1);
                   this.actual.onError(e);
                   return;
                }
             }
             e = oobject1.d;
             if (e != null) {
                e1 = oobject1.e;
                if (e1 != null) {
                   this.cancel(b, b1);
                   this.actual.onError(e1);
                   return;
                }
             }
             if (this.v1 == null) {
                this.v1 = b.poll();
             }
             e1 = (this.v1 == null)? 1: null;
             if (this.v2 == null) {
                this.v2 = b1.poll();
             }
             ObservableSequenceEqual$EqualCoordinator tv2 = this.v2;
             int i1 = (tv2 == null)? 1: 0;
             if (d != null && (e != null && (e1 && i1))) {
                this.actual.onNext(Boolean.TRUE);
                this.actual.onComplete();
                return;
             }else if(d != null && (e != null && e1 != i1)){
                this.cancel(b, b1);
                this.actual.onNext(Boolean.FALSE);
                this.actual.onComplete();
                return;
             }else if(!e1 && !i1){
                if (!this.comparer.a(this.v1, tv2)) {
                   this.cancel(b, b1);
                   this.actual.onNext(Boolean.FALSE);
                   this.actual.onComplete();
                   return;
                }else {
                   Object obj = null;
                   this.v1 = obj;
                   this.v2 = obj;
                }
             }
             if (e1 || i1) {
                i = - i;
                if (!this.addAndGet(i)) {
                   break ;
                }
             }
          }
       }
       return;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public boolean setDisposable(b p0,int p1){
       return this.resources.setResource(p1, p0);
    }
    public void subscribe(){
       ObservableSequenceEqual$EqualCoordinator tobservers = this.observers;
       this.first.subscribe(tobservers[0]);
       this.second.subscribe(tobservers[1]);
    }
}
