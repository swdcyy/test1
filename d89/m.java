package d89.m;
import ljd.b;
import java.lang.Object;
import brd.t;
import retrofit2.a;
import d89.q;
import erd.o;

public final class m implements b	// class@002091
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final t a(t p0,a p1){
       return p0.retryWhen(new q(p1));
    }
}
