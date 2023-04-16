package elb.c0;
import ta6.g;
import com.kwai.framework.model.router.RouteType;
import brd.z;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class c0 extends g	// class@00273f
{

    public void c0(RouteType p0,z p1){
       super(p0, p1);
    }
    public String buildBaseUrl(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c0 uoc0 = c0.class;
       g obj = PatchProxy.apply(null, this, uoc0, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.mRouteType;
       a.o(obj, "mRouteType");
       StringBuilder str = PatchProxy.applyOneRefs(obj, this, uoc0, "2");
       if (str != patchProxyRe) {
       }else {
          String str1 = obj.mName+".com";
          str = "";
          String str2 = (obj.mIsHttps != null)? "https://": "http://";
          str = str+str2+str1;
          str1 = (obj.mNeedRest != null)? "/rest/": "/";
          str = str+str1;
       }
       return str;
    }
}
