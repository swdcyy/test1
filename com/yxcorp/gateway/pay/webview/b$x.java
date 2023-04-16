package com.yxcorp.gateway.pay.webview.b$x;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.GatewayPrepayParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lv8.g;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.webview.i;
import android.app.Activity;
import com.yxcorp.gateway.pay.api.PayCallback;

public class b$x extends d	// class@001296
{
    public final b e;

    public void b$x(b p0,PayWebViewActivity p1){
       this.e = p0;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$x.class, "1")) {
       }else {
          g.d("startGatewayPayForOrderV2 start");
          PayManager.getInstance().startOrderPayV2(this.e.a, p0, new i(this, p0));
       }
       return;
    }
}
