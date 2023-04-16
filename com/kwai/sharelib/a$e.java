package com.kwai.sharelib.a$e;
import erd.g;
import com.kwai.sharelib.a;
import uo7.h0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.sharelib.KsShareApi;
import uo7.k;
import uo7.u;

public final class a$e implements g	// class@0016a8
{
    public final a b;
    public final h0 c;
    public final ShareInitResponse$SharePanelElement d;

    public void a$e(a p0,h0 p1,ShareInitResponse$SharePanelElement p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$e.class, "1")) {
       }else {
          KsShareApi.s.f();
          a$e tb = this.b;
          tb.h(tb.g, this.d, false, p0);
          tb = this.b;
          tb.h.e(tb.g, this.d, p0);
          PatchProxy.onMethodExit(a$e.class, "1");
       }
       return;
    }
}
