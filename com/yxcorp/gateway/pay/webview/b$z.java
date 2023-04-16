package com.yxcorp.gateway.pay.webview.b$z;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsEventParameter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$z extends d	// class@001298
{
    public final String e;
    public final b f;

    public void b$z(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       JsEventParameter mCallback;
       JsErrorResult jsErrorResul;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$z.class, "1")) {
       }else {
          g.d("PayJsInject: on: params="+this.e);
          if (TextUtils.x(p0.mType) || TextUtils.x(p0.mHandler)) {
             mCallback = p0.mCallback;
             jsErrorResul = new JsErrorResult(-1, "");
          }else {
             this.f.c.a(p0);
             mCallback = p0.mCallback;
             jsErrorResul = new JsSuccessResult();
          }
          this.b(mCallback, jsErrorResul);
       }
       return;
    }
}
