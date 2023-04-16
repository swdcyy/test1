package d89.n;
import ljd.b;
import java.lang.Object;
import brd.t;
import retrofit2.a;
import d89.q;
import erd.o;

public final class n implements b	// class@002092
{
    public static final n a;

    static {
       n.a = new n();
    }
    public void n(){
       super();
    }
    public final t a(t p0,a p1){
       return p0.retryWhen(new q(p1));
    }
}
