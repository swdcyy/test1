package io.reactivex.internal.operators.observable.c;
import java.lang.Iterable;
import brd.w;
import java.lang.Object;
import java.util.Iterator;
import io.reactivex.internal.operators.observable.c$a;
import brd.y;
import io.reactivex.internal.operators.observable.c$a$a;

public final class c implements Iterable	// class@0013a9
{
    public final w b;
    public final Object c;

    public void c(w p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Iterator iterator(){
       c$a uoa = new c$a(this.c);
       this.b.subscribe(uoa);
       return new c$a$a(uoa);
    }
}
