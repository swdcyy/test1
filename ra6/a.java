package ra6.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Locale;
import lnc.f4;
import qe6.d;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.utility.TextUtils;

public class a	// class@002359
{

    public void a(){
       super();
    }
    public static String a(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.b(f4.a());
    }
    public static String b(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.c(f4.a());
    }
    public static Locale c(){
       Object obj = PatchProxy.apply(null, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return d.d(f4.a());
    }
    public static int d(){
       Object obj = PatchProxy.apply(null, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return d.e(f4.a());
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (a.d() == 3)? true: false;
       return b;
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (a.d() != b) {
          b = false;
       }
       return b;
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.L(a.c().getLanguage())).equals("zh");
    }
}
