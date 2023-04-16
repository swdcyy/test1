package io.reactivex.internal.operators.observable.ObservableRange$RangeDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import brd.y;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Integer;
import java.lang.Object;

public final class ObservableRange$RangeDisposable extends BasicIntQueueDisposable	// class@001331
{
    public final y actual;
    public final long end;
    public boolean fused;
    public long index;
    public static final long serialVersionUID = 0x580b77479f42190;

    public void ObservableRange$RangeDisposable(y p0,long p1,long p2){
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
    public Integer poll(){
       ObservableRange$RangeDisposable tindex = this.index;
       if (tindex - this.end) {
          this.index = 1 + tindex;
          return Integer.valueOf((int)tindex);
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
       ObservableRange$RangeDisposable tactual = this.actual;
       ObservableRange$RangeDisposable tend = this.end;
       ObservableRange$RangeDisposable tindex = this.index;
       while (tindex - tend && !this.get()) {
          tactual.onNext(Integer.valueOf((int)tindex));
          tindex = tindex + 1;
       }
       if (!this.get()) {
          this.lazySet(1);
          tactual.onComplete();
       }
       return;
    }
}
