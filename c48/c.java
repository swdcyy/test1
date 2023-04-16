package c48.c;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import d48.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;

public class c	// class@0003b4
{
    public static final ConcurrentHashMap a;

    static {
       c.a = new ConcurrentHashMap();
    }
    public void c(){
       super();
    }
    public static a a(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoc, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return c.a.get(Integer.valueOf(p0));
    }
}
