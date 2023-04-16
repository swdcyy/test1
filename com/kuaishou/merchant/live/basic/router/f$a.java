package com.kuaishou.merchant.live.basic.router.f$a;
import erd.g;
import com.kuaishou.merchant.router.base.RouterRequest;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import us3.h;
import java.util.HashMap;
import us3.f;

public final class f$a implements g	// class@0018c5
{
    public final RouterRequest b;

    public void f$a(RouterRequest p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
       }else {
          h oh = new h();
          HashMap hashMap = new HashMap();
          hashMap.put("openResult", p0);
          oh.b = hashMap;
          p0 = this.b.b();
          if (p0 != null) {
             p0.a(oh);
          }
       }
       return;
    }
}
