package io.reactivex.internal.functions.Functions$f0;
import erd.o;
import java.util.concurrent.TimeUnit;
import brd.z;
import java.lang.Object;
import lrd.c;

public final class Functions$f0 implements o	// class@0011b8
{
    public final TimeUnit b;
    public final z c;

    public void Functions$f0(TimeUnit p0,z p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public Object apply(Object p0){
       return new c(p0, this.c.c(this.b), this.b);
    }
}
