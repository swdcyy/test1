package bx9.i$c;
import im8.g;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bx9.g;
import java.util.Map;
import java.util.HashMap;

public class i$c implements g	// class@000505
{
    public Object b;
    public PhotoDetailParam c;
    public Activity d;
    public NormalDetailBizParam e;

    public void i$c(){
       super();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, i$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, i$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(i$c.class, new g());
       }else {
          obj.put(i$c.class, null);
       }
       return obj;
    }
}
