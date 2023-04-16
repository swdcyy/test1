package h0d.a;
import h0d.d;
import vc.b;
import java.lang.Runtime;
import java.util.concurrent.Executor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.SynchronousQueue;
import h0d.c;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;

public class a extends b implements d	// class@00171c
{

    public void a(){
       super(Runtime.getRuntime().availableProcessors());
    }
    public Executor f(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), new c("kwai-image-cached-pool"));
       return obj;
    }
}
