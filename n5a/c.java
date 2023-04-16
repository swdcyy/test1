package n5a.c;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import n5a.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import n5a.f;
import java.util.Map;
import java.util.HashMap;

public class c extends PresenterV2 implements g	// class@0030e5
{
    public b p;

    public void c(b p0){
       super();
       this.p = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new f());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
}
