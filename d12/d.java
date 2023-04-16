package d12.d;
import im8.g;
import vl8.c;
import d12.g;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import d12.e;
import java.util.Map;
import java.util.HashMap;

public class d extends c implements g	// class@002418
{
    public g c;
    public a d;
    public b e;

    public void d(){
       super();
       this.c = new g();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("injector")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("injector")) {
          obj.put(d.class, new e());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
}
