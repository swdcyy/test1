package io.reactivex.internal.operators.observable.d;
import java.lang.Iterable;
import brd.w;
import java.lang.Object;
import java.util.Iterator;
import io.reactivex.internal.operators.observable.d$b;
import io.reactivex.internal.operators.observable.d$a;

public final class d implements Iterable	// class@0013b0
{
    public final w b;

    public void d(w p0){
       super();
       this.b = p0;
    }
    public Iterator iterator(){
       return new d$a(this.b, new d$b());
    }
}
