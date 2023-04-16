package com.yxcorp.gateway.pay.webview.yoda.b$c;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsAppIdentifierParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import lv8.c;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$c extends p0	// class@0012ae
{
    public final b g;

    public void b$c(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          boolean b = c.g(this.g.a, p0.mIdentifier);
          g.d("PayYodaJsBridge: hasInstalledApp: package "+p0.mIdentifier+" install "+b);
          JsAppIdentifierParams mCallback = p0.mCallback;
          JsSuccessResult jsSuccessRes = (b)? new JsSuccessResult(): new JsErrorResult(432, null);
          this.b(mCallback, jsSuccessRes);
       }
       return;
    }
}
