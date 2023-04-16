package io.reactivex.internal.operators.observable.ObservableBuffer;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.Callable;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableBuffer$a;
import io.reactivex.internal.operators.observable.ObservableBuffer$BufferSkipObserver;

public final class ObservableBuffer extends a	// class@0012e8
{
    public final int c;
    public final int d;
    public final Callable e;

    public void ObservableBuffer(w p0,int p1,int p2,Callable p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       ObservableBuffer tc = this.c;
       if (this.d == tc) {
          ObservableBuffer$a uoa = new ObservableBuffer$a(p0, tc, this.e);
          if (uoa.a()) {
             this.b.subscribe(uoa);
          }
       }else {
          this.b.subscribe(new ObservableBuffer$BufferSkipObserver(p0, this.c, this.d, this.e));
       }
       return;
    }
}
