package h2a.m$a$a;
import y8c.f$b;
import h2a.m$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import h2a.c;
import java.util.Map;

public class m$a$a extends f$b	// class@00254d
{
    public y h;
    public final m$a i;

    public void m$a$a(m$a p0,f$b p1){
       this.i = p0;
       super(p1);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, m$a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(m$a$a.class, new c());
       }else {
          obj.put(m$a$a.class, null);
       }
       return obj;
    }
}
