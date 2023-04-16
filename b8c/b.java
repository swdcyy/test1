package b8c.b;
import u1b.a;
import im8.g;
import java.lang.Object;
import xl8.b;
import d8c.a;
import qvb.i;
import c8c.c;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b8c.h;
import java.util.Map;
import java.util.HashMap;

public class b implements a, g	// class@0003d1
{
    public String b;
    public c c;
    public boolean d;
    public b e;

    public void b(){
       super();
       this.e = new b(new a(0));
    }
    public i a(){
       return this.c;
    }
    public void b(i p0){
       this.c = p0;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
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
          obj.put(b.class, new h());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
