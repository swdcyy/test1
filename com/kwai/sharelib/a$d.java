package com.kwai.sharelib.a$d;
import erd.g;
import com.kwai.sharelib.a;
import uo7.h0;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import java.lang.Object;
import uo7.k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Throwable;
import uo7.u;

public final class a$d implements g	// class@0016a7
{
    public final a b;
    public final h0 c;
    public final ShareInitResponse$SharePanelElement d;

    public void a$d(a p0,h0 p1,ShareInitResponse$SharePanelElement p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$d.class, "1")) {
       }else {
          p0 = this.b;
          p0.h.e(p0.g, this.d, null);
          p0 = this.b;
          p0.h(p0.g, this.d, false, null);
          PatchProxy.onMethodExit(a$d.class, "1");
       }
       return;
    }
}
