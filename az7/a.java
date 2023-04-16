package az7.a;
import az7.a$a;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.lang.StringBuilder;
import android.graphics.Color;
import kotlin.jvm.internal.a;

public final class a	// class@0002e6
{
    public static final a$a a;

    static {
       a.a = new a$a(null);
    }
    public void a(){
       super();
    }
    public static final boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.a.a(p0);
    }
    public static final String b(int p0){
       a$a obj;
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String str = "1";
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, uoa, str);
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = a.a;
       Objects.requireNonNull(obj);
       a$a uoa1 = a$a.class;
       if (PatchProxy.isSupport(uoa1)) {
          str1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), obj, uoa1, str);
          if (str1 != patchProxyRe) {
          label_00df :
             return str1;
          }
       }
       StringBuilder str2 = "";
       str1 = Integer.toHexString(Color.alpha(p0));
       a.h(str1, "Integer.toHexString\(Color.alpha\(color\)\)");
       String str3 = Integer.toHexString(Color.red(p0));
       a.h(str3, "Integer.toHexString\(Color.red\(color\)\)");
       str = Integer.toHexString(Color.green(p0));
       a.h(str, "Integer.toHexString\(Color.green\(color\)\)");
       String str4 = Integer.toHexString(Color.blue(p0));
       a.h(str4, "Integer.toHexString\(Color.blue\(color\)\)");
       if (str1.length() == 1) {
          str1 = '0'+str1;
       }
       if (str3.length() == 1) {
          str3 = '0'+str3;
       }
       if (str.length() == 1) {
          str = '0'+str;
       }
       if (str4.length() == 1) {
          str4 = '0'+str4;
       }
       str1 = str2+"#"+str1+str3+str+str4;
       a.h(str1, "sb.toString\(\)");
       goto label_00df ;
    }
}
