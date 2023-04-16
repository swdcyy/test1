package c76.b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import km8.b;
import android.content.SharedPreferences;
import kotlin.jvm.internal.a;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class b	// class@00038f
{
    public static final boolean a;
    public static Boolean b;
    public static final b c;

    static {
       b.c = new b();
    }
    public void b(){
       super();
    }
    public static final boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       b obj = PatchProxy.apply(null, null, uob, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (b.b == null) {
          obj = b.c;
          Objects.requireNonNull(obj);
          if (PatchProxy.isSupport(uob)) {
             Object obj1 = PatchProxy.applyTwoRefs("dynamicPreInit", Boolean.FALSE, obj, uob, "5");
             if (obj1 != patchProxyRe) {
                b = obj1.booleanValue();
             label_0043 :
                b.b = Boolean.valueOf(b);
             }
          }
          b = b.b("MiniSet").getBoolean("dynamicPreInit", false);
          goto label_0043 ;
       }
       Boolean b1 = b.b;
       a.m(b1);
       return b1.booleanValue();
    }
    public static final boolean b(){
       return b.a;
    }
    public final void c(String p0,boolean p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uob, "4")) {
          return;
       }
       g.a(b.b("MiniSet").edit().putBoolean(p0, p1));
       return;
    }
}
