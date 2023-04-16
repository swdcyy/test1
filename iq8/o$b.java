package iq8.o$b;
import java.util.concurrent.RejectedExecutionHandler;
import java.lang.Object;
import iq8.o$a;
import java.lang.Runnable;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iq8.o;
import java.lang.StringBuilder;
import java.util.concurrent.BlockingQueue;
import zp8.a;

public class o$b implements RejectedExecutionHandler	// class@002719
{

    public void o$b(){
       super();
    }
    public void o$b(o$a p0){
       super();
    }
    public void rejectedExecution(Runnable p0,ThreadPoolExecutor p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, o$b.class, "1")) {
          return;
       }
       p1 = o.d;
       p1.execute(p0);
       a.j("TKAsync", "reject work, put into tk-backup-pool, queueSize="+p1.getQueue().size());
       return;
    }
}
