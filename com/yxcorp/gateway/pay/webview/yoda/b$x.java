package com.yxcorp.gateway.pay.webview.yoda.b$x;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsPhysicalBackButtonParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import lv8.m;
import nv8.b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import sv8.o0;
import com.yxcorp.gateway.pay.webview.PayWebView$a;

public class b$x extends p0	// class@0012c7
{
    public final b g;

    public void b$x(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$x.class, "1")) {
       }else {
          g.d("bridge: setPhysicalBackButton");
          if (!b.a(this.g) instanceof m) {
             b.f("PayYodaJsBridge", "setPhysicalBackButton: webView isn\'t IInteractive");
          }else if(!TextUtils.x(p0.mOnClick)){
             b.a(this.g).setOnBackPressedListener(new o0(this, p0));
          }else {
             b.a(this.g).setOnBackPressedListener(null);
          }
          b.a(this.g).setJsSetPhysicalBack(true);
       }
       return;
    }
}
