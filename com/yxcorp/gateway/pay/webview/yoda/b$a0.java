package com.yxcorp.gateway.pay.webview.yoda.b$a0;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsContractParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import nv8.b;
import java.lang.StringBuilder;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;

public class b$a0 extends p0	// class@0012a9
{
    public final b g;

    public void b$a0(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a0.class, "1")) {
       }else if(p0 == null){
          b.f("PayYodaJsBridge", "bridge:startContract failed, params is null");
       }else {
          g.d("bridge:startContract, currentUrl="+b.a(this.g).getUrl());
          this.b(p0.mCallback, new JsErrorResult(PayManager.getInstance().contract(p0.mProvider, p0.mProviderConfig, p0.mMethod), ""));
       }
       return;
    }
}
