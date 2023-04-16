package io.reactivex.internal.operators.observable.y0$a;
import io.reactivex.internal.observers.a;
import brd.y;
import erd.o;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.o;

public final class y0$a extends a	// class@00191c
{
    public final o f;

    public void y0$a(y p0,o p1){
       super(p0);
       this.f = p1;
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       if (this.e != null) {
          this.actual.onNext(null);
          return;
       }else {
          p0 = this.f.apply(p0);
          a.c(p0, "The mapper function returned a null value.");
          this.actual.onNext(p0);
          return;
       }
    }
    public Object poll(){
       Object obj = this.c.poll();
       if (obj != null) {
          obj = this.f.apply(obj);
          a.c(obj, "The mapper function returned a null value.");
       }else {
          obj = null;
       }
       return obj;
    }
    public int requestFusion(int p0){
       return this.e(p0);
    }
}
