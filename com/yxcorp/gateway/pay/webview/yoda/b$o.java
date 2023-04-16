package com.yxcorp.gateway.pay.webview.yoda.b$o;
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
import lv8.c;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$o extends p0	// class@0012be
{
    public final b g;

    public void b$o(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$o.class, "1")) {
       }else {
          boolean b = c.h(p0.mIdentifier);
          g.d("PayYodaJsBridge: hasImportSdk: sdk "+p0.mIdentifier+" support "+b);
          JsAppIdentifierParams mCallback = p0.mCallback;
          JsSuccessResult jsSuccessRes = (b)? new JsSuccessResult(): new JsErrorResult(432, null);
          this.b(mCallback, jsSuccessRes);
       }
       return;
    }
}
