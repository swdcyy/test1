package sjc.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Runnable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sjc.a;
import java.io.File;
import qkd.b;
import sjc.d;
import java.lang.Throwable;
import android.util.Log;

public class c	// class@002436
{
    public static final String[] a;
    public static String b;

    static {
       String[] stringArray = new String[]{"com.smile.gifmaker","com.smile.gifmaker.perf","com.kuaishou.nebula","com.kuaishou.nebula.perf"};
       c.a = stringArray;
       c.b = null;
    }
    public void c(){
       super();
    }
    public static Runnable a(){
       Object obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.b;
    }
    public static String b(){
       String obj = PatchProxy.apply(null, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.b;
       if (obj != null) {
          return obj;
       }
       c.b = (b.f0(new File("/proc/self/cmdline"))).trim();
       return c.b;
    }
}
