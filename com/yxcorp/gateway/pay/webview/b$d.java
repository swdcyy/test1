package com.yxcorp.gateway.pay.webview.b$d;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsCallbackParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.api.PayManager;
import go7.l;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import android.app.Activity;
import nv8.b;
import lv8.g;
import com.yxcorp.gateway.pay.webview.d;
import ho7.c;

public class b$d extends d	// class@001282
{
    public final b e;

    public void b$d(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$d.class, "1")) {
       }else {
          l withDrawConf = PayManager.getInstance().getWithDrawConfig();
          if (withDrawConf == null) {
             this.b(p0.mCallback, new JsErrorResult(404, this.e.a.getString(R.string.arg_RES_7f103b99)));
             b.f("PayJsInject", "bindPhone failed, not support this operation!");
             g.i("BIZ_BIND_PHONE", "FAIL");
          }else {
             withDrawConf.a(this.e.a, new d(this, p0));
          }
       }
       return;
    }
}
