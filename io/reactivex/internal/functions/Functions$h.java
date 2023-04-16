package io.reactivex.internal.functions.Functions$h;
import erd.o;
import erd.m;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class Functions$h implements o	// class@0011bd
{
    public final m b;

    public void Functions$h(m p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       if (p0.length == 8) {
          return this.b.a(p0[0], p0[1], p0[2], p0[3], p0[4], p0[5], p0[6], p0[7]);
       }
       throw new IllegalArgumentException("Array of size 8 expected but got "+p0.length);
    }
}
