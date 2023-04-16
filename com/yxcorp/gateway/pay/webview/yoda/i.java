package com.yxcorp.gateway.pay.webview.yoda.i;
import com.yxcorp.gateway.pay.api.PayCallback;
import com.yxcorp.gateway.pay.webview.yoda.b$c0;
import com.yxcorp.gateway.pay.params.GatewayPrepayParams;
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
import nv8.d;
import lv8.d;
import com.google.gson.Gson;
import java.lang.Throwable;
import java.lang.StringBuilder;

public class i implements PayCallback	// class@0012d1
{
    public final GatewayPrepayParams a;
    public final b$c0 b;

    public void i(b$c0 p0,GatewayPrepayParams p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onPayCancel(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "3")) {
          return;
       }
       i tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(0, tb.g.a.getString(R.string.arg_RES_7f103b9a)));
       b.o("PayYodaJsBridge", "startGatewayPayForOrderV2 canceled");
       tb = this.a;
       d.e("TRANSFER_PAYMENT_RESULT", tb.mMerchantId, tb.mOutTradeNo, tb.mProvider, tb.mPayMethod, "CANCEL", null);
       return;
    }
    public void onPayFailure(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "2")) {
          return;
       }
       i tb = this.b;
       tb.b(this.a.mCallback, new JsErrorResult(-1, tb.g.a.getString(R.string.arg_RES_7f103b9b)));
       b.h("PayYodaJsBridge", "startGatewayPayForOrderV2 failed", null, "PayResult", d.a.q(p0));
       i ta = this.a;
       d.e("TRANSFER_PAYMENT_RESULT", ta.mMerchantId, ta.mOutTradeNo, ta.mProvider, ta.mPayMethod, "FAIL", null);
       return;
    }
    public void onPaySuccess(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(1, ""));
       b.o("PayYodaJsBridge", "startGatewayPayForOrderV2 success");
       i ta = this.a;
       d.e("TRANSFER_PAYMENT_RESULT", ta.mMerchantId, ta.mOutTradeNo, ta.mProvider, ta.mPayMethod, "SUCCESS", null);
       return;
    }
    public void onPayUnknown(PayResult p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "4")) {
          return;
       }
       this.b.b(this.a.mCallback, new JsErrorResult(412, ""));
       b.o("PayYodaJsBridge", "startGatewayPayForOrderV2 finished with unknown status. merchantId="+this.a.mMerchantId+", outOrderId="+this.a.mOutTradeNo+", provider="+this.a.mProvider+", payMethod="+this.a.mPayMethod);
       i ta = this.a;
       d.e("TRANSFER_PAYMENT_RESULT", ta.mMerchantId, ta.mOutTradeNo, ta.mProvider, ta.mPayMethod, "UNKNOWN_STATUS", null);
       return;
    }
}
