package ftd.t$a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.StringBuilder;
import java.lang.String;

public final class t$a implements ThreadFactory	// class@000ec8
{
    public final AtomicInteger b;

    public void t$a(AtomicInteger p0){
       this.b = p0;
       super();
    }
    public final Thread newThread(Runnable p0){
       Thread thread = new Thread(p0, "CommonPool-worker-"+this.b.incrementAndGet());
       thread.setDaemon(true);
       return thread;
    }
}
