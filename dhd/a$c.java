package dhd.a$c;
import erd.o;
import java.lang.Object;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;
import kotlin.jvm.internal.a;

public final class a$c implements o	// class@000cc6
{
    public static final a$c b;

    static {
       a$c.b = new a$c();
    }
    public void a$c(){
       super();
    }
    public Object apply(Object p0){
       long l = p0.longValue();
       p0 = a$c.class;
       if (PatchProxy.isSupport(p0)) {
          p0 = PatchProxy.applyOneRefs(Long.valueOf(l), this, p0, "1");
          if (p0 != PatchProxyResult.class) {
          }else {
          label_001f :
             float f = (float)1024;
             float f1 = (((float)l * 0x3f800000) / f) / f;
             if (f1 - f > 0) {
                Object[] objArray = new Object[]{Float.valueOf((f1 / f))};
                f1 = String.format("%.2f GB", Arrays.copyOf(objArray, 1));
                a.o(f1, "java.lang.String.format\(format, *args\)");
             }else {
                Object[] objArray1 = new Object[]{Float.valueOf(f1)};
                f1 = String.format("%.2f MB", Arrays.copyOf(objArray1, 1));
                a.o(f1, "java.lang.String.format\(format, *args\)");
             }
          }
       }else {
          goto label_001f ;
       }
       return p0;
    }
}
