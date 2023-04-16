package com.yxcorp.gateway.pay.webview.yoda.b$g;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.kwai.sdk.pay.api.parmas.JsIdentityVerifyParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import nv8.b;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.h;
import com.yxcorp.gateway.pay.webview.yoda.f;
import ho7.b;

public class b$g extends p0	// class@0012b6
{
    public final b g;

    public void b$g(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "1")) {
       }else {
          String url = b.a(this.g).getUrl();
          g.d("bridge:startIdentityVerify start¡£url="+url);
          String str = "PayYodaJsBridge";
          if (TextUtils.x(p0.mUrl)) {
             this.b(p0.mCallback, new JsErrorResult(-1, "invalidate params"));
             str1 = "startIdentityVerify failed, invalid params";
          }else {
             h verifyConfig = PayManager.getInstance().getVerifyConfig();
             if (verifyConfig == null) {
                this.b(p0.mCallback, new JsErrorResult(404, "not support this action"));
                str1 = "startIdentityVerify failed, invalidate verifyConfig";
             }else {
                verifyConfig.c(this.g.a, p0.mUrl, new f(this, p0, url));
             }
          }
          b.f(str, str1);
       }
       return;
    }
}
