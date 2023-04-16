package dhd.a$a;
import erd.o;
import java.lang.Object;
import x56.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import nsd.r0;
import java.lang.Float;
import java.util.Arrays;

public final class a$a implements o	// class@000cc4
{
    public static final a$a b;

    static {
       a$a.b = new a$a();
    }
    public void a$a(){
       super();
    }
    public Object apply(Object p0){
       String str = PatchProxy.applyOneRefs(p0, this, a$a.class, "1");
       if (str != PatchProxyResult.class) {
       }else {
          a.p(p0, "cleanData");
          float f = ((float)p0.a / 1024.00f) / 1024.00f;
          float f1 = (float)1024;
          if (f - f1 > 0) {
             Object[] objArray = new Object[]{Float.valueOf((f / f1))};
             f = String.format("%.2f GB", Arrays.copyOf(objArray, 1));
             a.o(f, "java.lang.String.format\(format, *args\)");
          }else {
             Object[] objArray1 = new Object[]{Float.valueOf(f)};
             f = String.format("%.2f MB", Arrays.copyOf(objArray1, 1));
             a.o(f, "java.lang.String.format\(format, *args\)");
          }
          str = f;
       }
       return str;
    }
}
