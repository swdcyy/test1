package hp8.l;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.component.text.TKSpan;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import com.tkruntime.v8.V8Object;
import java.lang.Number;

public class l implements b	// class@0025d3
{

    public void l(){
       super();
    }
    public Object a(f p0){
       TKSpan tKSpan = PatchProxy.applyOneRefs(p0, this, l.class, "1");
       if (tKSpan != PatchProxyResult.class) {
       }else {
          tKSpan = new TKSpan(p0);
       }
       return tKSpan;
    }
    public void b(Object p0,Map p1){
       a.b(this, p0, p1);
    }
    public boolean c(String p0){
       return a.i(this, p0);
    }
    public boolean d(String p0){
       return a.h(this, p0);
    }
    public Object e(Object p0,String p1){
       return a.f(this, p0, p1);
    }
    public Object f(Object p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       if (!p1.equals("addSpan")) {
          r.a();
          return null;
       }else {
          p0.addSpan(a.a(p2, 0));
          return null;
       }
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("addSpan")) {
          return 0;
       }
       return 1;
    }
    public String i(){
       return "1";
    }
    public boolean k(Object p0,String p1,Object p2){
       return a.c(this, p0, p1, p2);
    }
    public String l(){
       return "addSpan";
    }
}
