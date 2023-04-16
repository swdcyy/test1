package cm2.b$b;
import y8c.f$b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import cm2.u;
import java.util.Map;

public class b$b extends f$b	// class@000556
{
    public c h;
    public String i;

    public void b$b(f$b p0){
       super(p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new u();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, b$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(b$b.class, new u());
       }else {
          obj.put(b$b.class, null);
       }
       return obj;
    }
}
