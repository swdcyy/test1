package ic9.u;
import erd.o;
import ic9.a;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Float;

public final class u implements o	// class@002683
{
    public final a b;

    public void u(a p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       float i = a.i;
       this.b.f(i);
       return Float.valueOf(i);
    }
}
