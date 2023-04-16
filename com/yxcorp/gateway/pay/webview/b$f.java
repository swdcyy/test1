package com.yxcorp.gateway.pay.webview.b$f;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
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
import com.yxcorp.gateway.pay.webview.e;
import android.app.Activity;
import ho7.a;

public class b$f extends d	// class@001284
{
    public final String e;
    public final b f;

    public void b$f(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f.class, "1")) {
       }else {
          g.d("verifyRealNameInfo start");
          String str = "WEBCLOUD_FACE_VERIFY";
          g.j(str, "START", this.e);
          JsVerifyRealNameInfoParams mInputData = p0.mInputData;
          String str1 = "FAIL";
          if (mInputData == null || mInputData.mResult != 1) {
             this.b(p0.mCallback, new JsErrorResult(-1, "invalidate params"));
             g.d("verifyRealNameInfo failed, invalidate params");
             g.j(str, str1, this.e);
          }else {
             h verifyConfig = PayManager.getInstance().getVerifyConfig();
             if (verifyConfig == null) {
                JsErrorResult jsErrorResul = new JsErrorResult(404, "not support this action");
                this.b(p0.mCallback, jsErrorResul);
                b.f("PayJsInject", "verifyRealNameInfo failed, invalid verifyConfig");
                g.k(str, str1, this.e, d.a.q(jsErrorResul));
             }else {
                verifyConfig.a(this.f.a, p0.mInputData, new e(this, p0));
             }
          }
       }
       return;
    }
}
