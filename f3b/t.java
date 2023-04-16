package f3b.t;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import f3b.d;
import java.io.File;
import android.content.pm.ApplicationInfo;
import com.yxcorp.utility.l;

public final class t	// class@0015cf
{
    public static String a = "UNKNOWN";
    public static String b = "soc_name";
    public static int c;

    public void t(){
       super();
    }
    public static String a(Context p0){
       String obj = PatchProxy.applyOneRefs(p0, null, t.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "UNKNOWN";
       if (p0 == null) {
          return obj;
       }
       if (!TextUtils.x(t.a) && !obj.equals(t.a)) {
          return t.a;
       }
       t.a = d.b(p0, t.b, obj);
       if (!TextUtils.x(t.a) && !obj.equals(t.a)) {
          return t.a;
       }
       if (t.c > 5) {
          return t.a;
       }
       String str = l.b(new File(new File(p0.getApplicationInfo().nativeLibraryDir), "libcpu-info.so").getAbsolutePath());
       if (str == null) {
          t.c = t.c + 1;
          t.a = obj;
          return obj;
       }else {
          int i = str.indexOf(":");
          if (i < 0 || i >= str.length()) {
             t.c = t.c + 1;
             t.a = obj;
             return obj;
          }else {
             t.a = (str.substring((i + 1))).trim();
             d.d(p0, t.b, t.a);
             return t.a;
          }
       }
    }
}
