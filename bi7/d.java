package bi7.d;
import java.lang.Object;
import java.util.HashMap;
import bi7.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bi7.e;
import java.io.File;
import bi7.a;

public abstract class d	// class@000417
{
    public File a;
    public a b;
    public final Map c;
    public static d d;

    public void d(){
       super();
       HashMap hashMap = new HashMap();
       this.c = hashMap;
       c uoc = new c();
       if (PatchProxy.applyVoidOneRefs(uoc, this, d.class, "1")) {
       }else {
          hashMap.put("lut3d_render", uoc);
       }
       return;
    }
    public static d c(){
       d uod = d.class;
       d obj = PatchProxy.apply(null, null, uod, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = d.d;
       if (obj != null) {
          return obj;
       }
       _monitor_enter(uod);
       if (d.d == null) {
          d.d = new e();
       }
       _monitor_exit(uod);
       return d.d;
    }
    public abstract void a(File p0,String p1,String p2);
    public abstract void b(File p0,String p1,String p2,String p3);
    public abstract String d(File p0,String p1,String p2,String p3);
    public void e(a p0){
       this.b = p0;
    }
}
