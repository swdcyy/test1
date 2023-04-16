package com.yxcorp.gateway.pay.webview.yoda.b$b;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
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
import com.yxcorp.gateway.pay.webview.yoda.c;
import sv8.l0;
import erd.g;
import crd.b;

public class b$b extends p0	// class@0012ac
{
    public final String g;
    public final b h;

    public void b$b(b p0,Activity p1,WebView p2,String p3,String p4){
       this.h = p0;
       this.g = p4;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b.class, "1")) {
       }else {
          g.d("authThirdPartyAccount start, params = "+this.g);
          if (p0 == null) {
             b.f("PayYodaJsBridge", "authThirdPartyAccount  failed, params is null!");
             this.b(p0.mCallback, AuthThirdResult.fail(null, "params is null"));
          }else {
             h.a(this.h.a, p0.mProvider).a(p0.mAuthParam).subscribeOn(d.a).subscribe(new c(this, p0), new l0(this, p0));
          }
       }
       return;
    }
}
