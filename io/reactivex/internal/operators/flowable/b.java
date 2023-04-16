package io.reactivex.internal.operators.flowable.b;
import io.reactivex.internal.fuseable.b;
import brd.a0;
import brd.h;
import java.util.concurrent.Callable;
import erd.b;
import brd.d0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.operators.flowable.b$a;
import brd.k;
import java.lang.Throwable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.flowable.FlowableCollect;
import ird.a;

public final class b extends a0 implements b	// class@001267
{
    public final h b;
    public final Callable c;
    public final b d;

    public void b(h p0,Callable p1,b p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void S(d0 p0){
       Object obj = this.c.call();
       a.c(obj, "The initialSupplier returned a null value");
       this.b.C(new b$a(p0, obj, this.d));
    }
    public h d(){
       return a.f(new FlowableCollect(this.b, this.c, this.d));
    }
}
