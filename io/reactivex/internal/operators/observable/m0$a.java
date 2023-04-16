package io.reactivex.internal.operators.observable.m0$a;
import io.reactivex.internal.observers.b;
import brd.y;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;

public final class m0$a extends b	// class@0013db
{
    public final y actual;
    public final Iterator b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    public void m0$a(y p0,Iterator p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void clear(){
       this.e = true;
    }
    public void dispose(){
       this.c = true;
    }
    public boolean isDisposed(){
       return this.c;
    }
    public boolean isEmpty(){
       return this.e;
    }
    public Object poll(){
       Object obj = null;
       if (this.e != null) {
          return obj;
       }
       if (this.f != null) {
          if (!this.b.hasNext()) {
             this.e = true;
             return obj;
          }
       }else {
          this.f = true;
       }
       Object obj1 = this.b.next();
       a.c(obj1, "The iterator returned a null value");
       return obj1;
    }
    public int requestFusion(int p0){
       if (!(p0 & 1)) {
          return 0;
       }
       this.d = true;
       return 1;
    }
}
