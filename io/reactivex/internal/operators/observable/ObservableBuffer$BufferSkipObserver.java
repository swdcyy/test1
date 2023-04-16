package io.reactivex.internal.operators.observable.ObservableBuffer$BufferSkipObserver;
import brd.y;
import crd.b;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Callable;
import java.util.ArrayDeque;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import java.util.Iterator;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableBuffer$BufferSkipObserver extends AtomicBoolean implements y, b	// class@0012e6
{
    public final y actual;
    public final Callable bufferSupplier;
    public final ArrayDeque buffers;
    public final int count;
    public long index;
    public b s;
    public final int skip;
    public static final long serialVersionUID = 0x8de0a1c32dad5dee;

    public void ObservableBuffer$BufferSkipObserver(y p0,int p1,int p2,Callable p3){
       super();
       this.actual = p0;
       this.count = p1;
       this.skip = p2;
       this.bufferSupplier = p3;
       this.buffers = new ArrayDeque();
    }
    public void dispose(){
       this.s.dispose();
    }
    public boolean isDisposed(){
       return this.s.isDisposed();
    }
    public void onComplete(){
       while (!this.buffers.isEmpty()) {
          this.actual.onNext(this.buffers.poll());
       }
       this.actual.onComplete();
       return;
    }
    public void onError(Throwable p0){
       this.buffers.clear();
       this.actual.onError(p0);
    }
    public void onNext(Object p0){
       Iterator obj;
       ObservableBuffer$BufferSkipObserver tindex = this.index;
       this.index = 1 + tindex;
       if (!(tindex % (long)this.skip) - null) {
          obj = this.bufferSupplier.call();
          a.c(obj, "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
          this.buffers.offer(obj);
       }
       obj = this.buffers.iterator();
       while (obj.hasNext()) {
          Collection uCollection = obj.next();
          uCollection.add(p0);
          if (this.count <= uCollection.size()) {
             obj.remove();
             this.actual.onNext(uCollection);
          }
       }
       return;
    }
    public void onSubscribe(b p0){
       if (DisposableHelper.validate(this.s, p0)) {
          this.s = p0;
          this.actual.onSubscribe(this);
       }
       return;
    }
}
