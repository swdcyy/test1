package io.reactivex.internal.operators.observable.w1;
import io.reactivex.internal.fuseable.d;
import brd.a0;
import brd.w;
import java.util.concurrent.Callable;
import io.reactivex.internal.functions.Functions;
import brd.d0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import io.reactivex.internal.operators.observable.w1$a;
import brd.y;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import brd.t;
import io.reactivex.internal.operators.observable.v1;
import ird.a;

public final class w1 extends a0 implements d	// class@00142b
{
    public final w b;
    public final Callable c;

    public void w1(w p0,int p1){
       super();
       this.b = p0;
       this.c = Functions.b(p1);
    }
    public void w1(w p0,Callable p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void S(d0 p0){
       Object obj = this.c.call();
       a.c(obj, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
       this.b.subscribe(new w1$a(p0, obj));
    }
    public t c(){
       return a.h(new v1(this.b, this.c));
    }
}
