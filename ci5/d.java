package ci5.d;
import v55.b;
import java.lang.Object;
import p55.a;
import java.lang.String;
import v55.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.sdk.switchconfig.a;
import com.kwai.components.bridge.common.model.BridgePreofflineSwitchModel;
import java.lang.reflect.Type;
import java.lang.StringBuilder;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.utility.SystemUtil;
import ci5.c;
import java.lang.Runnable;
import ekd.k1;
import wi0.e;
import com.kuaishou.krn.model.LaunchModel;
import bi5.b;

public class d implements b	// class@0006c5
{

    public void d(){
       super();
    }
    public a a(a p0,String p1,String p2){
       BridgePreofflineSwitchModel obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!TextUtils.n(p1, "social") && !TextUtils.n(p1, "im")) {
          return new a(true, 0, null);
       }
       obj = a.t().getValue("SocialBridgeOfflineWhiteList", BridgePreofflineSwitchModel.class, new BridgePreofflineSwitchModel()).mExpiredBcBridges;
       String str = p1+"."+p2;
       if (q.f(obj) || !obj.contains(str)) {
          return new a(true, 0, null);
       }
       if (SystemUtil.I()) {
          this.b(p0, p1, p2);
          String str1 = str+"预下线中,不建议调用,请联系 houruixiang";
          k1.o(new c(str1));
          return new a(0, 201, str1);
       }else {
          this.b(p0, p1, p2);
          return new a(true, 0, null);
       }
    }
    public final void b(a p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "2")) {
          return;
       }
       if (p0 instanceof e) {
          LaunchModel launchModel = p0.getLaunchModel();
          if (launchModel != null) {
             String str = launchModel.a();
             String str1 = launchModel.b();
             if (!PatchProxy.applyVoidFourRefs(p1, p2, str, str1, null, b.class, "3")) {
                b.a("BRIDGE_CENTER", p1, p2, str, str1, "socialOfflineBridgeReport");
             }
          }
       }
       return;
    }
}
