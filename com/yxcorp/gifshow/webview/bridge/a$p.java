package com.yxcorp.gifshow.webview.bridge.a$p;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.component.JsInjectCookieParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import eyc.a;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import com.kwai.yoda.bridge.YodaBaseWebView;
import com.yxcorp.gifshow.webview.cookie.g;
import com.yxcorp.gifshow.webview.bridge.JsSuccessResult;

public class a$p extends z	// class@00171c
{
    public final a k;

    public void a$p(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$p.class, "1")) {
       }else if(!b.a(-1275906972).isKwaiUrl(p0.mUrl)){
          this.d(p0.mCallback, new JsErrorResult(412, R.string.arg_RES_7f103b10));
       }else {
          g.f(this.k.b, p0.mUrl);
          this.d(p0.mCallback, new JsSuccessResult());
       }
       return;
    }
}
