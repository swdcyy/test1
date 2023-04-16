package iq8.o$c;
import java.util.concurrent.ThreadFactory;
import java.lang.String;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.Runnable;
import java.lang.Thread;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import zp8.a;

public class o$c implements ThreadFactory	// class@00271a
{
    public final AtomicInteger b;
    public final String c;

    public void o$c(String p0){
       super();
       this.b = new AtomicInteger(1);
       this.c = p0;
    }
    public Thread newThread(Runnable p0){
       String obj = PatchProxy.applyOneRefs(p0, this, o$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "TKExecutor-->"+this.c+"#"+this.b.getAndIncrement();
       a.a("TKExecutor", "threadName="+obj);
       return new Thread(p0, obj);
    }
}
