package nfd.k3;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.util.Date;

public class k3	// class@001dc6
{
    public static final SimpleDateFormat a;
    public static final SimpleDateFormat b;

    static {
       Locale uS = Locale.US;
       k3.a = new SimpleDateFormat("MM.dd HH:mm", uS);
       k3.b = new SimpleDateFormat("MM.dd", uS);
    }
    public void k3(){
       super();
    }
    public static String a(long p0){
       k3 ok3 = k3.class;
       if (PatchProxy.isSupport(ok3)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, ok3, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return k3.b.format(new Date(p0));
    }
    public static String b(long p0){
       k3 ok3 = k3.class;
       if (PatchProxy.isSupport(ok3)) {
          Object obj = PatchProxy.applyOneRefs(Long.valueOf(p0), null, ok3, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return k3.a.format(new Date(p0));
    }
}
