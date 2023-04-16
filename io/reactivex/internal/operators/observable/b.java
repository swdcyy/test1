package io.reactivex.internal.operators.observable.b;
import java.lang.Iterable;
import brd.w;
import java.lang.Object;
import java.util.Iterator;
import io.reactivex.internal.operators.observable.b$a;
import brd.t;
import brd.y;

public final class b implements Iterable	// class@0013a2
{
    public final w b;

    public void b(w p0){
       super();
       this.b = p0;
    }
    public Iterator iterator(){
       b$a uoa = new b$a();
       t.wrap(this.b).materialize().subscribe(uoa);
       return uoa;
    }
}
