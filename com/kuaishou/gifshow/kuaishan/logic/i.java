package com.kuaishou.gifshow.kuaishan.logic.i;
import erd.g;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX;
import com.kuaishou.gifshow.kuaishan.logic.KSDownloadHelperX$a;

public final class i implements g	// class@001a53
{
    public final KSTemplateDetailInfo b;

    public void i(KSTemplateDetailInfo p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "1")) {
       }else {
          KSDownloadHelperX.o.g(p0, this.b.getUniqueIdentifier());
       }
       return;
    }
}
