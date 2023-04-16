package com.yxcorp.gateway.pay.webview.b$s;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$s extends d	// class@001291
{
    public final b e;

    public void b$s(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$s.class, "1")) {
       }else {
          g.d("PayJsInject: resetTopButtons: params="+p0);
          this.e.a();
          JsCallbackParams mCallback = p0.mCallback;
          if (mCallback != null) {
             this.b(mCallback, new JsErrorResult(1, ""));
          }
       }
       return;
    }
}
