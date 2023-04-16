package com.yxcorp.gateway.pay.webview.b$a0;
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
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$a0 extends d	// class@00127d
{
    public final String e;
    public final b f;

    public void b$a0(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a0.class, "1")) {
       }else {
          g.d("PayJsInject: off: params="+this.e);
          JsEventParameter mCallback = p0.mCallback;
          JsSuccessResult jsSuccessRes = (this.f.c.g(p0))? new JsSuccessResult(): new JsErrorResult(-1, "");
          this.b(mCallback, jsSuccessRes);
       }
       return;
    }
}
