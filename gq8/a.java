package gq8.a;
import cq8.b;
import java.lang.Object;
import gx4.f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.tachikoma.core.system.TKClock;
import java.util.Map;
import cq8.a;
import java.util.Objects;
import iq8.r;
import java.lang.Number;

public class a implements b	// class@0024b4
{

    public void a(){
       super();
    }
    public Object a(f p0){
       TKClock tKClock = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (tKClock != PatchProxyResult.class) {
       }else {
          tKClock = new TKClock(p0);
       }
       return tKClock;
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
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       Objects.requireNonNull(p1);
       if (p1.equals("currentTimeMillis")) {
          return p0.currentTimeMillis();
       }
       if (p1.equals("elapsedRealtime")) {
          return p0.elapsedRealtime();
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
       if (!p0.equals("currentTimeMillis") && !p0.equals("elapsedRealtime")) {
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
       return "currentTimeMillis,elapsedRealtime";
    }
}
