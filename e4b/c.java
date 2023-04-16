package e4b.c;
import java.lang.Object;
import e4b.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import psb.p;

public class c	// class@00260f
{
    public static a a;

    public void c(){
       super();
    }
    public static a a(){
       a obj = PatchProxy.apply(null, null, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = c.a;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(c.class);
       obj = c.a;
       if (obj != null) {
          _monitor_exit(c.class);
          return obj;
       }else {
          p op = new p();
          c.a = op;
          _monitor_exit(c.class);
          return op;
       }
    }
}
