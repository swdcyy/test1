package io.reactivex.internal.operators.observable.ObservableRangeLong$RangeDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Long;
import java.lang.Object;

public final class ObservableRangeLong$RangeDisposable extends BasicIntQueueDisposable	// class@001333
{
    public final y actual;
    public final long end;
    public boolean fused;
    public long index;
    public static final long serialVersionUID = 0x580b77479f42190;

    public void ObservableRangeLong$RangeDisposable(y p0,long p1,long p2){
       super();
       this.actual = p0;
       this.index = p1;
       this.end = p2;
    }
    public void clear(){
       this.index = this.end;
       this.lazySet(1);
    }
    public void dispose(){
       this.set(1);
    }
    public boolean isDisposed(){
       boolean b = (this.get())? true: false;
       return b;
    }
    public boolean isEmpty(){
       boolean b = (!this.index - this.end)? true: false;
       return b;
    }
    public Long poll(){
       ObservableRangeLong$RangeDisposable tindex = this.index;
       if (tindex - this.end) {
          this.index = 1 + tindex;
          return Long.valueOf(tindex);
       }else {
          this.lazySet(1);
          return null;
       }
    }
    public Object poll(){
       return this.poll();
    }
    public int requestFusion(int p0){
       if (!(p0 & 1)) {
          return 0;
       }
       this.fused = true;
       return 1;
    }
    public void run(){
       if (this.fused != null) {
          return;
       }
       ObservableRangeLong$RangeDisposable tactual = this.actual;
       ObservableRangeLong$RangeDisposable tend = this.end;
       ObservableRangeLong$RangeDisposable tindex = this.index;
       while (tindex - tend && !this.get()) {
          tactual.onNext(Long.valueOf(tindex));
          tindex = tindex + 1;
       }
       if (!this.get()) {
          this.lazySet(1);
          tactual.onComplete();
       }
       return;
    }
}
