package io.reactivex.internal.operators.observable.x0;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import io.reactivex.h;
import brd.y;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import drd.a;
import ird.a;
import java.lang.NullPointerException;

public final class x0 extends a	// class@00142e
{
    public final h c;

    public void x0(w p0,h p1){
       super(p0);
       this.c = p1;
    }
    public void subscribeActual(y p0){
       try{
          p0 = this.c.a(p0);
          a.c(p0, "Operator "+this.c+" returned a null Observer");
          this.b.subscribe(p0);
          return;
       }catch(java.lang.NullPointerException e3){
          throw e3;
       }
    }
}
