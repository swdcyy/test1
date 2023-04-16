package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a0;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.logic.feed.c;
import t36.f$a;
import t36.f;

public final class KSDataManager$a0 implements g	// class@001a10
{
    public final KSDataManager b;

    public void KSDataManager$a0(KSDataManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$a0.class, "1")) {
       }else {
          this.b.s0(new c(p0));
       }
       return;
    }
}
