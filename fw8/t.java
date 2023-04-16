package fw8.t;
import java.lang.Object;
import xh7.b;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.net.Uri;
import xh7.a;
import zh7.b;
import wh7.b;
import wh7.c;
import wh7.a;
import wh7.d;
import java.lang.Boolean;
import jd6.g;
import com.kwai.plugin.dva.Dva;

public class t	// class@00236b
{

    public void t(){
       super();
    }
    public static String a(b p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       String str = null;
       Object obj = PatchProxy.applyOneRefs(p0, str, ot, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       String str1 = PatchProxy.applyOneRefs(p0, str, ot, "4");
       if (str1 != patchProxyRe) {
       }else {
          Uri uri = p0.g();
          uri.getQuery();
          str1 = (("kwai").equals(uri.getScheme()))? b.a(uri): b.b(uri);
       }
       p0 = c.a(str1);
       if (p0 != null) {
          str = p0.a();
       }else {
          d uod = c.b(str1);
          if (uod != null) {
             str = uod.a();
          }
       }
       return str;
    }
    public static boolean b(b p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = t.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, ot, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       String str = t.a(p0);
       boolean b = true;
       if (str != null) {
          Object obj1 = PatchProxy.applyOneRefs(str, null, ot, "3");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(!str.isEmpty() && (g.d(str) && !Dva.instance().isLoaded(str))){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1) {
          label_0048 :
             return b;
          }
       }
       b = false;
       goto label_0048 ;
    }
}
