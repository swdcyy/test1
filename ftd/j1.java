package ftd.j1;
import ftd.g1;
import ftd.e;
import java.lang.Thread;
import ftd.f3;

public final class j1	// class@00164e
{

    public static final g1 a(){
       return new e(Thread.currentThread());
    }
    public static final long b(){
       g1 og1 = f3.b.a();
       long l = (og1 != null)? og1.l0(): Long.MAX_VALUE;
       return l;
    }
}
