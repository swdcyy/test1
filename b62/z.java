package b62.z;
import y8c.f$b;
import u52.t;
import j62.a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import b62.f0;
import java.util.Map;

public class z extends f$b	// class@00035c
{
    public t h;
    public a i;
    public boolean j;
    public String k;

    public void z(f$b p0,t p1,a p2,boolean p3,String p4){
       super(p0);
       this.h = p1;
       this.i = p2;
       this.j = p3;
       this.k = p4;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, z.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, z.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(z.class, new f0());
       }else {
          obj.put(z.class, null);
       }
       return obj;
    }
}
