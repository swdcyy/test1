package io.reactivex.internal.operators.observable.z1;
import brd.t;
import java.lang.Iterable;
import erd.c;
import brd.y;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.observable.z1$a;
import java.lang.Throwable;
import drd.a;

public final class z1 extends t	// class@001443
{
    public final t b;
    public final Iterable c;
    public final c d;

    public void z1(t p0,Iterable p1,c p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public void subscribeActual(y p0){
       Iterator iterator = this.c.iterator();
       a.c(iterator, "The iterator returned by other is null");
       if (!iterator.hasNext()) {
          EmptyDisposable.complete(p0);
          return;
       }else {
          this.b.subscribe(new z1$a(p0, iterator, this.d));
          return;
       }
    }
}
