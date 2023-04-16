package f3b.s;
import java.util.Random;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import com.yxcorp.gifshow.log.utils.DeviceSampleEnum;
import f3b.s$a;
import java.lang.Enum;
import k2b.x1;
import com.yxcorp.gifshow.log.n;
import java.lang.Float;

public class s	// class@0015ce
{
    public static final Random a;

    static {
       s.a = new Random();
    }
    public void s(){
       super();
    }
    public static boolean a(long p0){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, os, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = true;
       if ((int)(Math.random() * (double)p0) != b) {
          b = false;
       }
       return b;
    }
    public static boolean b(DeviceSampleEnum p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, s.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = s$a.a[p0.ordinal()];
       boolean b = true;
       if (i != b) {
          if (i != 2) {
             if (i != 3) {
                if (i != 4) {
                   if (i == 5) {
                      b = n.A1().o();
                   }
                }else {
                   b = n.A1().F();
                }
             }else {
                b = n.A1().e();
             }
          }else {
             b = n.A1().c();
          }
       }else {
          b = n.A1().z();
       }
       return b;
    }
    public static boolean c(float p0){
       s os = s.class;
       if (PatchProxy.isSupport(os)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), null, os, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = (s.a.nextFloat() - p0 <= 0)? true: false;
       return b;
    }
}
