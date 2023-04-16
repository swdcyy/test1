package com.yxcorp.gateway.pay.webview.yoda.b$f0;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsEventParameter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$f0 extends p0	// class@0012b3
{
    public final b g;

    public void b$f0(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$f0.class, "1")) {
       }else {
          g.d("bridge: off");
          JsEventParameter mCallback = p0.mCallback;
          JsSuccessResult jsSuccessRes = (this.g.d.g(p0))? new JsSuccessResult(): new JsErrorResult(-1, "");
          this.b(mCallback, jsSuccessRes);
       }
       return;
    }
}
