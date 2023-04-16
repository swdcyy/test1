package com.yxcorp.gateway.pay.webview.yoda.b$y;
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
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$y extends p0	// class@0012c8
{
    public final b g;

    public void b$y(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$y.class, "1")) {
       }else {
          this.g.b();
          JsCallbackParams mCallback = p0.mCallback;
          if (mCallback != null) {
             this.b(mCallback, new JsErrorResult(1, ""));
          }
       }
       return;
    }
}
