package com.yxcorp.gateway.pay.webview.b$b;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JSAuthThirdAccountParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import nv8.b;
import com.yxcorp.gateway.pay.params.result.AuthThirdResult;
import com.yxcorp.gateway.pay.activity.BaseActivity;
import tv8.g;
import tv8.h;
import brd.t;
import t45.d;
import brd.z;
import com.yxcorp.gateway.pay.webview.c;
import rv8.h;
import erd.g;
import crd.b;

public class b$b extends d	// class@001280
{
    public final String e;
    public final b f;

    public void b$b(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          g.d("authThirdPartyAccount start, params = "+this.e);
          if (p0 == null) {
             b.f("PayJsInject", "authThirdPartyAccount  failed, params is null!");
             this.b(p0.mCallback, AuthThirdResult.fail(null, "params is null"));
          }else {
             h.a(this.f.a, p0.mProvider).a(p0.mAuthParam).subscribeOn(d.a).subscribe(new c(this, p0), new h(this, p0));
          }
       }
       return;
    }
}
