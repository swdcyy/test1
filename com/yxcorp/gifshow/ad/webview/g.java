package com.yxcorp.gifshow.ad.webview.g;
import erd.g;
import com.yxcorp.gifshow.ad.webview.j;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yx.j0;
import k59.n0;
import k59.o0;
import msd.a;
import k59.e2;

public final class g implements g	// class@0018bc
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, j.class, "8")) {
       }else if(tb.x == null){
          p0 = new Object[0];
          j0.c("AdLandingPageFragmentV2", "reload mWebView is null", p0);
       }else {
          tb.q.l(new n0(tb), new o0(tb));
       }
       return;
    }
}
