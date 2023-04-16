package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$j0;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.String;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.feed.h;
import t36.f$a;
import t36.f;

public final class KSDataManager$j0 implements g	// class@001a22
{
    public final KSDataManager b;
    public final String c;

    public void KSDataManager$j0(KSDataManager p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$j0.class, "1")) {
       }else {
          e.D().e("KSDataManager", "fetchTemplatesZTById effectId: "+this.c+", Exception: "+"", p0);
          this.b.s0(h.a);
       }
       return;
    }
}
