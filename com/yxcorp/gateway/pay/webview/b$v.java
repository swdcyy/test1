package com.yxcorp.gateway.pay.webview.b$v;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsContractParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv8.g;
import nv8.b;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;

public class b$v extends d	// class@001294
{
    public final b e;

    public void b$v(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$v.class, "1")) {
       }else {
          g.d("startContract");
          if (p0 == null) {
             b.o("PayJsInject", "startContract failed, params is null");
          }else {
             PayManager.getInstance().contract(p0.mProvider, p0.mProviderConfig, p0.mMethod);
             this.b(p0.mCallback, new JsSuccessResult());
          }
       }
       return;
    }
}
