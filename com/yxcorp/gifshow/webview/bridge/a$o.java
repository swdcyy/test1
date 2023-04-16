package com.yxcorp.gifshow.webview.bridge.a$o;
import vxc.z;
import com.yxcorp.gifshow.webview.bridge.a;
import android.app.Activity;
import com.kuaishou.webkit.WebView;
import java.io.Serializable;
import com.yxcorp.gifshow.webview.jsmodel.ui.JsNewPageConfigParams;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.webview.bridge.JsErrorResult;
import com.yxcorp.gateway.pay.api.PayManager;
import android.content.Intent;
import vxc.j;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class a$o extends z	// class@00171b
{
    public final a k;

    public void a$o(a p0,Activity p1,WebView p2){
       this.k = p0;
       super(p1, p2);
    }
    public void i(Serializable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$o.class, "1")) {
       }else {
          a$o tk = this.k;
          JsNewPageConfigParams mCallback = p0.mCallback;
          JsNewPageConfigParams mUrl = p0.mUrl;
          Objects.requireNonNull(tk);
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(this, mCallback, mUrl, Boolean.TRUE, tk, a.class, "8")) {
             if (TextUtils.x(mUrl)) {
                this.d(mCallback, new JsErrorResult(-1, ""));
             }else {
                tk.a.t1(PayManager.getInstance().buildPayWebViewIntent(tk.a, mUrl, true), 16, new j(this, mCallback));
             }
          }
       }
       return;
    }
}
