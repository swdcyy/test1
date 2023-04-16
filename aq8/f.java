package aq8.f;
import java.lang.Object;
import java.util.HashMap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class f	// class@00030a
{
    public HashMap a;
    public static f b;

    public void f(){
       super();
       this.a = new HashMap();
    }
    public static f a(){
       f uof = f.class;
       Object obj = PatchProxy.apply(null, null, uof, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (f.b == null) {
          _monitor_enter(uof);
          if (f.b == null) {
             f.b = new f();
          }
          _monitor_exit(uof);
       }
       return f.b;
    }
}
