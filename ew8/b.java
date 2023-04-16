package ew8.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import ekd.e0;
import java.lang.String;
import yv8.b;
import io.reactivex.exceptions.CompositeException;

public final class b implements g	// class@00223a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       if (!e0.a) {
          b.a("RealActionSignalHelper", "addRealAction", p0);
          return;
       }else {
          Throwable[] throwableArr = new Throwable[]{p0};
          throw new CompositeException(throwableArr);
       }
    }
}
