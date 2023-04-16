package f3b.l;
import java.lang.Object;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;

public class l	// class@002887
{

    public void l(){
       super();
    }
    public static void a(ClientEvent$UrlPackage p0,ClientEvent$ElementPackage p1,boolean p2){
       if (!p2) {
          return;
       }
       if (p0 != null) {
          p0.params = "";
       }
       if (p1 != null) {
          p1.params = "";
       }
       return;
    }
    public static String b(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return "";
       }
       if (p0.startsWith("_")) {
          return p0;
       }
       return "_"+p0;
    }
}
