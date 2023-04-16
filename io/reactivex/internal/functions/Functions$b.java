package io.reactivex.internal.functions.Functions$b;
import erd.o;
import erd.c;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$b implements o	// class@0011b3
{
    public final c b;

    public void Functions$b(c p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 2) {
          return this.b.a(p0[0], p0[1]);
       }
       throw new IllegalArgumentException("Array of size 2 expected but got "+p0.length);
    }
}
