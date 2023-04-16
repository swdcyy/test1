package a0d.e;
import com.yxcorp.retrofit.f;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.activitycontext.ActivityContext;
import o56.a;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import com.yxcorp.retrofit.e;
import com.yxcorp.retrofit.d;
import ekd.p0;
import wkd.b;
import kka.h;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.user.QCurrentUser;

public class e extends f	// class@00000a
{

    public void e(){
       super();
    }
    public void d(Map p0){
    }
    public void j(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "1")) {
          return;
       }
       super.j(p0);
       boolean b = false;
       if (a.t().d("isForceUploadLocationInfo", b) || (ActivityContext.g().h() && PermissionUtils.a(a.B, "android.permission.ACCESS_FINE_LOCATION"))) {
          b = true;
       }
       d uod = e.h().g();
       p0.put("ud", uod.R());
       p0.put("ver", uod.getVersion());
       p0.put("sys", uod.p());
       p0.put("c", uod.getChannel());
       p0.put("oc", uod.j());
       p0.put("did", uod.b());
       p0.put("rdid", uod.T());
       p0.put("did_tag", uod.q());
       p0.put("mod", uod.g());
       p0.put("app", uod.D());
       p0.put("country_code", uod.i());
       p0.put("appver", uod.getAppVersion());
       if (b) {
          p0.put("lat", uod.getLatitude());
          p0.put("lon", uod.getLongitude());
       }
       p0.put("hotfix_ver", uod.h());
       p0.put("language", e.h().g().o());
       p0.put("kpn", a.x);
       p0.put("kpf", a.A);
       p0.put("client_key", e.h().g().n());
       p0.put("clientid", String.valueOf(2));
       p0.put("net", p0.g(e.h().f()));
       p0.put("ftt", TextUtils.k(b.a(-1592356291).b()));
       p0.put("kuaishou.api_st", TextUtils.k(QCurrentUser.me().getApiServiceToken()));
       return;
    }
}
