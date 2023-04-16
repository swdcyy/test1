package com.yxcorp.gateway.pay.webview.i;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.webview.b$x;
import com.yxcorp.gateway.pay.params.GatewayPrepayParams;
import java.lang.Object;
import com.yxcorp.gateway.pay.params.PayResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gateway.pay.params.result.JsErrorResult;
import com.yxcorp.gateway.pay.webview.b;
import android.app.Activity;
import rv8.d;
import nv8.b;

public class i implements PayCallback	// class@0012a0
{
    public final GatewayPrepayParams a;
    public final b$x b;

    public void i(b$x p0,GatewayPrepayParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       i tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(0, tb.e.a.getString(R.string.arg_RES_7f103b9a)));
       b.o("PayJsInject", "startGatewayPayForOrderV2 canceled");
       return;
    }
    public void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       i tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(-1, tb.e.a.getString(R.string.arg_RES_7f103b9b)));
       b.f("PayJsInject", "startGatewayPayForOrderV2 failed");
       return;
    }
    public void onPaySuccess(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(1, ""));
       b.o("PayJsInject", "startGatewayPayForOrderV2 success");
       return;
    }
    public void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(412, ""));
       b.o("PayJsInject", "startGatewayPayForOrderV2 finished with unknown status");
       return;
    }
}
