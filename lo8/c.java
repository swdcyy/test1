package lo8.c;
import java.lang.Object;
import java.lang.Float;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public final class c	// class@002d82
{

    public void c(){
       super();
    }
    public static Float a(Float p0,Float p1,float p2){
       if (PatchProxy.isSupport(c.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Float.valueOf(p2), null, c.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (p0 == null) {
          if (p1 == null) {
             return null;
          }else {
             return Float.valueOf((p2 - p1.floatValue()));
          }
       }else if(p1 == null){
          return Float.valueOf((p0.floatValue() - p2));
       }else {
          return Float.valueOf((p0.floatValue() - p1.floatValue()));
       }
    }
    public static float b(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       if (p0 instanceof Number) {
          return p0.floatValue();
       }
       return 0;
    }
}
