package jz8.b;
import im8.g;
import java.lang.Object;
import ek9.t0;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import jz8.i;
import java.util.Map;
import java.util.HashMap;

public class b implements g	// class@0029e7
{
    public a b;
    public t0 c;
    public Object d;
    public List e;
    public k f;

    public void b(){
       super();
       this.c = new t0();
       this.e = new ArrayList();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new i();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new i());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
