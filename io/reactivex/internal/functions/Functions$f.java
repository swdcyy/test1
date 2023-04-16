package io.reactivex.internal.functions.Functions$f;
import erd.o;
import erd.k;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$f implements o	// class@0011b9
{
    public final k b;

    public void Functions$f(k p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 6) {
          return this.b.a(p0[0], p0[1], p0[2], p0[3], p0[4], p0[5]);
       }
       throw new IllegalArgumentException("Array of size 6 expected but got "+p0.length);
    }
}
