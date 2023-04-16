package com.yxcorp.gateway.pay.webview.b$r;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsPhysicalBackButtonParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import rv8.k;
import com.yxcorp.gateway.pay.webview.PayWebView$a;
import com.yxcorp.gateway.pay.webview.PayWebView;

public class b$r extends d	// class@001290
{
    public final String e;
    public final b f;

    public void b$r(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$r.class, "1")) {
       }else {
          g.d("PayJsInject: setPhysicalBackButton: params="+this.e);
          if (!TextUtils.x(p0.mOnClick)) {
             this.f.a.mWebView.setOnBackPressedListener(new k(this, p0));
          }else {
             this.f.a.mWebView.setOnBackPressedListener(null);
          }
          this.f.a.mWebView.setJsSetPhysicalBack(true);
       }
       return;
    }
}
