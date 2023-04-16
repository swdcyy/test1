package io.reactivex.internal.operators.single.SingleZipArray$a;
import erd.o;
import io.reactivex.internal.operators.single.SingleZipArray;
import java.lang.Object;
import java.lang.String;
import io.reactivex.internal.functions.a;

public final class SingleZipArray$a implements o	// class@001480
{
    public final SingleZipArray b;

    public void SingleZipArray$a(SingleZipArray p0){
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
