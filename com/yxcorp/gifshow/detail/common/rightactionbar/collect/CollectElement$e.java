package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$e;
import jta.a;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import qp7.x0;
import qp7.b;
import js7.o;

public final class CollectElement$e extends a	// class@001498
{
    public final CollectElement a;

    public void CollectElement$e(CollectElement p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       CollectElement$e uoe = CollectElement$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "2")) {
          return;
       }
       o oo = this.a.E();
       boolean b = (!p0 - 0x3f800000)? true: false;
       oo.i(b);
       return;
    }
    public void c(float p0){
       CollectElement$e uoe = CollectElement$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoe, "1")) {
          return;
       }
       boolean b = true;
       p0 = p0 - 0x3f800000;
       if (p0) {
          this.a.E().j(b);
       }
       o oo = this.a.E();
       if (p0) {
          b = false;
       }
       oo.i(b);
       return;
    }
}
