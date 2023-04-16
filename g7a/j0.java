package g7a.j0;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g7a.s0;
import java.util.Map;
import java.util.HashMap;

public class j0 implements g	// class@0023de
{
    public a b;
    public PhotoDetailParam c;
    public c d;
    public PhotoDetailLogger e;
    public NasaBizParam f;
    public y g;
    public TagPackageListHelper h;

    public void j0(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, j0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(j0.class, new s0());
       }else {
          obj.put(j0.class, null);
       }
       return obj;
    }
}
