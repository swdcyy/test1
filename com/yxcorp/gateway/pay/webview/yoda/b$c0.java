package com.yxcorp.gateway.pay.webview.yoda.b$c0;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.GatewayPrepayParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import nv8.d;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.webview.yoda.i;
import com.yxcorp.gateway.pay.api.PayCallback;

public class b$c0 extends p0	// class@0012ad
{
    public final b g;

    public void b$c0(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c0.class, "1")) {
       }else {
          g.d("bridge:startGatewayPayForOrderV2 start. merchantId="+p0.mMerchantId+", outOrderId="+p0.mOutTradeNo+", provider="+p0.mProvider+", payMethod="+p0.mPayMethod);
          d.e("BRIDGE_START_ORDER_PAY_V2_RECEIVE", p0.mMerchantId, p0.mOutTradeNo, p0.mProvider, p0.mPayMethod, null, null);
          PayManager.getInstance().startOrderPayV2(this.g.a, p0, new i(this, p0));
       }
       return;
    }
}
