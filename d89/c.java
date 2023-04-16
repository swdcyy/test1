package d89.c;
import ljd.b;
import java.lang.Object;
import brd.t;
import retrofit2.a;
import d89.k;
import erd.o;

public final class c implements b	// class@002086
{
    public static final c a;

    static {
       c.a = new c();
    }
    public void c(){
       super();
    }
    public final t a(t p0,a p1){
       return p0.retryWhen(new k(p1));
    }
}
