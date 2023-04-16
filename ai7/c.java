package ai7.c;
import ai7.c$a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c	// class@0000d2
{
    public static final ExecutorService a;

    static {
       c.a = Executors.newCachedThreadPool(new c$a());
    }
    public void c(){
       super();
    }
    public static void a(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, c.class, "1")) {
          return;
       }
       c.a.execute(p0);
       return;
    }
}
