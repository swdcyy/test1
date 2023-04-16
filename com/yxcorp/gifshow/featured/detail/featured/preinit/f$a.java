package com.yxcorp.gifshow.featured.detail.featured.preinit.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.Log;
import qvb.n0;
import qvb.a;

public final class f$a	// class@000f51
{
    public t a;

    public void f$a(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, f$a.class, "1")) {
          return;
       }
       Log.g("FeaturedPreInitHelper", "destroy");
       f$a ta = this.a;
       if (ta != null) {
          ta.p0();
          this.a.u1();
          this.a.clear();
          this.a = null;
       }
       return;
    }
}
