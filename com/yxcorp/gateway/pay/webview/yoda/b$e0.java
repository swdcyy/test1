package com.yxcorp.gateway.pay.webview.yoda.b$e0;
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
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gateway.pay.webview.JsNativeEventCommunication;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$e0 extends p0	// class@0012b1
{
    public final b g;

    public void b$e0(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       JsEventParameter mCallback;
       JsErrorResult jsErrorResul;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$e0.class, "1")) {
       }else {
          g.d("bridge: on");
          if (TextUtils.x(p0.mType) || TextUtils.x(p0.mHandler)) {
             mCallback = p0.mCallback;
             jsErrorResul = new JsErrorResult(-1, "");
          }else {
             this.g.d.a(p0);
             mCallback = p0.mCallback;
             jsErrorResul = new JsSuccessResult();
          }
          this.b(mCallback, jsErrorResul);
       }
       return;
    }
}
