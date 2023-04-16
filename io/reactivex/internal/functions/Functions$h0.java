package io.reactivex.internal.functions.Functions$h0;
import erd.b;
import erd.o;
import java.lang.Object;
import java.util.Map;

public final class Functions$h0 implements b	// class@0011bc
{
    public final o b;
    public final o c;

    public void Functions$h0(o p0,o p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public void accept(Object p0,Object p1){
       p0.put(this.c.apply(p1), this.b.apply(p1));
    }
}
