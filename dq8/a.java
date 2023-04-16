package dq8.a;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.module.TKBaseBridge;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import iq8.a;
import com.tkruntime.v8.V8Function;
import java.lang.Number;

public class a implements b	// class@0020df
{

    public void a(){
       super();
    }
    public Object a(f p0){
       TKBaseBridge tKBaseBridge = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (tKBaseBridge != PatchProxyResult.class) {
       }else {
          tKBaseBridge = new TKBaseBridge(p0);
       }
       return tKBaseBridge;
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
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p1);
       int i = 2;
       int i1 = 1;
       if (p1.equals("invoke")) {
          return p0.invoke(a.a(p2, 0), a.a(p2, i1), a.a(p2, i));
       }
       if (p1.equals("invokeM")) {
          return p0.invokeM(a.a(p2, 0), a.a(p2, i1), a.a(p2, i), a.a(p2, 3));
       }
       r.a();
       return null;
    }
    public void g(Object p0,String p1,Object p2){
       a.a(this, p0, p1, p2);
    }
    public int h(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Objects.requireNonNull(p0);
       if (!p0.equals("invoke") && !p0.equals("invokeM")) {
          return 0;
       }
       return 2;
    }
    public String i(){
       return "0";
    }
    public boolean k(Object p0,String p1,Object p2){
       return a.c(this, p0, p1, p2);
    }
    public String l(){
       return "invokeM,invoke";
    }
}
