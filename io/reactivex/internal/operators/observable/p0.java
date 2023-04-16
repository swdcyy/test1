package io.reactivex.internal.operators.observable.p0;
import brd.t;
import java.util.concurrent.Callable;
import erd.c;
import erd.g;
import brd.y;
import java.lang.Object;
import io.reactivex.internal.operators.observable.p0$a;
import crd.b;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class p0 extends t	// class@0013ee
{
    public final Callable b;
    public final c c;
    public final g d;

    public void p0(Callable p0,c p1,g p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       p0$a uoa = new p0$a(p0, this.c, this.d, this.b.call());
       p0.onSubscribe(uoa);
       p0$a d = uoa.d;
       if (uoa.e != null) {
          uoa.d = null;
          uoa.a(d);
       }else {
          p0$a b = uoa.b;
          while (true) {
             if (uoa.e != null) {
                uoa.d = null;
                uoa.a(d);
                break ;
             }else {
                uoa.g = false;
                boolean b1 = true;
                d = b.a(d, uoa);
                if (uoa.f != null) {
                   uoa.e = b1;
                   uoa.d = null;
                   uoa.a(d);
                   break ;
                }
             }
          }
       }
       return;
    }
}
