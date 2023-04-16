package ftd.z1;
import kotlin.coroutines.CoroutineContext$a;
import ftd.z1$b;
import msd.l;
import ftd.c1;
import java.util.concurrent.CancellationException;
import ftd.s;
import ftd.q;
import java.lang.Throwable;
import wsd.m;
import otd.c;
import asd.c;
import java.lang.Object;

public interface abstract z1 implements CoroutineContext$a	// class@00168f
{
    public static final z1$b p0;

    static {
       z1.p0 = z1$b.a;
    }
    boolean E();
    c1 L(boolean p0,boolean p1,l p2);
    CancellationException O();
    q Q(s p0);
    c1 S(l p0);
    boolean a(Throwable p0);
    void b(CancellationException p0);
    boolean c();
    void cancel();
    m getChildren();
    boolean isCancelled();
    c o();
    Object p(c p0);
    boolean start();
    z1 z(z1 p0);
}
