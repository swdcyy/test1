package com.yxcorp.gateway.pay.webview.b$n;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsAppIdentifierParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv8.c;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$n extends d	// class@00128c
{
    public final b e;

    public void b$n(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$n.class, "1")) {
       }else {
          boolean b = c.h(p0.mIdentifier);
          g.d("PayJsInject: hasImportSdk: sdk "+p0.mIdentifier+" support "+b);
          JsAppIdentifierParams mCallback = p0.mCallback;
          JsSuccessResult jsSuccessRes = (b)? new JsSuccessResult(): new JsErrorResult(432, null);
          this.b(mCallback, jsSuccessRes);
       }
       return;
    }
}