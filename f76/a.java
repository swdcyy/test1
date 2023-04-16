package f76.a;
import d97.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wu8.p;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.reflect.Type;

public class a implements a	// class@0015de
{

    public void a(){
       super();
    }
    public int a(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p.d().e(p0, p1);
    }
    public long b(String p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), this, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return p.d().f(p0, p1);
    }
    public String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.d().g(p0, p1);
    }
    public boolean d(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return p.d().c(p0, p1);
    }
    public Object getValue(String p0,Type p1,Object p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.d().h(p0, p1, p2);
    }
}
