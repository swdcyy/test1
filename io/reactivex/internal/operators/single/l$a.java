package io.reactivex.internal.operators.single.l$a;
import brd.d0;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import java.lang.String;
import io.reactivex.internal.functions.a;
import drd.a;

public final class l$a implements d0	// class@001496
{
    public final d0 b;
    public final o c;

    public void l$a(d0 p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void onError(Throwable p0){
       this.b.onError(p0);
    }
    public void onSubscribe(b p0){
       this.b.onSubscribe(p0);
    }
    public void onSuccess(Object p0){
       p0 = this.c.apply(p0);
       a.c(p0, "The mapper function returned a null value.");
       this.b.onSuccess(p0);
    }
}
