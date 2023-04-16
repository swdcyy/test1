package com.yxcorp.gateway.pay.webview.b$b0;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsEmitParameter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import rv8.c;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;

public class b$b0 extends d	// class@00127f
{
    public final String e;
    public final b f;

    public void b$b0(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b0.class, "1")) {
       }else {
          g.d("PayJsInject: emit: params="+this.e);
          if (p0 != null) {
             c.a().onEvent(p0);
             this.b(p0.mCallback, new JsSuccessResult());
          }
       }
       return;
    }
}
