package com.kuaishou.gifshow.kuaishan.logic.k;
import erd.g;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;

public final class k implements g	// class@001a59
{
    public final KSTemplateDetailInfo b;

    public void k(KSTemplateDetailInfo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          KSDownloadHelperX.o.g(p0, this.b.getUniqueIdentifier());
       }
       return;
    }
}
