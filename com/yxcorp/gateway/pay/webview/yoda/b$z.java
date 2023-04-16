package com.yxcorp.gateway.pay.webview.yoda.b$z;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsNewPageConfigParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import lv8.g;
import android.content.Context;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity$a;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import android.content.Intent;

public class b$z extends p0	// class@0012c9
{
    public final b g;

    public void b$z(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$z.class, "1")) {
       }else if(TextUtils.x(p0.mUrl)){
          g.d("bridge: loadUrlOnNewPage. url="+p0.mUrl+", currentUrl="+b.a(this.g).getUrl());
          b a = this.g.a;
          PayWebViewActivity$a uoa = PayWebViewActivity.buildWebViewIntent(a, p0.mUrl);
          uoa.b(p0.mType);
          a.startActivity(uoa.a());
       }
       return;
    }
}
