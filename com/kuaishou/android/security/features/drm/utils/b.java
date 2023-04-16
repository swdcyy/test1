package com.kuaishou.android.security.features.drm.utils.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.security.features.drm.utils.b$c;
import com.kuaishou.android.security.base.util.n;
import java.lang.Integer;
import com.kuaishou.android.security.features.drm.DrmClientSdk;
import com.kuaishou.android.security.features.drm.AppDrmInfoService;
import org.json.JSONObject;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.Throwable;
import com.kuaishou.android.security.features.drm.utils.b$a;
import java.lang.Runnable;
import com.kuaishou.android.security.features.drm.utils.a;

public class b	// class@000f3a
{
    public boolean a;

    public void b(){
       this.a = false;
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b$c.a();
    }
    public static void a(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "1")) {
          return;
       }
       n.a("800100", p0, true, "5.1.1.372.8d68fa37", false);
       return;
    }
    public static void a(String p0,int p1,int p2,String p3){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, null, b.class, "4")) {
          return;
       }
       JSONObject jSONObject = new JSONObject();
       jSONObject.put("-2", p1);
       jSONObject.put("-1", b.i().h().getKgSessionId());
       jSONObject.put("0", "");
       jSONObject.put("1", p0);
       jSONObject.put("2", DrmClientSdk.get().getAppInfoService().getCurrentUserId());
       jSONObject.put("3", DrmClientSdk.get().getAppInfoService().getDeviceId());
       jSONObject.put("4", "ANDROID");
       jSONObject.put("5", "KUAISHOU");
       jSONObject.put("6", "");
       jSONObject.put("7", "");
       jSONObject.put("8", p2);
       jSONObject.put("9", p3);
       b.b(jSONObject.toString());
       return;
    }
    public static void b(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "2")) {
          return;
       }
       n.a("800101", p0, true, "5.1.1.372.8d68fa37", false);
       return;
    }
    public static void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, b.class, "3")) {
          return;
       }
       n.a("800101", p0, true, "5.1.1.372.8d68fa37", false);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       if (this.a == null) {
          this.a = true;
          a.a(new b$a(this), 1000);
       }
       return;
    }
}
