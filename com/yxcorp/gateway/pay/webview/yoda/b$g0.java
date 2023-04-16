package com.yxcorp.gateway.pay.webview.yoda.b$g0;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsEmitParameter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import rv8.c;
import com.yxcorp.gateway.pay.params.result.JsSuccessResult;

public class b$g0 extends p0	// class@0012b5
{
    public final b g;

    public void b$g0(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$g0.class, "1")) {
       }else {
          g.d("bridge: emit");
          if (p0 != null) {
             c.a().onEvent(p0);
             this.b(p0.mCallback, new JsSuccessResult());
          }
       }
       return;
    }
}
