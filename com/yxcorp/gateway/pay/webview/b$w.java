package com.yxcorp.gateway.pay.webview.b$w;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.GatewayOrderParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.webview.h;
import android.app.Activity;
import com.yxcorp.gateway.pay.api.PayCallback;

public class b$w extends d	// class@001295
{
    public final b e;

    public void b$w(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$w.class, "1")) {
       }else {
          g.d("startGatewayPayForOrder start");
          PayManager.getInstance().startOrderPay(this.e.a, p0, new h(this, p0));
       }
       return;
    }
}
