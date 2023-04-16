package io.reactivex.internal.operators.single.g$a;
import brd.d0;
import io.reactivex.internal.operators.single.g;
import java.lang.Object;
import java.lang.Throwable;
import crd.b;
import erd.g;
import drd.a;

public final class g$a implements d0	// class@001490
{
    public final d0 b;
    public final g c;

    public void g$a(g p0,d0 p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void onError(Throwable p0){
       this.b.onError(p0);
    }
    public void onSubscribe(b p0){
       this.b.onSubscribe(p0);
    }
    public void onSuccess(Object p0){
       this.c.c.accept(p0);
       this.b.onSuccess(p0);
    }
}
