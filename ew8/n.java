package ew8.n;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import ew8.o;
import ekd.e0;
import java.lang.String;
import yv8.b;
import io.reactivex.exceptions.CompositeException;

public final class n implements g	// class@002248
{
    public static final n b;

    static {
       n.b = new n();
    }
    public void n(){
       super();
    }
    public final void accept(Object p0){
       if (!e0.a) {
          b.a("RealActionUtil", "errorConsumer", p0);
          return;
       }else {
          Throwable[] throwableArr = new Throwable[]{p0};
          throw new CompositeException(throwableArr);
       }
    }
}
