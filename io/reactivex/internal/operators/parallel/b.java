package io.reactivex.internal.operators.parallel.b;
import hrd.a;
import erd.o;
import cxd.c;
import io.reactivex.internal.fuseable.a;
import io.reactivex.internal.operators.parallel.b$a;
import io.reactivex.internal.operators.parallel.b$b;

public final class b extends a	// class@001458
{
    public final a a;
    public final o b;

    public void b(a p0,o p1){
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
          uocArray[i] = (oobject instanceof a)? new b$a(oobject, this.b): new b$b(oobject, this.b);
          i = i + 1;
       }
       this.a.e(uocArray);
       return;
    }
}
