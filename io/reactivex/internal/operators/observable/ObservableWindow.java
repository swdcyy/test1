package io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import brd.y;
import io.reactivex.internal.operators.observable.ObservableWindow$WindowExactObserver;
import io.reactivex.internal.operators.observable.ObservableWindow$WindowSkipObserver;

public final class ObservableWindow extends a	// class@00138b
{
    public final long c;
    public final long d;
    public final int e;

    public void ObservableWindow(w p0,long p1,long p2,int p3){
       super(p0);
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public void subscribeActual(y p0){
       if (!this.c - this.d) {
          this.b.subscribe(new ObservableWindow$WindowExactObserver(p0, this.c, this.e));
       }else {
          ObservableWindow$WindowSkipObserver windowSkipOb = new ObservableWindow$WindowSkipObserver(p0, this.c, this.d, this.e);
          this.b.subscribe(v8);
       }
       return;
    }
}
