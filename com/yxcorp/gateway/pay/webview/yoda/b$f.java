package com.yxcorp.gateway.pay.webview.yoda.b$f;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.kwai.sdk.pay.api.parmas.JsVerifyRealNameInfoParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.kwai.sdk.pay.api.parmas.JsVerifyRealNameInfoParams$InputData;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.h;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import nv8.b;
import lv8.d;
import com.google.gson.Gson;
import com.yxcorp.gateway.pay.webview.yoda.e;
import ho7.a;

public class b$f extends p0	// class@0012b4
{
    public final String g;
    public final b h;

    public void b$f(b p0,Activity p1,WebView p2,String p3,String p4){
       this.h = p0;
       this.g = p4;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "1")) {
       }else {
          g.d("verifyRealNameInfo start");
          String str = "WEBCLOUD_FACE_VERIFY";
          g.j(str, "START", this.g);
          JsVerifyRealNameInfoParams mInputData = p0.mInputData;
          String str1 = "FAIL";
          if (mInputData == null || mInputData.mResult != 1) {
             this.b(p0.mCallback, new JsErrorResult(-1, "invalidate params"));
             g.d("verifyRealNameInfo failed, invalidate params");
             g.j(str, str1, this.g);
          }else {
             h verifyConfig = PayManager.getInstance().getVerifyConfig();
             if (verifyConfig == null) {
                JsErrorResult jsErrorResul = new JsErrorResult(404, "not support this action");
                this.b(p0.mCallback, jsErrorResul);
                b.f("PayYodaJsBridge", "verifyRealNameInfo failed, invalid verifyConfig");
                g.k(str, str1, this.g, d.a.q(jsErrorResul));
             }else {
                verifyConfig.a(this.h.a, p0.mInputData, new e(this, p0));
             }
          }
       }
       return;
    }
}
