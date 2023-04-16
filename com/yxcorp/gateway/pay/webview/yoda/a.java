package com.yxcorp.gateway.pay.webview.yoda.a;
import erd.g;
import com.yxcorp.gateway.pay.webview.yoda.b$a;
import com.yxcorp.gateway.pay.params.webview.JsWithDrawBindParams;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import sv8.p0;
import lv8.d;
import com.google.gson.Gson;
import lv8.g;
import nv8.b;

public class a implements g	// class@0012a8
{
    public final JsWithDrawBindParams b;
    public final b$a c;

    public void a(b$a p0,JsWithDrawBindParams p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          JsErrorResult jsErrorResul = new JsErrorResult(-1, p0.getMessage());
          this.c.b(this.b.mCallback, jsErrorResul);
          g.k("ACCOUNT_WITHDRAW_BIND", "FAIL", this.c.g, d.a.q(jsErrorResul));
          b.g("PayYodaJsBridge", "bindWithdrawType failed", p0);
       }
       return;
    }
}
