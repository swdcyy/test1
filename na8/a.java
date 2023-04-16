package na8.a;
import ma8.i;
import java.lang.Object;
import com.mini.js.commonapitracer.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import zd8.d;
import com.mini.js.commonapitracer.d;

public class a	// class@0026fd
{
    public i b;
    public b c;

    public void a(i p0){
       super();
       this.b = p0;
       this.c = this.z(p0);
    }
    public String A(){
       return "KS";
    }
    public int y(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.h.b(p0);
    }
    public b z(i p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, this.A(), "bind");
    }
}
