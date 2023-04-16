package com.kuaishou.live.webview.jsbridge.LiveWebSubscribeChannelBridge$a;
import crd.b;
import o63.a;
import com.kwai.yoda.YodaWebView;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o63.f;

public final class LiveWebSubscribeChannelBridge$a implements b	// class@001006
{
    public boolean b;
    public final a c;
    public final YodaWebView d;
    public final String e;

    public void LiveWebSubscribeChannelBridge$a(a p0,YodaWebView p1,String p2){
       a.p(p0, "jsBridgeService");
       a.p(p1, "webView");
       a.p(p2, "subscribeId");
       super();
       this.c = p0;
       this.d = p1;
       this.e = p2;
    }
    public void dispose(){
       if (PatchProxy.applyVoid(null, this, LiveWebSubscribeChannelBridge$a.class, "1")) {
          return;
       }
       f uof = this.c.j9(this.e);
       if (uof != null) {
          uof.b(this.e);
       }
       this.b = true;
       return;
    }
    public boolean isDisposed(){
       return this.b;
    }
}
