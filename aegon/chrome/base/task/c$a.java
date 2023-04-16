package aegon.chrome.base.task.c$a;
import java.util.concurrent.ThreadFactory;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import g0.d;
import java.lang.StringBuilder;
import java.lang.String;

public class c$a implements ThreadFactory	// class@000178
{
    public final AtomicInteger b;

    public void c$a(){
       super();
       this.b = new AtomicInteger(1);
    }
    public Thread newThread(Runnable p0){
       return new Thread(new d(p0), "CrAsyncTask #"+this.b.getAndIncrement());
    }
}
