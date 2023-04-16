package com.yxcorp.gateway.pay.webview.yoda.b$e;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsInjectCookieParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import nv8.b;
import rv8.b;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;

public class b$e extends p0	// class@0012b2
{
    public final b g;

    public void b$e(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
       }else {
          g.d("injectCookie, url ="+p0.mUrl);
          if (!PayManager.getInstance().isKwaiUrl(p0.mUrl)) {
             this.b(p0.mCallback, new JsErrorResult(412, ""));
             b.f("PayYodaJsBridge", "injectCookie error, url is not KwaiUrl");
          }else {
             b.f(p0.mUrl);
             this.b(p0.mCallback, new JsSuccessResult());
          }
       }
       return;
    }
}
