package io.reactivex.internal.operators.observable.g1;
import brd.a0;
import brd.w;
import java.util.concurrent.Callable;
import erd.c;
import brd.d0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.f1$a;
import brd.y;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class g1 extends a0	// class@0013be
{
    public final w b;
    public final Callable c;
    public final c d;

    public void g1(w p0,Callable p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void S(d0 p0){
       Object obj = this.c.call();
       a.c(obj, "The seedSupplier returned a null value");
       this.b.subscribe(new f1$a(p0, this.d, obj));
    }
}
