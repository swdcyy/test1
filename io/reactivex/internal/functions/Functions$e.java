package io.reactivex.internal.functions.Functions$e;
import erd.o;
import erd.j;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$e implements o	// class@0011b7
{
    public final j b;

    public void Functions$e(j p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 5) {
          return this.b.a(p0[0], p0[1], p0[2], p0[3], p0[4]);
       }
       throw new IllegalArgumentException("Array of size 5 expected but got "+p0.length);
    }
}
