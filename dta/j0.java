package dta.j0;
import java.lang.Object;
import wq6.f;
import wq6.h;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import lnc.i3;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import wq6.g;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.DefaultHelper;
import java.lang.Boolean;
import android.content.SharedPreferences;
import zr6.f;
import wn5.b;
import zq6.b;
import bo5.a;
import zq6.p;

public class j0	// class@002537
{

    public void j0(){
       super();
    }
    public static ClientContent$TagPackage a(f p0,h p1,int p2){
       ClientContent$TagPackage obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(j0.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, j0.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new ClientContent$TagPackage();
       i3 oi3 = i3.f();
       if (p1 != null) {
          if (b.G.equals(p1.M2())) {
             obj.identity = TextUtils.I(p1.a().j().M2().getId());
             Boolean uBoolean = PatchProxy.apply(null, null, DefaultHelper.class, "15");
             if (uBoolean != patchProxyRe) {
             }else {
                uBoolean = Boolean.valueOf(DefaultHelper.a.getBoolean("isPredictorTab", false));
             }
             oi3.a("isEveRecommendXTab", uBoolean);
          }else {
             obj.identity = TextUtils.I(p1.E().d());
          }
          b uob = p1.q("KEY_TAB_NAME_DEST");
          if (p1.l()) {
             b uob1 = p0.y().e(p1, a.s);
             if (uob1 != null) {
                uob = uob1;
             }
          }
          obj.name = TextUtils.I(uob.c());
          p2++;
          obj.index = (long)p2;
          oi3.d("level", "ONE");
          obj.params = oi3.e();
       }
       return obj;
    }
}
