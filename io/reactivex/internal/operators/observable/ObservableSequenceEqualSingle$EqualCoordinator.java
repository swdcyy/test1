package io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator;
import crd.b;
import java.util.concurrent.atomic.AtomicInteger;
import brd.d0;
import brd.w;
import erd.d;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$a;
import io.reactivex.internal.disposables.ArrayCompositeDisposable;
import io.reactivex.internal.queue.a;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Boolean;
import drd.a;
import brd.y;

public final class ObservableSequenceEqualSingle$EqualCoordinator extends AtomicInteger implements b	// class@001366
{
    public final d0 actual;
    public boolean cancelled;
    public final d comparer;
    public final w first;
    public final ObservableSequenceEqualSingle$a[] observers;
    public final ArrayCompositeDisposable resources;
    public final w second;
    public Object v1;
    public Object v2;
    public static final long serialVersionUID = 0xaa434c55575f9e08;

    public void ObservableSequenceEqualSingle$EqualCoordinator(d0 p0,int p1,w p2,w p3,d p4){
       super();
       this.actual = p0;
       this.first = p2;
       this.second = p3;
       this.comparer = p4;
       ObservableSequenceEqualSingle$a[] uoaArray = new ObservableSequenceEqualSingle$a[]{new ObservableSequenceEqualSingle$a(this, 0, p1),new ObservableSequenceEqualSingle$a(this, 1, p1)};
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
             ObservableSequenceEqualSingle$EqualCoordinator tobservers = this.observers;
             tobservers[0].b.clear();
             tobservers[b].b.clear();
          }
       }
       return;
    }
    public void drain(){
       ObservableSequenceEqualSingle$a e;
       ObservableSequenceEqualSingle$a e1;
       if (this.getAndIncrement()) {
          return;
       }
       ObservableSequenceEqualSingle$EqualCoordinator tobservers = this.observers;
       object oobject = tobservers[0];
       ObservableSequenceEqualSingle$a b = oobject.b;
       object oobject1 = tobservers[1];
       ObservableSequenceEqualSingle$a b1 = oobject1.b;
       int i = 1;
       while (true) {
          if (this.cancelled != null) {
             b.clear();
             b1.clear();
             return;
          }else {
             ObservableSequenceEqualSingle$a d = oobject.d;
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
             ObservableSequenceEqualSingle$EqualCoordinator tv2 = this.v2;
             int i1 = (tv2 == null)? 1: 0;
             if (d != null && (e != null && (e1 && i1))) {
                this.actual.onSuccess(Boolean.TRUE);
                return;
             }else if(d != null && (e != null && e1 != i1)){
                this.cancel(b, b1);
                this.actual.onSuccess(Boolean.FALSE);
                return;
             }else if(!e1 && !i1){
                if (!this.comparer.a(this.v1, tv2)) {
                   this.cancel(b, b1);
                   this.actual.onSuccess(Boolean.FALSE);
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
       ObservableSequenceEqualSingle$EqualCoordinator tobservers = this.observers;
       this.first.subscribe(tobservers[0]);
       this.second.subscribe(tobservers[1]);
    }
}
