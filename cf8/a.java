package cf8.a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import zi8.o;
import java.lang.Number;
import java.lang.StringBuilder;

public class a	// class@000400
{

    public void a(){
       super();
    }
    public static boolean a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (a.b(p0)) {
          return false;
       }
       if (!TextUtils.equals("#ffffff", p0) && (TextUtils.equals("#fff", p0) || TextUtils.equals("#ffffffff", p0))) {
          return false;
       }
       if (o.b(p0, -1) != -1) {
          b = false;
       }
       return b;
    }
    public static boolean b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (TextUtils.isEmpty(p0)) {
          return b;
       }
       if (p0.length() == 5 && p0.startsWith("#")) {
          b = true;
       }
       return b;
    }
    public static int c(String p0){
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (!a.b(p0)) {
          return o.a(p0);
       }
       obj = p0.substring(1, 2);
       String str = p0.substring(2, 3);
       String str1 = p0.substring(3, 4);
       p0 = p0.substring(4, 5);
       return o.a("#"+obj+obj+str+str+str1+str1+p0+p0);
    }
}
