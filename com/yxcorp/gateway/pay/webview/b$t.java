package com.yxcorp.gateway.pay.webview.b$t;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsNewPageConfigParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import android.content.Context;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import android.content.Intent;
import android.app.Activity;

public class b$t extends d	// class@001292
{
    public final String e;
    public final b f;

    public void b$t(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$t.class, "1")) {
       }else {
          g.d("PayJsInject: loadUrlOnNewPage: params="+this.e);
          b a = this.f.a;
          PayWebViewActivity$a uoa = PayWebViewActivity.buildWebViewIntent(a, p0.mUrl);
          uoa.b(p0.mType);
          a.startActivity(uoa.a());
       }
       return;
    }
}
