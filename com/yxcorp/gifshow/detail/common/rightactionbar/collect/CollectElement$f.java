package com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement$f;
import erd.g;
import com.yxcorp.gifshow.detail.common.rightactionbar.collect.CollectElement;
import java.lang.Object;
import com.kuaishou.android.model.mix.PhotoMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qp7.x0;
import qp7.b;
import js7.o;
import com.yxcorp.gifshow.entity.QPhoto;

public final class CollectElement$f implements g	// class@001499
{
    public final CollectElement b;

    public void CollectElement$f(CollectElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, CollectElement$f.class, "1")) {
       }else {
          this.b.o0();
          this.b.E().l(CollectElement.n0(this.b).isCollected());
          this.b.E().m(CollectElement.n0(this.b).numberOfCollects());
          PatchProxy.onMethodExit(CollectElement$f.class, "1");
       }
       return;
    }
}
