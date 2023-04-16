package io.reactivex.internal.operators.observable.i1;
import io.reactivex.internal.operators.observable.a;
import brd.w;
import java.util.concurrent.Callable;
import erd.c;
import brd.y;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.observable.i1$a;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class i1 extends a	// class@0013c7
{
    public final c c;
    public final Callable d;

    public void i1(w p0,Callable p1,c p2){
       super(p0);
       this.c = p2;
       this.d = p1;
    }
    public void subscribeActual(y p0){
       Object obj = this.d.call();
       a.c(obj, "The seed supplied is null");
       this.b.subscribe(new i1$a(p0, this.c, obj));
    }
}
