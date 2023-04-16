package io.reactivex.internal.operators.parallel.a;
import hrd.a;
import erd.r;
import cxd.c;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.parallel.a$b;
import io.reactivex.internal.operators.parallel.a$c;

public final class a extends a	// class@001455
{
    public final a a;
    public final r b;

    public void a(a p0,r p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public int b(){
       return this.a.b();
    }
    public void e(c[] p0){
       if (!this.f(p0)) {
          return;
       }
       int len = p0.length;
       c[] uocArray = new c[len];
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          uocArray[i] = (oobject instanceof a)? new a$b(oobject, this.b): new a$c(oobject, this.b);
          i = i + 1;
       }
       this.a.e(uocArray);
       return;
    }
}
