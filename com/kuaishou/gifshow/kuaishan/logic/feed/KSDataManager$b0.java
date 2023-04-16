package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$b0;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.util.List;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import w46.b;
import com.kuaishou.gifshow.kuaishan.logic.feed.d;
import t36.f$a;
import t36.f;

public final class KSDataManager$b0 implements g	// class@001a12
{
    public final KSDataManager b;
    public final List c;

    public void KSDataManager$b0(KSDataManager p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$b0.class, "1")) {
       }else {
          e.D().e("KSDataManager", "fetchTemplatesByIds templateIds: "+this.c+", "+"Exception", p0);
          this.b.s0(d.a);
       }
       return;
    }
}
