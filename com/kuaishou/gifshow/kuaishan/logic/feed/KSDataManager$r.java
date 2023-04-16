package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$r;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.feed.b;
import t36.f$a;
import t36.f;

public final class KSDataManager$r implements g	// class@001a33
{
    public final KSDataManager b;

    public void KSDataManager$r(KSDataManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$r.class, "1")) {
       }else {
          e.D().e("KSDataManager", "error fetching group list", p0);
          this.b.s0(b.a);
       }
       return;
    }
}
