package nfd.l0;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.plugin.search.SearchPage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import java.lang.Boolean;

public class l0	// class@001dc8
{

    public void l0(){
       super();
    }
    public static SearchPage a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l0.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (TextUtils.x(p0)) {
          return null;
       }
       p0 = Uri.parse(p0).getQueryParameter("tab");
       if (TextUtils.x(p0)) {
          return null;
       }
       return SearchPage.ofTabType(p0);
    }
    public static boolean b(Uri p0){
       boolean b;
       String str;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       l0 ol0 = l0.class;
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, ol0, "3");
       if (obj1 != patchProxyRe) {
          return obj1.booleanValue();
       }
       Object obj2 = PatchProxy.applyOneRefs(p0, obj, ol0, "1");
       if (obj2 != patchProxyRe) {
          b = obj2.booleanValue();
       }else if(p0 != null && ("search").equals(p0.getScheme())){
          b = true;
       }else {
          b = false;
       }
       if (!b) {
          return false;
       }else if(p0 == null){
          str = "";
       }else {
          str = p0.getHost();
       }
       return ("gotab").equals(str);
    }
    public static boolean c(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, l0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (TextUtils.x(p0)) {
          return false;
       }
       return l0.b(Uri.parse(p0));
    }
}
