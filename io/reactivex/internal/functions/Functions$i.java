package io.reactivex.internal.functions.Functions$i;
import erd.o;
import erd.n;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$i implements o	// class@0011bf
{
    public final n b;

    public void Functions$i(n p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 9) {
          return this.b.a(p0[0], p0[1], p0[2], p0[3], p0[4], p0[5], p0[6], p0[7], p0[8]);
       }
       throw new IllegalArgumentException("Array of size 9 expected but got "+p0.length);
    }
}
