package com.yxcorp.gateway.pay.webview.yoda.b$b0;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.GatewayOrderParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.webview.yoda.h;
import com.yxcorp.gateway.pay.api.PayCallback;

public class b$b0 extends p0	// class@0012ab
{
    public final b g;

    public void b$b0(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$b0.class, "1")) {
       }else {
          g.d("bridge:startGatewayPayForOrder start");
          PayManager.getInstance().startOrderPay(this.g.a, p0, new h(this, p0));
       }
       return;
    }
}
