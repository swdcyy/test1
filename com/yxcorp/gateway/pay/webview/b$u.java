package com.yxcorp.gateway.pay.webview.b$u;
import rv8.d;
import com.yxcorp.gateway.pay.webview.b;
import com.yxcorp.gateway.pay.activity.PayWebViewActivity;
import java.lang.String;
import java.io.Serializable;
import com.yxcorp.gateway.pay.params.webview.JsNewPageConfigParams;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import lv8.g;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import com.yxcorp.gateway.pay.api.PayManager;
import com.yxcorp.gateway.pay.api.PayRetrofitGlobalConfig;
import android.content.Context;

public class b$u extends d	// class@001293
{
    public final String e;
    public final b f;

    public void b$u(b p0,PayWebViewActivity p1,String p2){
       this.f = p0;
       this.e = p2;
       super(p1);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$u.class, "1")) {
       }else {
          g.d("PayJsInject: loadUrlOnBusinessPage: params="+this.e);
          if (!TextUtils.x(p0.mUrl)) {
             PayManager.getInstance().getPayRetrofitGlobalConfig().processGatewayPayUri(this.f.a, Uri.parse(p0.mUrl));
          }
       }
       return;
    }
}
