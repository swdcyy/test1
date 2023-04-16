package d5a.s;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;
import java.util.Map;

public class s	// class@001e8e
{
    public static final Map a;

    static {
       s.a = new HashMap();
    }
    public void s(){
       super();
    }
    public static boolean a(){
       String obj = PatchProxy.apply(null, null, s.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = "landscape";
       boolean b = (g.e(obj) || Dva.instance().isLoaded(obj))? true: false;
       return b;
    }
    public static void b(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, s.class, "1")) {
          return;
       }
       s.a.put(p0, p1);
       return;
    }
}
