package io.reactivex.internal.operators.flowable.o$a;
import io.reactivex.internal.subscribers.a;
import io.reactivex.internal.fuseable.a;
import erd.o;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import cxd.c;
import io.reactivex.internal.fuseable.o;

public final class o$a extends a	// class@001280
{
    public final o f;

    public void o$a(a p0,o p1){
       super(p0);
       this.f = p1;
    }
    public boolean d(Object p0){
       if (this.d != null) {
          return false;
       }
       p0 = this.f.apply(p0);
       a.c(p0, "The mapper function returned a null value.");
       return this.actual.d(p0);
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
       return this.f(p0);
    }
}
