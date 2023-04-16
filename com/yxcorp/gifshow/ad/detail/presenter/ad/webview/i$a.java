package com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i$a;
import sl9.b;
import com.yxcorp.gifshow.ad.detail.presenter.ad.webview.i;
import java.lang.Object;
import com.kuaishou.webkit.WebView;
import com.yxcorp.gifshow.webview.api.WebViewFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.ad.webview.o;
import p59.t;
import m59.o;
import k59.e2;
import com.kwai.yoda.bridge.YodaBaseWebView;
import y55.a;
import sl9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class i$a implements b	// class@00164c
{
    public final i a;

    public void i$a(i p0){
       this.a = p0;
       super();
    }
    public void a(WebView p0,WebViewFragment p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i$a.class, "1")) {
          return;
       }
       i$a ta = this.a;
       ta.f = p0;
       i e = ta.e;
       i c = ta.c;
       Objects.requireNonNull(e);
       if (!PatchProxy.applyVoidOneRefs(c, e, o.class, "12")) {
          o c1 = e.c;
          if (c1 != null) {
             c1.g = c;
          }
          e.n = c;
          o oo = e.d();
          if (oo != null) {
             oo.O(c);
          }
       }
       return;
    }
    public void b(YodaBaseWebView p0,a p1){
       a.c(this, p0, p1);
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, i$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.c.j();
    }
}
