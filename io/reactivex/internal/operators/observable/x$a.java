package io.reactivex.internal.operators.observable.x$a;
import io.reactivex.internal.observers.a;
import brd.y;
import erd.o;
import java.util.Collection;
import java.lang.Throwable;
import ird.a;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.fuseable.o;

public final class x$a extends a	// class@00142d
{
    public final Collection f;
    public final o g;

    public void x$a(y p0,o p1,Collection p2){
       super(p0);
       this.g = p1;
       this.f = p2;
    }
    public void clear(){
       this.f.clear();
       super.clear();
    }
    public void onComplete(){
       if (this.d == null) {
          this.d = true;
          this.f.clear();
          this.actual.onComplete();
       }
       return;
    }
    public void onError(Throwable p0){
       if (this.d != null) {
          a.l(p0);
       }else {
          this.d = true;
          this.f.clear();
          this.actual.onError(p0);
       }
       return;
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       if (this.e == null) {
          Object obj = this.g.apply(p0);
          a.c(obj, "The keySelector returned a null key");
          if (this.f.add(obj)) {
             this.actual.onNext(p0);
          }
       }else {
          this.actual.onNext(null);
       }
       return;
    }
    public Object poll(){
       Object obj = this.c.poll();
       while (obj != null) {
          Object obj1 = this.g.apply(obj);
          a.c(obj1, "The keySelector returned a null key");
          if (this.f.add(obj1)) {
             break ;
          }
       }
       return obj;
    }
    public int requestFusion(int p0){
       return this.e(p0);
    }
}
