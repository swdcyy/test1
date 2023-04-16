package a0d.c;
import za6.b;
import java.util.Set;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.activitycontext.ActivityContext;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import ua6.b;
import ua6.b$a;
import ia0.c;
import ekd.p0;
import wkd.b;
import kka.h;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;

public class c extends b	// class@000008
{

    public void c(){
       super();
    }
    public Set f(){
       HashSet obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashSet();
       obj.add("kuaishou.api_st");
       return obj;
    }
    public Map j(){
       HashMap obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       boolean b = false;
       if (a.t().d("isForceUploadLocationInfo", b) || (ActivityContext.g().h() && PermissionUtils.a(a.B, "android.permission.ACCESS_FINE_LOCATION"))) {
          b = true;
       }
       b uob = b.c.a();
       obj.put("ud", uob.e().getUserId());
       obj.put("ver", uob.e().getVersion());
       obj.put("sys", uob.e().p());
       obj.put("c", uob.e().getChannel());
       obj.put("oc", uob.e().j());
       obj.put("did", uob.e().getDeviceId());
       obj.put("rdid", uob.e().w());
       obj.put("did_tag", uob.e().i0());
       obj.put("mod", uob.e().g());
       obj.put("app", uob.e().D());
       obj.put("country_code", uob.e().i());
       obj.put("appver", uob.e().getAppVersion());
       if (b) {
          obj.put("lat", uob.e().getLatitude());
          obj.put("lon", uob.e().getLongitude());
       }
       obj.put("hotfix_ver", uob.e().h());
       obj.put("language", uob.e().o());
       obj.put("kpn", a.x);
       obj.put("kpf", a.A);
       obj.put("client_key", uob.e().n());
       obj.put("clientid", String.valueOf(2));
       obj.put("net", p0.g(uob.e().getContext()));
       obj.put("ftt", TextUtils.k(b.a(-1592356291).b()));
       obj.put("kuaishou.api_st", TextUtils.k(QCurrentUser.me().getApiServiceToken()));
       return obj;
    }
    public boolean t(){
       return true;
    }
}
