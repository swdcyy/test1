package com.yxcorp.gifshow.ad.detail.router.AdDetailUriHandler$d;
import erd.g;
import yh7.a;
import qh7.c;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.StringBuilder;
import yx.j0;

public final class AdDetailUriHandler$d implements g	// class@0016e5
{
    public final a b;
    public final c c;

    public void AdDetailUriHandler$d(a p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AdDetailUriHandler$d.class, "1")) {
       }else {
          AdDetailUriHandler$d tb = this.b;
          tb.a = 408;
          this.c.a(tb);
          Object[] objArray = new Object[0];
          j0.c("AdDetailUriHandler", "request photo error :"+p0, objArray);
       }
       return;
    }
}
