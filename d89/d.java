package d89.d;
import ljd.b;
import java.lang.Object;
import brd.t;
import retrofit2.a;
import d89.k;
import erd.o;

public final class d implements b	// class@002087
{
    public static final d a;

    static {
       d.a = new d();
    }
    public void d(){
       super();
    }
    public final t a(t p0,a p1){
       return p0.retryWhen(new k(p1));
    }
}
