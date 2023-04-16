package jb6.b;
import java.lang.Object;
import com.kwai.framework.model.router.RouteType;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;

public class b	// class@001b40
{

    public void b(){
       super();
    }
    public static String a(RouteType p0){
       String str = p0.mName+".mock-host.com";
       StringBuilder str1 = "";
       String str2 = (p0.mIsHttps != null)? "https://": "http://";
       return str1+str2+str;
    }
    public static String b(RouteType p0){
       String obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = p0.mName+".mock-host.com";
       StringBuilder str = "";
       String str1 = (p0.mIsHttps != null)? "https://": "http://";
       str = str+str1+obj;
       String str2 = (p0.mNeedRest != null)? "/rest/": "/";
       return str+str2;
    }
    public static RouteType c(String p0){
       Object obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "4");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       if (p0 == null || !p0.contains(".mock-host.com")) {
          return obj;
       }
       return RouteType.nameOf(p0.substring(0, p0.indexOf(46)));
    }
    public static String d(String p0,RouteType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p1)+"/rest/"+p0;
    }
    public static String e(String p0,RouteType p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(p1)+p0;
    }
}
