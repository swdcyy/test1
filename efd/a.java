package efd.a;
import scd.c0;
import y8c.f$b;
import com.yxcorp.plugin.search.entity.template.aggregate.BigCardExternalFeed;
import com.yxcorp.plugin.search.entity.template.aggregate.TemplateBaseFeed;
import jfd.a;
import ffd.a;
import scd.b;
import jfd.d;
import u99.f;
import jkd.d;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import efd.f;
import java.util.Map;

public class a extends c0	// class@000d0a
{
    public final a G;
    public final d H;
    public final d I;

    public void a(f$b p0,BigCardExternalFeed p1){
       super(p0, p1);
       a uoa = new a(p1);
       this.I = uoa;
       this.G = new a(uoa, this.p);
       this.H = new d();
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(a.class, new f());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
}
