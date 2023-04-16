package com.yxcorp.gateway.pay.webview.b$e;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsInjectCookieParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import nv8.b;
import rv8.b;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;

public class b$e extends d	// class@001283
{
    public final b e;

    public void b$e(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e.class, "1")) {
       }else {
          g.d("injectCookie, url ="+p0.mUrl);
          if (!PayManager.getInstance().isKwaiUrl(p0.mUrl)) {
             this.b(p0.mCallback, new JsErrorResult(412, ""));
             b.f("PayJsInject", "injectCookie error, url is not KwaiUrl");
          }else {
             b.f(p0.mUrl);
             this.b(p0.mCallback, new JsSuccessResult());
          }
       }
       return;
    }
}
