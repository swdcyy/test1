package b6b.a;
import im8.g;
import java.lang.Object;
import g6b.a;
import xl8.b;
import f07.b;
import java.lang.Boolean;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b6b.p;
import java.util.Map;
import java.util.HashMap;

public final class a implements g	// class@000369
{
    public a b;
    public b c;
    public c d;
    public b e;
    public PhotoMapFragment f;
    public e g;
    public a h;
    public a i;
    public a j;
    public d k;
    public b l;
    public b m;
    public b n;

    public void a(){
       super();
       this.h = new a();
       this.l = new b(new b(0, 0));
       this.m = new b(Boolean.FALSE);
       this.n = new b(new ArrayList());
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new p();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new p());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
