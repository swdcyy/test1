package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$g0;
import erd.g;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Collection;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;

public final class KSDataManager$g0 implements g	// class@001a1c
{
    public final KSDataManager b;

    public void KSDataManager$g0(KSDataManager p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KSDataManager$g0.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.isEmpty() ^ 0x01) {
             this.b.n = p0.get(0);
             p0.mTemplateSrc = "1";
          }
       }
       return;
    }
}
