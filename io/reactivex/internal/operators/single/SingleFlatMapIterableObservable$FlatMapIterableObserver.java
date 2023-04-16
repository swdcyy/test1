package io.reactivex.internal.operators.single.SingleFlatMapIterableObservable$FlatMapIterableObserver;
import brd.d0;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import brd.y;
import erd.o;
import crd.b;
import io.reactivex.internal.disposables.DisposableHelper;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Iterable;
import java.util.Iterator;
import drd.a;
import java.lang.String;
import io.reactivex.internal.functions.a;

public final class SingleFlatMapIterableObservable$FlatMapIterableObserver extends BasicIntQueueDisposable implements d0	// class@001468
{
    public final y actual;
    public boolean cancelled;
    public b d;
    public Iterator it;
    public final o mapper;
    public boolean outputFused;
    public static final long serialVersionUID = 0x83f2fc6faa158152;

    public void SingleFlatMapIterableObservable$FlatMapIterableObserver(y p0,o p1){
       super();
       this.actual = p0;
       this.mapper = p1;
    }
    public void clear(){
       this.it = null;
    }
    public void dispose(){
       this.cancelled = true;
       this.d.dispose();
       this.d = DisposableHelper.DISPOSED;
    }
    public boolean isDisposed(){
       return this.cancelled;
    }
    public boolean isEmpty(){
       boolean b = (this.it == null)? true: false;
       return b;
    }
    public void onError(Throwable p0){
       this.d = DisposableHelper.DISPOSED;
       this.actual.onError(p0);
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.d, p0)) {
          this.d = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
    public void onSuccess(Object p0){
       SingleFlatMapIterableObservable$FlatMapIterableObserver tactual = this.actual;
       p0 = this.mapper.apply(p0).iterator();
       if (!p0.hasNext()) {
          tactual.onComplete();
          return;
       }else if(this.outputFused != null){
          this.it = p0;
          tactual.onNext(null);
          tactual.onComplete();
          return;
       }else {
          while (true) {
             if (this.cancelled != null) {
                return;
             }
             tactual.onNext(p0.next());
             if (this.cancelled != null) {
                return;
             }
             if (!p0.hasNext()) {
                break ;
             }
          }
          tactual.onComplete();
          return;
       }
    }
    public Object poll(){
       SingleFlatMapIterableObservable$FlatMapIterableObserver tit = this.it;
       if (tit == null) {
          return null;
       }
       Object obj = tit.next();
       a.c(obj, "The iterator returned a null value");
       if (!tit.hasNext()) {
          this.it = null;
       }
       return obj;
    }
    public int requestFusion(int p0){
       if (!(p0 & 2)) {
          return 0;
       }
       this.outputFused = true;
       return 2;
    }
}
