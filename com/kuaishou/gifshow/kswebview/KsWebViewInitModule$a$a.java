package com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a$a;
import com.kuaishou.webkit.extension.KsCoreListener;
import java.lang.String;
import org.json.JSONObject;
import p80.v;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.webkit.extension.KwSdk;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import k2b.u1;
import com.yxcorp.utility.Log;
import com.kuaishou.gifshow.kswebview.KsWebViewInitModule$a$a$a;
import java.lang.Runnable;
import com.kwai.framework.init.e;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class KsWebViewInitModule$a$a extends KsCoreListener	// class@0019d3
{
    public final boolean a;

    public void KsWebViewInitModule$a$a(boolean p0){
       this.a = p0;
       super();
    }
    public void onEvent(String p0,JSONObject p1){
       JSONObject jSONObject;
       v ov = v.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KsWebViewInitModule$a$a.class, "1")) {
          return;
       }
       if (p0 != null) {
          KsWebViewInitModule$a$a ta = this.a;
          if (PatchProxy.isSupport(ov)) {
             jSONObject = PatchProxy.applyTwoRefs(p1, Boolean.valueOf(ta), null, ov, "6");
             if (jSONObject != PatchProxyResult.class) {
             label_0046 :
                String str = jSONObject.toString();
                a.o(str, "addCommonAttrs\(info, isMainProcess\).toString\(\)");
                if (!PatchProxy.applyVoidTwoRefs(p0, str, null, ov, "3")) {
                   a.p(p0, "key");
                   a.p(str, "value");
                   p0 = "kswebview_event_"+p0+"_2";
                   u1.Q(p0, str);
                   StringBuilder str1 = p0;
                   Log.b("KsWebView", str1+": "+str);
                }
             }
          }
          if (p1 == null) {
             p1 = new JSONObject();
          }
          p1.put("kwsdk_version", KwSdk.getVersionName());
          if (ta != null) {
             p1.put("core_version", v.b);
          }
          jSONObject = p1;
          goto label_0046 ;
       }
       return;
    }
    public void onFirstWebViewCreated(boolean p0){
       KsWebViewInitModule$a$a uoa$a = KsWebViewInitModule$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa$a, "3")) {
          return;
       }
       e.j(new KsWebViewInitModule$a$a$a(p0), "KsWebViewCreated", false);
       return;
    }
    public void onLogging(int p0,String p1,String p2){
       if (PatchProxy.isSupport(KsWebViewInitModule$a$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, KsWebViewInitModule$a$a.class, "2")) {
          return;
       }
       if (!TextUtils.x(p1) && !TextUtils.x(p2)) {
          if (p0 != 4) {
             if (p0 != 5) {
                if (p0 == 6) {
                   Log.d(p1, p2);
                }
             }else {
                Log.n(p1, p2);
             }
          }else {
             Log.g(p1, p2);
          }
       }
       return;
    }
}
