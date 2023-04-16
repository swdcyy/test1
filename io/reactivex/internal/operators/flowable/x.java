package io.reactivex.internal.operators.flowable.x;
import io.reactivex.internal.fuseable.b;
import brd.a0;
import brd.h;
import java.util.concurrent.Callable;
import io.reactivex.internal.util.ArrayListSupplier;
import brd.d0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import java.util.Collection;
import io.reactivex.internal.operators.flowable.x$a;
import brd.k;
import java.lang.Throwable;
import drd.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.flowable.FlowableToList;
import ird.a;

public final class x extends a0 implements b	// class@00128f
{
    public final h b;
    public final Callable c;

    public void x(h p0){
       super();
       this.b = p0;
       this.c = ArrayListSupplier.asCallable();
    }
    public void S(d0 p0){
       Object obj = this.c.call();
       a.c(obj, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.");
       this.b.C(new x$a(p0, obj));
    }
    public h d(){
       return a.f(new FlowableToList(this.b, this.c));
    }
}
