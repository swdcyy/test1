package cm0.e;
import java.util.HashMap;
import cm0.d;
import java.lang.String;
import y00.a;
import cm0.b;
import cm0.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.kuaishou.livestream.message.nano.LiveExtraMessages$LiveCommonAbstractSignal;
import com.kwai.robust.PatchProxyResult;
import java.lang.RuntimeException;
import java.lang.Throwable;

public class e	// class@0004e4
{
    public static HashMap a;

    static {
       e.a = new HashMap();
       e.a("COMMERCE_LiveAdSocialConversionState", d.b);
       e.a("COMMERCE_LiveAdSocialConversionFeed", b.b);
       e.a("COMMERCE_LiveAdSocialConversionNotice", c.b);
    }
    public void e(){
       super();
    }
    public static void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e.class, "1")) {
          return;
       }
       if (e.a.put(p0, p1) == null) {
          return;
       }
       throw new IllegalArgumentException("payloadType already registered:"+p0);
    }
    public static Object b(String p0,LiveExtraMessages$LiveCommonAbstractSignal p1){
       a obj = PatchProxy.applyTwoRefs(p0, p1, null, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = e.a.get(p0);
       if (obj != null) {
          return obj.apply(p1.payload);
       }
       throw new IllegalArgumentException("Unknown payload type:"+p0);
    }
}
