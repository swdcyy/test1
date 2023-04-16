package io.reactivex.internal.operators.observable.ObservableAmb$a;
import crd.b;
import brd.y;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import io.reactivex.internal.operators.observable.ObservableAmb$AmbInnerObserver;

public final class ObservableAmb$a implements b	// class@0012e4
{
    public final y actual;
    public final ObservableAmb$AmbInnerObserver[] b;
    public final AtomicInteger c;

    public void ObservableAmb$a(y p0,int p1){
       super();
       this.c = new AtomicInteger();
       this.actual = p0;
       ObservableAmb$AmbInnerObserver[] uAmbInnerObs = new ObservableAmb$AmbInnerObserver[p1];
       this.b = uAmbInnerObs;
    }
    public boolean a(int p0){
       int i = this.c.get();
       boolean b = true;
       int i1 = 0;
       if (!i) {
          if (this.c.compareAndSet(i1, p0)) {
             ObservableAmb$a tb = this.b;
             int len = tb.length;
             while (i1 < len) {
                int i2 = i1 + 1;
                if (i2 != p0) {
                   tb[i1].dispose();
                }
                i1 = i2;
             }
             return b;
          }else {
             return i1;
          }
       }else if(i == p0){
          b = false;
       }
       return b;
    }
    public void dispose(){
       int i = -1;
       if (this.c.get() != i) {
          this.c.lazySet(i);
          ObservableAmb$a tb = this.b;
          i = tb.length;
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             tb[i1].dispose();
          }
       }
       return;
    }
    public boolean isDisposed(){
       boolean b = (this.c.get() == -1)? true: false;
       return b;
    }
}
