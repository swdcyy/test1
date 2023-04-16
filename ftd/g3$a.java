package ftd.g3$a;
import java.util.concurrent.ThreadFactory;
import ftd.g3;
import java.lang.Object;
import java.lang.Runnable;
import ftd.q2;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Thread;

public final class g3$a implements ThreadFactory	// class@000e89
{
    public final g3 b;

    public void g3$a(g3 p0){
       this.b = p0;
       super();
    }
    public final q2 a(Runnable p0){
       g3$a tb = this.b;
       g3 h = (tb.g == 1)? tb.h: this.b.h+"-"+this.b.e.incrementAndGet();
       return new q2(tb, p0, h);
    }
    public Thread newThread(Runnable p0){
       return this.a(p0);
    }
}
