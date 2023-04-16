package xq.c;
import java.lang.Object;
import java.lang.String;
import java.util.concurrent.ExecutorService;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xq.d;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class c	// class@002819
{

    public void c(){
       super();
    }
    public static ExecutorService a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Executors.newSingleThreadExecutor(new d(p0));
    }
    public static ScheduledExecutorService b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Executors.newSingleThreadScheduledExecutor(new d(p0));
    }
}
