package e1a.u;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kp.r1;
import java.util.Map;
import java.lang.ref.SoftReference;
import q3a.i;

public class u	// class@002058
{
    public static Map a;

    static {
       u.a = new ConcurrentHashMap();
    }
    public void u(){
       super();
    }
    public static boolean a(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, u.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       SoftReference softReferenc = u.a.remove(r1.t1(p0));
       if (softReferenc != null) {
          i oi = softReferenc.get();
          if (oi != null) {
             oi.g();
             return true;
          }
       }
       return false;
    }
    public static boolean b(BaseFeed p0,i p1){
       SoftReference obj = PatchProxy.applyTwoRefs(p0, p1, null, u.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = r1.t1(p0);
       obj = u.a.get(str);
       if (obj != null && obj.get() != null) {
          return false;
       }
       u.a.put(str, new SoftReference(p1));
       return true;
    }
    public static boolean c(BaseFeed p0,i p1){
       SoftReference obj = PatchProxy.applyTwoRefs(p0, p1, null, u.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       String str = r1.t1(p0);
       obj = u.a.get(str);
       if (obj == null || !p1.equals(obj.get())) {
          return false;
       }
       u.a.remove(str);
       return true;
    }
}
