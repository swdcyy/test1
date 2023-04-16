package io.reactivex.internal.functions.Functions$c;
import erd.o;
import erd.h;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$c implements o	// class@0011b5
{
    public final h b;

    public void Functions$c(h p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 3) {
          return this.b.a(p0[0], p0[1], p0[2]);
       }
       throw new IllegalArgumentException("Array of size 3 expected but got "+p0.length);
    }
}
