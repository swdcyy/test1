package io.reactivex.internal.functions.Functions$d;
import erd.o;
import erd.i;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$d implements o	// class@0011b6
{
    public final i b;

    public void Functions$d(i p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 4) {
          return this.b.a(p0[0], p0[1], p0[2], p0[3]);
       }
       throw new IllegalArgumentException("Array of size 4 expected but got "+p0.length);
    }
}
