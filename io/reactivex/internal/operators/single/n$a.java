package io.reactivex.internal.operators.single.n$a;
import brd.d0;
import io.reactivex.internal.operators.single.n;
import java.lang.Object;
import java.lang.Throwable;
import erd.o;
import drd.a;
import io.reactivex.exceptions.CompositeException;
import java.lang.NullPointerException;
import java.lang.String;
import crd.b;

public final class n$a implements d0	// class@001499
{
    public final d0 b;
    public final n c;

    public void n$a(n p0,d0 p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void onError(Throwable p0){
       n$a tc = this.c;
       n c = tc.c;
       n on = (c != null)? c.apply(p0): tc.d;
       if (on == null) {
          NullPointerException nullPointerE = new NullPointerException("Value supplied was null");
          nullPointerE.initCause(p0);
          this.b.onError(nullPointerE);
          return;
       }else {
          this.b.onSuccess(on);
          return;
       }
    }
    public void onSubscribe(b p0){
       this.b.onSubscribe(p0);
    }
    public void onSuccess(Object p0){
       this.b.onSuccess(p0);
    }
}
