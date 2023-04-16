package io.reactivex.internal.operators.single.SingleZipArray;
import brd.a0;
import brd.e0;
import erd.o;
import brd.d0;
import io.reactivex.internal.operators.single.l$a;
import io.reactivex.internal.operators.single.SingleZipArray$a;
import io.reactivex.internal.operators.single.SingleZipArray$ZipCoordinator;
import crd.b;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;

public final class SingleZipArray extends a0	// class@001481
{
    public final e0[] b;
    public final o c;

    public void SingleZipArray(e0[] p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       SingleZipArray tb = this.b;
       int len = tb.length;
       int i = 0;
       if (len == 1) {
          tb[i].b(new l$a(p0, new SingleZipArray$a(this)));
          return;
       }else {
          SingleZipArray$ZipCoordinator zipCoordinat = new SingleZipArray$ZipCoordinator(p0, len, this.c);
          p0.onSubscribe(zipCoordinat);
          while (true) {
             if (i >= len) {
                return;
             }
             if (zipCoordinat.isDisposed()) {
                break ;
             }else {
                object oobject = tb[i];
                if (oobject == null) {
                   zipCoordinat.innerError(new NullPointerException("One of the sources is null"), i);
                   return;
                }else {
                   oobject.b(zipCoordinat.observers[i]);
                   i = i + 1;
                }
             }
          }
          return;
       }
    }
}
