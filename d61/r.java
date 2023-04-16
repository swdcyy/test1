package d61.r;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ok.x;

public class r	// class@001f3e
{

    public void r(){
       super();
    }
    public static Object a(Map p0,Object p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, r.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.get(p1);
       if (obj != null || p0.containsKey(p1)) {
          p2 = obj;
       }
       return p2;
    }
    public static Object b(Map p0,Object p1,x p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, r.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.containsKey(p1)) {
          return p0.get(p1);
       }
       p2 = p2.get();
       p0.put(p1, p2);
       return p2;
    }
}
