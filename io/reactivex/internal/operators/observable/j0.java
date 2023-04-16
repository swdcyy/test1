package io.reactivex.internal.operators.observable.j0;
import brd.t;
import java.lang.Object;
import brd.y;
import io.reactivex.internal.operators.observable.j0$a;
import crd.b;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;

public final class j0 extends t	// class@0018e8
{
    public final Object[] b;

    public void j0(Object[] p0){
       super();
       this.b = p0;
    }
    public void subscribeActual(y p0){
       j0$a uoa = new j0$a(p0, this.b);
       p0.onSubscribe(uoa);
       if (uoa.d != null) {
          return;
       }
       j0$a b = uoa.b;
       int len = b.length;
       int i = 0;
       while (true) {
          if (i < len && !uoa.isDisposed()) {
             object oobject = b[i];
             if (oobject == null) {
                uoa.actual.onError(new NullPointerException("The "+i+"th element is null"));
                break ;
             }else {
                uoa.actual.onNext(oobject);
                i = i + 1;
             }
          }else if(!uoa.isDisposed()){
             uoa.actual.onComplete();
             break ;
          }else {
             break ;
          }
       }
       return;
    }
}
