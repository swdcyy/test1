package g99.p;
import n5a.b;
import im8.g;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n5a.a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g99.s;
import java.util.Map;
import java.util.HashMap;

public class p implements b, g	// class@00244d
{
    public a0 b;

    public void p(){
       super();
    }
    public PresenterV2 a(PresenterV2 p0){
       return a.a(this, p0);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, p.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new s();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(p.class, new s());
       }else {
          obj.put(p.class, null);
       }
       return obj;
    }
}
