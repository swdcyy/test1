package ntd.c;
import ntd.d;
import ltd.g0;
import usd.q;
import java.lang.String;
import java.lang.Object;
import kotlinx.coroutines.CoroutineDispatcher;
import nsd.u;
import java.lang.UnsupportedOperationException;

public final class c extends d	// class@001f7d
{
    public static final CoroutineDispatcher i;
    public static final c j;

    static {
       c uoc = new c();
       c.j = uoc;
       c.i = uoc.T(g0.f("kotlinx.coroutines.io.parallelism", q.n(64, g0.a()), 0, 0, 12, null));
    }
    public void c(){
       super(0, 0, null, 7, null);
    }
    public void close(){
       throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }
    public final CoroutineDispatcher k0(){
       return c.i;
    }
    public final String l0(){
       return super.toString();
    }
    public String toString(){
       return "DefaultDispatcher";
    }
}
