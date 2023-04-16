package io.reactivex.internal.operators.flowable.i$a;
import io.reactivex.internal.subscribers.a;
import io.reactivex.internal.fuseable.a;
import erd.r;
import java.lang.Object;
import java.lang.Throwable;
import cxd.d;
import io.reactivex.internal.fuseable.o;

public final class i$a extends a	// class@001276
{
    public final r f;

    public void i$a(a p0,r p1){
       super(p0);
       this.f = p1;
    }
    public boolean d(Object p0){
       boolean b = false;
       if (this.d != null) {
          return b;
       }
       if (this.e != null) {
          return this.actual.d(null);
       }
       if (this.f.test(p0) && this.actual.d(p0)) {
          b = true;
       }
       return b;
    }
    public void onNext(Object p0){
       if (!this.d(p0)) {
          this.b.request(1);
       }
       return;
    }
    public Object poll(){
       Object obj;
       a tc = this.c;
       i$a tf = this.f;
       while (true) {
          obj = tc.poll();
          if (obj == null) {
             return null;
          }
          if (tf.test(obj)) {
             break ;
          }else if(this.e == 2){
             tc.request(1);
          }
       }
       return obj;
    }
    public int requestFusion(int p0){
       return this.f(p0);
    }
}
