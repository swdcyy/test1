package com.yxcorp.gateway.pay.webview.b$g;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.kwai.sdk.pay.api.parmas.JsIdentityVerifyParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import nv8.b;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.h;
import com.yxcorp.gateway.pay.webview.f;
import android.app.Activity;
import ho7.b;

public class b$g extends d	// class@001285
{
    public final b e;

    public void b$g(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g.class, "1")) {
       }else {
          g.d("startIdentityVerify start");
          String str = "PayJsInject";
          if (TextUtils.x(p0.mUrl)) {
             this.b(p0.mCallback, new JsErrorResult(-1, "invalidate params"));
             str1 = "startIdentityVerify failed, invalid params";
          }else {
             h verifyConfig = PayManager.getInstance().getVerifyConfig();
             if (verifyConfig == null) {
                this.b(p0.mCallback, new JsErrorResult(404, "not support this action"));
                str1 = "startIdentityVerify failed, invalidate verifyConfig";
             }else {
                verifyConfig.c(this.e.a, p0.mUrl, new f(this, p0));
             }
          }
          b.f(str, str1);
       }
       return;
    }
}
