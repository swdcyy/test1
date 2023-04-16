package ol1.b;
import im8.g;
import vl8.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ol1.m;
import java.util.Map;
import java.util.HashMap;

public class b extends c implements g	// class@00352b
{
    public boolean c;
    public Activity d;
    public m e;
    public e f;
    public h g;
    public p h;
    public ViewGroup i;
    public a j;
    public u k;

    public void b(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new m();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new m());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
