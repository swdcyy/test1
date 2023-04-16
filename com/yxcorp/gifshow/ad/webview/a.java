package com.yxcorp.gifshow.ad.webview.a;
import erd.g;
import com.yxcorp.gifshow.ad.webview.f;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k59.x;
import k59.y;
import msd.a;
import k59.e2;
import yx.j0;

public final class a implements g	// class@0018b1
{
    public final f b;

    public void a(f p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, f.class, "11")) {
       }else if(tb.t == null || tb.v == null){
          p0 = new Object[0];
          j0.c("AdLandingPageFragment", "reload mWebView os mWebViewFragment fragment is null", p0);
       }else {
          tb.q.l(new x(tb), new y(tb));
       }
       return;
    }
}
