package g7a.t0$a;
import im8.g;
import java.lang.Object;
import mrd.a;
import brd.t;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g7a.j;
import java.util.Map;
import java.util.HashMap;

public class t0$a implements g	// class@0023fa
{
    public a b;
    public y c;
    public t d;
    public final a e;
    public y f;
    public t g;

    public void t0$a(){
       super();
       a uoa = a.g();
       this.b = uoa;
       this.c = uoa;
       this.d = uoa.hide();
       uoa = a.g();
       this.e = uoa;
       this.f = uoa;
       this.g = uoa.hide();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, t0$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new j();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, t0$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(t0$a.class, new j());
       }else {
          obj.put(t0$a.class, null);
       }
       return obj;
    }
}
