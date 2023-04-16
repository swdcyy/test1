package j21.l;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public class l	// class@002a43
{

    public void l(){
       super();
    }
    public static String a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return "";
       }
       if (TextUtils.n("NULL", p0)) {
          return "";
       }
       return p0;
    }
}
