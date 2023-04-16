package com.yxcorp.gateway.pay.webview.yoda.b$h;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.h;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import nv8.b;
import android.content.Context;
import java.lang.StringBuilder;
import com.yxcorp.gateway.pay.params.result.JsBiometricResult;

public class b$h extends p0	// class@0012b7
{
    public final b g;

    public void b$h(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$h.class, "1")) {
       }else {
          h verifyConfig = PayManager.getInstance().getVerifyConfig();
          String str = "PayYodaJsBridge";
          if (verifyConfig == null) {
             this.b(p0.mCallback, new JsErrorResult(404, "not support this action"));
             b.f(str, "isBiometricValid failed, invalidate verifyConfig");
          }else {
             b = verifyConfig.b(this.g.a);
             b.o(str, "isBiometricValid result "+b);
             this.b(p0.mCallback, new JsBiometricResult(1, b));
          }
       }
       return;
    }
}
