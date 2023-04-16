package com.yxcorp.gateway.pay.webview.b$j;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;

public class b$j extends d	// class@001288
{
    public final b e;

    public void b$j(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$j.class, "1")) {
       }else {
          g.d("PayJsInject exitWebView");
          this.e.a.finish();
       }
       return;
    }
}
