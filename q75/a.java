package q75.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import wu8.p;
import java.lang.Double;
import java.lang.Number;
import java.lang.reflect.Type;
import java.lang.Integer;
import java.lang.Long;

public class a	// class@002241
{

    public void a(){
       super();
    }
    public static boolean a(String p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return p.d().c(p0, p1);
    }
    public static double b(String p0,double p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Double.valueOf(p1), null, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj.doubleValue();
          }
       }
       return p.d().h(p0, Double.TYPE, Double.valueOf(p1)).doubleValue();
    }
    public static int c(String p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uoa, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return p.d().e(p0, p1);
    }
    public static long d(String p0,long p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Long.valueOf(p1), null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       return p.d().f(p0, p1);
    }
    public static String e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p.d().g(p0, p1);
    }
}
