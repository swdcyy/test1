package io.reactivex.internal.functions.Functions$x;
import erd.o;
import java.util.Comparator;
import java.lang.Object;
import java.util.List;
import java.util.Collections;

public final class Functions$x implements o	// class@0011c5
{
    public final Comparator b;

    public void Functions$x(Comparator p0){
       super();
       this.b = p0;
    }
    public Object apply(Object p0){
       Collections.sort(p0, this.b);
       return p0;
    }
}
