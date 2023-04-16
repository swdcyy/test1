package ie0.b;
import java.text.SimpleDateFormat;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import wkd.b;
import ee0.g;

public class b	// class@0028a0
{
    public static final SimpleDateFormat a;

    static {
       b.a = new SimpleDateFormat("mm:ss");
    }
    public void b(){
       super();
    }
    public static int a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uob, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return b.a(0x7c7b96ca).b(p0, 0x2710, "olympicPendantSample");
    }
    public static boolean b(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), null, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return b.a(0x7c7b96ca).a(p0, true, "olympicPendantSample");
    }
}
