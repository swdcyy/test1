package io.reactivex.internal.operators.observable.j0$a;
import io.reactivex.internal.observers.b;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;

public final class j0$a extends b	// class@0018e7
{
    public final y actual;
    public final Object[] b;
    public int c;
    public boolean d;
    public boolean e;

    public void j0$a(y p0,Object[] p1){
       super();
       this.actual = p0;
       this.b = p1;
    }
    public void clear(){
       this.c = this.b.length;
    }
    public void dispose(){
       this.e = true;
    }
    public boolean isDisposed(){
       return this.e;
    }
    public boolean isEmpty(){
       boolean b = (this.c == this.b.length)? true: false;
       return b;
    }
    public Object poll(){
       j0$a tc = this.c;
       j0$a tb = this.b;
       if (tc == tb.length) {
          return null;
       }
       this.c = tc + 1;
       object oobject = tb[tc];
       a.c(oobject, "The array element is null");
       return oobject;
    }
    public int requestFusion(int p0){
       if (!(p0 & 1)) {
          return 0;
       }
       this.d = true;
       return 1;
    }
}
