package io.reactivex.internal.functions.Functions$g;
import erd.o;
import erd.l;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$g implements o	// class@0011bb
{
    public final l b;

    public void Functions$g(l p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 7) {
          return this.b.a(p0[0], p0[1], p0[2], p0[3], p0[4], p0[5], p0[6]);
       }
       throw new IllegalArgumentException("Array of size 7 expected but got "+p0.length);
    }
}
