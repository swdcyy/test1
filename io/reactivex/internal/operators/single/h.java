package io.reactivex.internal.operators.single.h;
import brd.a0;
import java.util.concurrent.Callable;
import brd.d0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class h extends a0	// class@001492
{
    public final Callable b;

    public void h(Callable p0){
       super();
       this.b = p0;
    }
    public void S(d0 p0){
       Object obj = this.b.call();
       a.c(obj, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
       EmptyDisposable.error(obj, p0);
       return;
    }
}
