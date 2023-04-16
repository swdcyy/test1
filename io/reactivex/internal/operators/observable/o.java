package io.reactivex.internal.operators.observable.o;
import io.reactivex.internal.fuseable.d;
import brd.a0;
import brd.w;
import java.util.concurrent.Callable;
import erd.b;
import brd.d0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.o$a;
import brd.y;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import brd.t;
import io.reactivex.internal.operators.observable.n;
import ird.a;

public final class o extends a0 implements d	// class@0013eb
{
    public final w b;
    public final Callable c;
    public final b d;

    public void o(w p0,Callable p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void S(d0 p0){
       Object obj = this.c.call();
       a.c(obj, "The initialSupplier returned a null value");
       this.b.subscribe(new o$a(p0, obj, this.d));
    }
    public t c(){
       return a.h(new n(this.b, this.c, this.d));
    }
}
