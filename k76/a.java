package k76.a;
import q97.e;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import java.lang.String;
import q97.c;
import q97.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import k76.a$b;
import java.util.Map;
import k76.a$a;

public class a implements e	// class@001bd3
{
    public static final Map a;

    static {
       a.a = new ConcurrentHashMap();
    }
    public void a(){
       super();
    }
    public c a(String p0,int p1){
       return d.a(this, p0, p1);
    }
    public c create(){
       Object obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.create("LOG_DEFAULT_SDK_NAME");
    }
    public c create(String p0){
       Map a;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a$b uob = PatchProxy.applyOneRefs(p0, this, uoa, "3");
       if (uob != patchProxyRe) {
       }else {
          a = a.a;
          uob = a.get(p0);
          if (uob == null) {
             _monitor_enter(a);
             uob = a.get(p0);
             if (uob == null) {
                uob = new a$b(p0, false);
                a.put(p0, uob);
             }
             _monitor_exit(a);
          }
       }
       return new a$a(this, uob);
    }
}
