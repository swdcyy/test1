package ci8.e;
import java.util.HashMap;
import java.lang.Integer;
import java.lang.Object;
import java.util.Map;
import java.lang.Long;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class e	// class@00042d
{
    public static Map a;
    public static Map b;

    static {
       e.a = new HashMap();
       e.b = new HashMap();
       e.a.put("game", Integer.valueOf(1));
       e.a.put("ui", Integer.valueOf(2));
       e.a.put("normal", Integer.valueOf(3));
       e.b.put("game", Long.valueOf(20));
       e.b.put("ui", Long.valueOf(60));
       e.b.put("normal", Long.valueOf(200));
    }
    public void e(){
       super();
    }
    public static long a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       Long longx = e.b.get(p0);
       long l = (longx != null)? longx.longValue(): 200;
       return l;
    }
    public static int b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = e.a.get(p0);
       int i = (integer != null)? integer.intValue(): 3;
       return i;
    }
}
