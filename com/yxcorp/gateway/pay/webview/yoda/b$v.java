package com.yxcorp.gateway.pay.webview.yoda.b$v;
import sv8.p0;
import com.yxcorp.gateway.pay.webview.yoda.b;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
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

public class b$v extends p0	// class@0012c5
{
    public final b g;

    public void b$v(b p0,Activity p1,WebView p2,String p3){
       this.g = p0;
       super(p1, p2, p3);
    }
    public void d(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$v.class, "1")) {
       }else {
          g.d("bridge: loadUrlOnBusinessPage. url="+p0.mUrl+", currentUrl="+b.a(this.g).getUrl());
          if (!TextUtils.x(p0.mUrl)) {
             PayManager.getInstance().getPayRetrofitGlobalConfig().processGatewayPayUri(this.g.a, Uri.parse(p0.mUrl));
          }
       }
       return;
    }
}
