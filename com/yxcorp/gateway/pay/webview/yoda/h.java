package com.yxcorp.gateway.pay.webview.yoda.h;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.webview.yoda.b$b0;
import com.yxcorp.gateway.pay.params.GatewayOrderParams;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import sv8.p0;
import nv8.b;
import lv8.d;
import com.google.gson.Gson;
import java.lang.Throwable;

public class h implements PayCallback	// class@0012d0
{
    public final GatewayOrderParams a;
    public final b$b0 b;

    public void h(b$b0 p0,GatewayOrderParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       h tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(0, tb.g.a.getString(R.string.arg_RES_7f103b9a)));
       b.o("PayYodaJsBridge", "startGatewayPayForOrder canceled");
       return;
    }
    public void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       h tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(-1, tb.g.a.getString(R.string.arg_RES_7f103b9b)));
       b.h("PayYodaJsBridge", "startGatewayPayForOrder failed", null, "PayResult", d.a.q(p0));
       return;
    }
    public void onPaySuccess(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(1, ""));
       b.o("PayYodaJsBridge", "startGatewayPayForOrder success");
       return;
    }
    public void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(412, ""));
       b.o("PayYodaJsBridge", "startGatewayPayForOrder finished with unknown status");
       return;
    }
}
