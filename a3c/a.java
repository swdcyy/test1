package a3c.a;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Integer;

public final class a	// class@000062
{

    public void a(){
       super();
    }
    public static boolean a(Map p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Boolean uBoolean = a.c(p0, p1);
       if (uBoolean != null) {
          return uBoolean.booleanValue();
       }
       return false;
    }
    public static int b(Map p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Integer integer = a.c(p0, p1);
       if (integer != null) {
          return integer.intValue();
       }
       return 0;
    }
    public static Object c(Map p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       return p0.get(p1);
    }
}
