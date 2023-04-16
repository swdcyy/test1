package com.yxcorp.gateway.pay.webview.h;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.webview.b$w;
import com.yxcorp.gateway.pay.params.GatewayOrderParams;
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

public class h implements PayCallback	// class@00129f
{
    public final GatewayOrderParams a;
    public final b$w b;

    public void h(b$w p0,GatewayOrderParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "3")) {
          return;
       }
       h tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(0, tb.e.a.getString(R.string.arg_RES_7f103b9a)));
       b.o("PayJsInject", "startGatewayPayForOrder canceled");
       return;
    }
    public void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       h tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(-1, tb.e.a.getString(R.string.arg_RES_7f103b9b)));
       b.f("PayJsInject", "startGatewayPayForOrder failed");
       return;
    }
    public void onPaySuccess(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(1, ""));
       b.o("PayJsInject", "startGatewayPayForOrder success");
       return;
    }
    public void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(412, ""));
       b.o("PayJsInject", "startGatewayPayForOrder finished with unknown status");
       return;
    }
}
