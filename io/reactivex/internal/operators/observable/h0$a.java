package io.reactivex.internal.operators.observable.h0$a;
import io.reactivex.internal.observers.a;
import brd.y;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.o;

public final class h0$a extends a	// class@0018e1
{
    public final r f;

    public void h0$a(y p0,r p1){
       super(p0);
       this.f = p1;
    }
    public void onNext(Object p0){
       if (this.e == null) {
          if (this.f.test(p0)) {
             this.actual.onNext(p0);
          }
       }else {
          this.actual.onNext(null);
       }
       return;
    }
    public Object poll(){
       Object obj;
       do {
          obj = this.c.poll();
       } while (obj == null || this.f.test(obj));
       return obj;
    }
    public int requestFusion(int p0){
       return this.e(p0);
    }
}
