package io.reactivex.internal.operators.single.o$a;
import erd.o;
import io.reactivex.internal.operators.single.o;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;

public final class o$a implements o	// class@00149b
{
    public final o b;

    public void o$a(o p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       Object[] objArray = new Object[]{p0};
       p0 = this.b.c.apply(objArray);
       a.c(p0, "The zipper returned a null value");
       return p0;
    }
}
