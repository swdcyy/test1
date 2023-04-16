package na8.b;
import na8.a;
import ma8.i;
import fc8.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ga8.g;
import com.mini.js.commonapitracer.c$b;
import com.mini.js.commonapitracer.b;
import ga8.h;
import com.kwai.robust.PatchProxyResult;
import ga8.j;

public class b extends a	// class@0026fe
{

    public void b(i p0){
       super(p0);
    }
    public void B(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       a tc = this.c;
       tc.b(tc.j(p0), p0);
       return;
    }
    public void C(h p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.c.h(this.c.e(p0, 0, 0, "", true), p0);
       return;
    }
    public h D(String p0){
       j obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new j(p0);
       this.c.b(this.c.j(obj), obj);
       return obj;
    }
}
