package j99.r$a;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import j99.g;
import java.util.Map;
import java.util.HashMap;

public class r$a implements g	// class@0027d0
{
    public int b;
    public List c;
    public View d;
    public boolean e;
    public v1 f;

    public void r$a(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, r$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, r$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(r$a.class, new g());
       }else {
          obj.put(r$a.class, null);
       }
       return obj;
    }
}
