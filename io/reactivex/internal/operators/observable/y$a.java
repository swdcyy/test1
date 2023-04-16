package io.reactivex.internal.operators.observable.y$a;
import io.reactivex.internal.observers.a;
import brd.y;
import erd.o;
import erd.d;
import java.lang.Object;
import java.lang.Throwable;
import io.reactivex.internal.fuseable.o;

public final class y$a extends a	// class@001435
{
    public final o f;
    public final d g;
    public Object h;
    public boolean i;

    public void y$a(y p0,o p1,d p2){
       super(p0);
       this.f = p1;
       this.g = p2;
    }
    public void onNext(Object p0){
       if (this.d != null) {
          return;
       }
       if (this.e != null) {
          this.actual.onNext(p0);
          return;
       }else {
          Object obj = this.f.apply(p0);
          if (this.i != null) {
             this.h = obj;
             if (this.g.a(this.h, obj)) {
                return;
             }
          }else {
             this.i = true;
             this.h = obj;
          }
          this.actual.onNext(p0);
          return;
       }
    }
    public Object poll(){
       Object obj;
       Object obj1;
       while (true) {
          obj = this.c.poll();
          if (obj == null) {
             return null;
          }
          obj1 = this.f.apply(obj);
          if (this.i == null) {
             this.i = true;
             this.h = obj1;
             return obj;
          }else if(!this.g.a(this.h, obj1)){
             break ;
          }else {
             this.h = obj1;
          }
       }
       this.h = obj1;
       return obj;
    }
    public int requestFusion(int p0){
       return this.e(p0);
    }
}
