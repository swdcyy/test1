package com.yxcorp.gateway.pay.webview.yoda.b$d;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.l;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import nv8.b;
import com.yxcorp.gateway.pay.webview.yoda.d;
import ho7.c;

public class b$d extends p0	// class@0012b0
{
    public final b g;

    public void b$d(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else {
          g.d("bindPhone start");
          String str = "BIZ_BIND_PHONE";
          g.i(str, "START");
          l withDrawConf = PayManager.getInstance().getWithDrawConfig();
          if (withDrawConf == null) {
             this.b(p0.mCallback, new JsErrorResult(404, this.g.a.getString(R.string.arg_RES_7f103b99)));
             b.f("PayYodaJsBridge", "bindPhone failed, not support this operation!");
             g.i(str, "FAIL");
          }else {
             withDrawConf.a(this.g.a, new d(this, p0));
          }
       }
       return;
    }
}
